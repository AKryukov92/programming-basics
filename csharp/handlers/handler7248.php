<?php
header('Content-Type: application/json;');
$RESULTATIVE_AMOUNT = 150;
$ERROR_AMOUNT = 100;
$ERR_BAD_REQUEST = 400;
$ERR_UNPROCESSABLE_ENTITY = 422;
$raw = file_get_contents('php://input');
$obj = json_decode($raw);
if (json_last_error() != JSON_ERROR_NONE){
	http_response_code($ERR_BAD_REQUEST);
	echo json_last_error_msg();
	die;
}
if(!property_exists($obj,"pairs")){
	http_response_code($ERR_UNPROCESSABLE_ENTITY);
	echo "Нужно прислать JSON-объект с полем 'pairs', содержащим массив.";
	die;
}
function assert_pair($i, $obj, $fieldname){
	if (!property_exists($obj->pairs[$i], $fieldname)){
		http_response_code($ERR_UNPROCESSABLE_ENTITY);
		echo "У пары № $i отсутствует поле '$fieldname'";
		die;
	}
}
function assert_field($i, $obj, $property, $fieldname){
	if (!property_exists($obj->pairs[$i]->$property, $fieldname)){
		http_response_code($ERR_UNPROCESSABLE_ENTITY);
		echo "У пары № $i в объекте $property отсутствует поле '$fieldname'";
		die;
	}
}
for($i = 0; $i < count($obj->pairs); $i++){
	assert_pair($i, $obj, "first");
	assert_pair($i, $obj, "second");
	assert_field($i, $obj, "first", "a");
	assert_field($i, $obj, "first", "b");
	assert_field($i, $obj, "second", "a");
	assert_field($i, $obj, "second", "b");
	$a1 = $obj->pairs[$i]->first->a;
	$b1 = $obj->pairs[$i]->first->b;
	$a2 = $obj->pairs[$i]->second->a;
	$b2 = $obj->pairs[$i]->second->b;
	
	for($j = $i + 1; $j < count($obj->pairs); $j++){
		if($a1 == $obj->pairs[$j]->first->a &&
		   $b1 == $obj->pairs[$j]->first->b &&
		   $a2 == $obj->pairs[$j]->second->a &&
		   $b2 == $obj->pairs[$j]->second->b
		){
			http_response_code($ERR_UNPROCESSABLE_ENTITY);
			echo "Пара № $i совпадает с парой № $j и равен {a1:$a1,b1:$b1,a2:$a2,b2:$b2}";
			die;
		}
	}
}
function check_field($data, $fieldname){
	if ($data->$fieldname <= 0){
		$data->r = "Значение $fieldname должно быть неотрицательным";
		return true;
	}
	return false;
}
$countClass1 = 0;
$countClass2 = 0;
$countClass3 = 0;
$countClass4 = 0;
$countClass5 = 0;
$countClass6 = 0;
$countCaseErrorLeft = 0;
$countCaseErrorRight = 0;
for($i = 0; $i < count($obj->pairs); $i++){
	$a1 = $obj->pairs[$i]->first->a;
	$b1 = $obj->pairs[$i]->first->b;
	$a2 = $obj->pairs[$i]->second->a;
	$b2 = $obj->pairs[$i]->second->b;
	if ($a1 >= $b1){
		$obj->pairs[$i]->r = "Значение A должно быть меньше значения B";
		$countCaseErrorLeft++;
		continue;
	}
	if ($a2 >= $b2){
		$obj->pairs[$i]->r = "Значение A должно быть меньше значения B";
		$countCaseErrorRight++;
		continue;
	}
	if ($b1 < $a2){
		$obj->pairs[$i]->r = "Не пересекаются";
		$countClass1++;
		continue;
	}
	if ($b2 < $a1){
		$obj->pairs[$i]->r = "Не пересекаются";
		$countClass2++;
		continue;
	}
	if ($a1 < $a2 && $a2 < $b1){
		if ($b2 > $b1){
			$countClass3++;
			$obj->pairs[$i]->r = (object) array('a'=>$a2, 'b'=>$b1);
		} else {
			$countClass4++;
			$obj->pairs[$i]->r['a'] = (object) array('a'=>$a2, 'b'=>$b2);
		}
	} else {
		if ($b2 > $b1){
			$countClass5++;
			$obj->pairs[$i]->r['a'] = (object) array('a'=>$a1, 'b'=>$b2);
		} else {
			$countClass6++;
			$obj->pairs[$i]->r['a'] = (object) array('a'=>$a1, 'b'=>$b2);
		}
	}
}
if($countCaseErrorLeft != $ERROR_AMOUNT){
	http_response_code($ERR_BAD_REQUEST);
	echo "В данных должно находиться $ERROR_AMOUNT случаев с ошибкой 'Значение A должно быть меньше значения B' для первого интервала. Пришло $countCaseErrorLeft";
	die;
}
if($countCaseErrorRight != $ERROR_AMOUNT){
	http_response_code($ERR_BAD_REQUEST);
	echo "В данных должно находиться $ERROR_AMOUNT случаев с ошибкой 'Значение A должно быть меньше значения B' для второго интервала. Пришло $countCaseErrorRight";
	die;
}
if($countClass1 != $RESULTATIVE_AMOUNT ||
   $countClass2 != $RESULTATIVE_AMOUNT ||
   $countClass3 != $RESULTATIVE_AMOUNT ||
   $countClass4 != $RESULTATIVE_AMOUNT ||
   $countClass5 != $RESULTATIVE_AMOUNT ||
   $countClass6 != $RESULTATIVE_AMOUNT
){
	http_response_code($ERR_BAD_REQUEST);
	echo "Один из классов эквивалентности представлен не полностью";
	die;
}
echo json_encode($obj,JSON_UNESCAPED_UNICODE);
?>