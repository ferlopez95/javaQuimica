/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

    $('#btBuscar').click(function () {
        var matricula = $('#matricula').val();
        window.location.href = "Controlador?operacion=misPedidos&matricula=" +matricula;
        
    });
});