/**
 * Created by Edgardo on 14/11/16.
 */


$(document).ready(function () {
    $('#material').click(function () {
        $('#materialesA').show();

        $('#elementosM').hide().removeClass('active');

    });
    $('#elementos').click(function () {
        $('#elementosM').show();
        $('#materialesA').hide().removeClass('active');
    });

    $('plus').click(function () {
        var trid = $(this).closest('tr').attr('id'); // table row ID 
        $('#' + trid).addClass('selected');
    });






    $('.ordenar').click(function () {
        $(".selected").each(function (index) {
            console.log(index + ": " + $(this).text());
        });

        swal(
                'Excelente!',
                'Tus productos has sido enviados al administrados',
                'success'
                )
    });
});
