<?php
$RESULTATIVE_AMOUNT = 200;
$ERROR_AMOUNT = 50;
$ERR_BAD_REQUEST = 400;
$ERR_UNPROCESSABLE_ENTITY = 422;
$raw = file_get_contents('php://input');
$obj = json_decode($raw);
if (json_last_error() != JSON_ERROR_NONE){
	http_response_code($ERR_BAD_REQUEST);
	echo json_last_error_msg();
	die;
}
function assert_array_field_present($obj, $fieldname){
	global $ERR_UNPROCESSABLE_ENTITY;
	if(!property_exists($obj,$fieldname)){
		http_response_code($ERR_UNPROCESSABLE_ENTITY);
		echo "Нужно прислать JSON-объект с полем '$fieldname', содержащим массив.";
		die;
	}
}
function assert_array_element_has_field($obj, $i, $fieldname){
	global $ERR_UNPROCESSABLE_ENTITY;
	if (!property_exists($obj[$i], $fieldname)){
		http_response_code($ERR_UNPROCESSABLE_ENTITY);
		echo "У объекта № $i отсутствует поле '$fieldname'";
		die;
	}
}
function assert_array_content_correct($arr, $arrname){
	global $ERR_UNPROCESSABLE_ENTITY;
	for($i = 0; $i < count($arr); $i++){
		assert_array_element_has_field($arr, $i, "a");
		assert_array_element_has_field($arr, $i, "b");
		assert_array_element_has_field($arr, $i, "c");
		assert_array_element_has_field($arr, $i, "d");
		for($j = $i + 1; $j < count($arr); $j++){
			if($arr[$i]->a == $arr[$j]->a &&
			   $arr[$i]->b == $arr[$j]->b &&
			   $arr[$i]->c == $arr[$j]->c &&
			   $arr[$i]->d == $arr[$j]->d
			){
				http_response_code($ERR_UNPROCESSABLE_ENTITY);
				echo "В массиве '$arrname' Объект № $i совпадает с объектом № $j и равен {a:$a,b:$b,c:$c,d:$d}";
				die;
			}
		}
	}
}
assert_array_field_present($obj,"possible");
assert_array_field_present($obj,"impossible");
assert_array_field_present($obj,"error_group_a");
assert_array_field_present($obj,"error_group_b");
assert_array_field_present($obj,"error_group_c");
assert_array_field_present($obj,"error_group_d");
assert_array_content_correct($obj->possible,"possible");
assert_array_content_correct($obj->impossible,"impossible");
assert_array_content_correct($obj->error_group_a,"error_group_a");
assert_array_content_correct($obj->error_group_b,"error_group_b");
assert_array_content_correct($obj->error_group_c,"error_group_c");
assert_array_content_correct($obj->error_group_d,"error_group_d");

function check_field($data, $fieldname){
	global $count;
	if ($data->$fieldname <= 0){
		$data->r = "Значение $fieldname должно быть неотрицательным";
		$count++;
	}
}

$count = 0;
for($i = 0; $i < count($obj->possible); $i++){
	$a = $obj->possible[$i]->a;
	$b = $obj->possible[$i]->b;
	$c = $obj->possible[$i]->c;
	$d = $obj->possible[$i]->d;
	if ($a < $c && $b < $d){
		$obj->possible[$i]->r = "Размещение возможно";
		$count++;
	}
}
if($count != $RESULTATIVE_AMOUNT){
	http_response_code($ERR_BAD_REQUEST);
	echo "В поле 'possible' должно находиться $RESULTATIVE_AMOUNT случаев 'Размещение возможно'. Пришло $count";
	die;
}

$count = 0;
for($i = 0; $i < count($obj->impossible); $i++){
	$a = $obj->impossible[$i]->a;
	$b = $obj->impossible[$i]->b;
	$c = $obj->impossible[$i]->c;
	$d = $obj->impossible[$i]->d;
	if ($a >= $c || $b >= $d){
		$obj->impossible[$i]->r = "Размещение невозможно";
		$count++;
	}
}
if($count != $RESULTATIVE_AMOUNT){
	http_response_code($ERR_BAD_REQUEST);
	echo "В поле 'impossible' должно находиться $RESULTATIVE_AMOUNT случаев 'Размещение невозможно'. Пришло $count";
	die;
}

$count = 0;
for($i = 0; $i < count($obj->error_group_a); $i++){
	check_field($obj->error_group_a[$i], "a");
}
if($count != $ERROR_AMOUNT){
	http_response_code($ERR_BAD_REQUEST);
	echo "В поле 'error_group_a' должно находиться $ERROR_AMOUNT случаев 'Значение A должно быть неотрицательным'. Пришло $count";
	die;
}

$count = 0;
for($i = 0; $i < count($obj->error_group_b); $i++){
	check_field($obj->error_group_b[$i], "b");
}
if($count != $ERROR_AMOUNT){
	http_response_code($ERR_BAD_REQUEST);
	echo "В поле 'error_group_b' должно находиться $ERROR_AMOUNT случаев 'Значение B должно быть неотрицательным'. Пришло $count";
	die;
}

$count = 0;
for($i = 0; $i < count($obj->error_group_c); $i++){
	check_field($obj->error_group_c[$i], "c");
}
if($count != $ERROR_AMOUNT){
	http_response_code($ERR_BAD_REQUEST);
	echo "В поле 'error_group_c' должно находиться $ERROR_AMOUNT случаев 'Значение C должно быть неотрицательным'. Пришло $count";
	die;
}

$count = 0;
for($i = 0; $i < count($obj->error_group_d); $i++){
	check_field($obj->error_group_d[$i], "d");
}
if($count != $ERROR_AMOUNT){
	http_response_code($ERR_BAD_REQUEST);
	echo "В поле 'error_group_d' должно находиться $ERROR_AMOUNT случаев 'Значение D должно быть неотрицательным'. Пришло $count";
	die;
}
echo json_encode($obj);
?>