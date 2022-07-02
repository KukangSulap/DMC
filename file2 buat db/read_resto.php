<?php

header("Content-type:application/json");

require_once ('connect.php');

$query = mysqli_query($con,"SELECT * FROM restoran");


$response ["resto"] = array();

while($row = mysqli_fetch_assoc($query)) {

    array_push($response["resto"],array
    	(
        'id_resto' => $row['id_resto'],
        'resto_name' => $row['resto_name'],
        'resto_desc' => $row['resto_desc'],
        'resto_rating' => $row['resto_rating'],
        )
    );
}

echo json_encode($response);

?>