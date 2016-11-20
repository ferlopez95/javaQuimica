/**
 * Created by Edgardo on 14/11/16.
 */

var arregloPedido = {};
var pedidoTotal = 0;
function getPedido() {
    $(".selected").each(function (index) {
        var id = $(this).attr('id');
        var cantidad = parseInt($('.c' + id).text());
        arregloPedido[id] = cantidad;
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
        if (arregloPedido != undefined) {

            var email = $('#email').val();
            var matricula = $('#matricula').val();
            var maestro = $('#profesor').val();
         
            if ( email && matricula && maestro ) {
                arregloPedido['email'] = email;
                arregloPedido['matricula'] = matricula;
                arregloPedido['profesor'] = maestro;
                console.log(arregloPedido);

                $.ajax({
                    url: 'Controlador?operacion=separar',
                    data: arregloPedido,
                    type: 'GET',
                    error: function () {
                        alert('error');
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
