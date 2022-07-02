<?php

header("Content-type:application/json");

require_once ('connect.php');

$query = mysqli_query($con,"SELECT * FROM hotels");


$response["hotel"] = array();

while($row = mysqli_fetch_assoc($query)) {

    array_push($response["hotel"],array
    	(
        'id_hotel' => $row['id_hotel'],
        'hotel_name' => $row['hotel_name'],
        'hotel_desc' => $row['hotel_desc'],
        'hotel_rating' => $row['hotel_rating'],
        'tour_spot_tdkt' => $row['tour_spot_tdkt'],
    )
    );
}

echo json_encode($response);

?>