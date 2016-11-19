/**
 * Created by Edgardo on 14/11/16.
 */

var arregloPedido = {};
var pedidoTotal = 0;
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
        $(".selected").each(function (index) {
            var id = $(this).attr('id');
            var cantidad = parseInt($('.c' + id).text())
            arregloPedido[id] = cantidad;
        });
        $('#datos').show('100');
        console.log(arregloPedido);
    });

    $('sendDatos').submit(function (event) {
       
        //event.preventDefault();

        var datos = {};
        var objName;
        var objValue;
        $(this).find(':input').each(function () {
            objName = $(this).attr('name');
            objValue = $(this).val();
            datos[objName] = objValue;
        });
        
        console.log(datos);
        
        return false;

    });

});
