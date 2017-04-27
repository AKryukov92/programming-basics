<?php
sleep(2);
$raw = file_get_contents('php://input');
$arr = explode(";",$raw);
if(count($arr)<10){
	http_response_code(500);
	echo "Нужно прислать массив из 10 элементов";
	die;
} else {
	$sum = 0;
	for($i = 0; $i < count($arr); $i++){
		$sum += $arr[$i];
	}
	echo $sum;
}
?>