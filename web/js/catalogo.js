/**
 * Created by Edgardo on 14/11/16.
 */

var arregloPedido = {};
var arregloDatos = {};
var pedidoTotal = 0;
function getPedido() {
    var i = 0;
    $(".selected").each(function (index) {
        var id = $(this).attr('id');
        var cantidad = parseInt($('.c' + id).text());
        arregloPedido[id] = cantidad;


        // arregloPedido[id] = cantidad;
    });
    $('#datos').show('100');
    console.log(arregloPedido);
}
;

$(document).ready(function () {
    $('#material').click(function () {
        $('#materialesA').show();

        $('#elementosM').hide().removeClass('active');

    });
    $('#elementos').click(function () {
        $('#elementosM').show();
        $('#materialesA').hide().removeClass('active');
    });

    $("body").on("click", ".plus", function () {
        var trid = $(this).closest('tr').attr('id'); // table row ID 
        var value = parseInt($('.c' + trid).text());
        $('.c' + trid).text(value + 1).trigger('change');
        $('#' + trid).addClass('selected');
    });

    $("body").on("click", ".minus", function () {
        var trid = $(this).closest('tr').attr('id'); // table row ID 
        var value = parseInt($('.c' + trid).text());
        if (value != 0) {
            $('.c' + trid).text(value - 1).trigger('change');
        } else {
            $('.c' + trid).text("0").trigger('change');

            $('#' + trid).removeClass("selected");
        }
    });


    $('.ordenar').click(function () {
        getPedido();
    });

    $('#btSend').click(function () {
        getPedido();

        console.log(arregloPedido);


        var array = $.map(arregloPedido, function (value, index) {
            return [value];
        });

        if (arregloPedido != undefined) {

            var email = $('#email').val();
            var matricula = $('#matricula').val();
            var nombre = $('#nombre').val();
            arregloDatos['pedido']= arregloPedido;
            if (email && matricula && nombre) {
                arregloDatos['email'] = email;
                arregloDatos['matricula'] = matricula;
                arregloDatos['nombre'] = nombre;
                
                var datos = JSON.stringify(arregloDatos);

                $.ajax({
                    url: "Controlador",
                    type: "POST",
                    dataType: 'json',
                    data: {json: datos},
                    success: function (data) {
                        alert("woow!");
                    }
                });

                arregloPedido = {};
            } else {
                alert("Datos incompletos");
            }

        } else {
            alert("No has seleccionado ningun elemento");
        }


        return false;

    });

});
