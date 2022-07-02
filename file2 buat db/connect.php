<?php

$servername = "localhost";
$username = "id9889813_root";
$password = "P@ladin123m1l45";
$database = "id9889813_project123";

$con = new mysqli($servername, $username, $password, $database);

// Check connection
if ($con->connect_error) {
    die("Connection failed: " . $con->connect_error);
}
?>

