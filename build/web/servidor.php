<?php

$numId=$_GET["numId"];
$wordId=$_GET["wordId"];
$valor=$_GET["valor"];

$mysqli = new mysqli("localhost", "root", "", "catalogoquimica");
if ($mysqli->connect_errno)
{
    echo "Error para conectarse en la base de datos:(".$mysqli->connect_errno.")".$mysqli->connect_error;
}

$result = $mysqli->query("update catalogo set $wordId='$valor' where id='$numId'");

echo valor;

?>