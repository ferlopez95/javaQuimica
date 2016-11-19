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

    $('.plus').click(function () {
        var trid = $(this).closest('tr').attr('id'); // table row ID 
        var value = $(this).closest('.qty').val();

        $(this).closest('.qty').val(value + 1);
        $('#' + trid).addClass('selected');
    });
    $('.plus').click(function () {
        var trid = $(this).closest('tr').attr('id'); // table row ID 
        var value = $(this).closest('.qty').val();
        if (value != 0) {
            $(this).closest('.qty').val(value - 1);

        } else {
            $(this).closest('.qty').val(0);

            $('#' + trid).removeClass( "selected" );
        }


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
