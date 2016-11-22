/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function trim(value) {
    var temp = value;
    var obj = /^(\s*)([\W\w]*)(\b\s*$)/;
    if (obj.test(temp)) {
        temp = temp.replace(obj, '$2');
    }
    var obj = /  /g;
    while (temp.match(obj)) {
        temp = temp.replace(obj, " ");
    }
    return temp;
}

//Funcion para calcular el largo en pixels det texto dado
function getTextWidth(texto)
{
    //Valor por default : 150 pixels
    var ancho = 150;

    if (trim(texto) == "")
    {
        return ancho;
    }

    //Creaci?n de un span escondido que se puedr? medir 
    var span = document.createElement("span");
    span.style.visibility = "hidden";
    span.style.position = "absolute";

    //Se agrega el texto al span y el span a la p?gina
    span.appendChild(document.createTextNode(texto));
    document.getElementsByTagName("body")[0].appendChild(span);

    //tama?o del texto
    ancho = span.offsetWidth;

    //Eliminaci?n del span
    document.getElementsByTagName("body")[0].removeChild(span);
    span = null;

    return ancho;
}


//Funcion de modificacion del elemento seleccionado mediante doble-click
function modificar(obj)
{
    var objectId = obj.id;

    var numberId = objectId.substr(objectId.length - 1);
    var wordID = objectId.slice(0, -2);

    //Objeto que sirve para editar el valor en la pagina 
    var input = null;

    input = document.createElement("input");

    //Asignar en la caja el valor de la casilla
    if (obj.innerText)
        input.value = obj.innerText;
    else
        input.value = obj.textContent;
    input.value = trim(input.value);

    //a la caja INPUT se la asigna un tama?o un poco mayor que el texto a modificar
    input.style.width = getTextWidth(input.value) + 30 + "px";

    //Se remplaza el texto por el objeto INPUT
    obj.replaceChild(input, obj.firstChild);

    //Se selecciona el elemento y el texto a modificar
    input.focus();
    input.select();

    //Asignaci?n de los 2 eventos que provocar?n la escritura en la base de datos

    //Salida de la INPUT
    input.onblur = function salir()
    {
        salvarMod(obj, input.value, numberId, wordID);
        alert("Borrar input1")

        delete input;
        alert("Borrar input2")
    };

    //La tecla Enter
    input.onkeydown = function keyDown(event)
    {
        if (event.keyCode == 13)
        {
            salvarMod(obj, input.value, numberId, wordID);
            delete input;
        }
    };
}

//Salvando las modificaciones
function salvarMod(obj, valor, numId, wordId)
{
    url = "servidor.php?numId=" + numId + "&wordId=" + wordId + "&valor=" + valor;

    xh = new XMLHttpRequest();
    xh.open("GET", url, true);
    xh.onload = desplegar;
    xh.send();

}

function desplegar(obj)
{
    respuesta = this.responseText();
    obj.replaceChild(document.createTextNode(respuesta), obj.firstChild);
}

function salvarMod(obj, valor, numId, wordId)
{
    url = "Controlador?operacion=guardarCambios&numId=" + numId + "&wordId=" + wordId + "&valor=" + valor;

    xh = new XMLHttpRequest();
    xh.open("GET", url, true);
    xh.onload = desplegar;
    xh.send();

}