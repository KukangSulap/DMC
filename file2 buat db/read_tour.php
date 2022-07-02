<?php

header("Content-type:application/json");

require_once ('connect.php');

$query = mysqli_query($con,"SELECT * FROM tour");


$response ["tourSpot"] = array();

while($row = mysqli_fetch_assoc($query)) {

    array_push($response ["tourSpot"],array
    	(
        'id_tour' => $row['id_tour'],
        'tour_name' => $row['tour_name'],
        'tour_desc' => $row['tour_desc'],
        'tour_rating' => $row['tour_rating'],
    )
    );
}

echo json_encode($response);

?>