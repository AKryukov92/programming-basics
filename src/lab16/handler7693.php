<?php
$MAX_VALUE = 4000;
$MIN_VALUE = 1000;
$EXPECTED_AMOUNT = 1000;
$BAD_REQUEST = 400;
$UNPROCESSABLE_ENTITY = 422;
$raw = file_get_contents('php://input');
$obj = json_decode($raw);
if (json_last_error() != JSON_ERROR_NONE){
	http_response_code($BAD_REQUEST);
	echo json_last_error_msg();
	die;
}
if(!property_exists($obj,"data")){
	http_response_code($UNPROCESSABLE_ENTITY);
	echo "Нужно прислать JSON-объект с полем 'data', содержащим массив.";
	die;
}
if(count($obj->data) != $EXPECTED_AMOUNT){
	http_response_code($UNPROCESSABLE_ENTITY);
	$length = count($obj->data);
	echo "Массив в поле 'data' должен содержать $EXPECTED_AMOUNT элементов. Пришло $length";
	die;
}
function assert_field($i, $arr, $fieldname){
	global $ERR_UNPROCESSABLE_ENTITY;
	if (!property_exists($arr[$i], $fieldname)){
		http_response_code($ERR_UNPROCESSABLE_ENTITY);
		echo "У объекта № $i отсутствует поле '$fieldname'";
		die;
	}
}
for($i = 0; $i < count($obj->data); $i++){
	assert_field($i, $obj->data, "x");
	assert_field($i, $obj->data, "y");
	$currentX = $obj->data[$i]->x;
	$currentY = $obj->data[$i]->y;
	for($j = $i + 1; $j < count($obj->data); $j++){
		$checkedX = $obj->data[$j]->x;
		$checkedY = $obj->data[$j]->y;
		if($currentX == $checkedX &&
		    $currentY == $checkedY){
			http_response_code($UNPROCESSABLE_ENTITY);
			echo "Объект № $i совпадает с объектом № $j и равен {x:$checkedX,y:$checkedY}";
			die;
		}
	}
	if ($currentY < 0){
		http_response_code($UNPROCESSABLE_ENTITY);
		echo "Объект № $i = {x:$currentX,y:$currentY} содержит значение Y меньше нуля";
		die;
	}
	if ($currentX + sqrt($currentY) < 0){
		http_response_code($UNPROCESSABLE_ENTITY);
		echo "Объект № $i = {x:$currentX,y:$currentY} содержит значения, при которых подкоренное выражение меньше нуля";
		die;
	}
}
for($i = 0; $i < count($obj->data); $i++){
	$x = $obj->data[$i]->x;
	$y = $obj->data[$i]->y;
	$r = -5 * sqrt($x+sqrt($y));
	$obj->data[$i]->r = round($r, 4);
}
echo json_encode($obj,JSON_UNESCAPED_UNICODE);
?>