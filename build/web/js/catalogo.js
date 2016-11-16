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
    
    

    $('#ordenar').click(function () {
        swal(
                'Excelente!',
                'Tus productos has sido enviados al administrados',
                'success'
                )
    });
});
