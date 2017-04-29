<?php
$RESULTATIVE_AMOUNT = 150;
$ERROR_AMOUNT = 100;
$ERR_BAD_REQUEST = 400;
$ERR_CONFLICT = 409;
$ERR_UNPROCESSABLE_ENTITY = 422;
$raw = file_get_contents('php://input');
$obj = json_decode($raw);
if (json_last_error() != JSON_ERROR_NONE){
	http_response_code($ERR_BAD_REQUEST);
	echo json_last_error_msg();
	die;
}
if(!property_exists($obj,"data")){
	http_response_code($ERR_UNPROCESSABLE_ENTITY);
	echo "Нужно прислать JSON-объект с полем 'data', содержащим массив.";
	die;
}
function assert_field($i, $obj, $fieldname){
	if (!property_exists($obj->data[$i], $fieldname)){
		http_response_code($ERR_UNPROCESSABLE_ENTITY);
		echo "У объекта № $i отсутствует поле '$fieldname'";
		die;
	}
}
for($i = 0; $i < count($obj->data); $i++){
	assert_field($i, $obj, "a1");
	assert_field($i, $obj, "b1");
	assert_field($i, $obj, "a2");
	assert_field($i, $obj, "b2");
	$a1 = $obj->data[$i]->a1;
	$b1 = $obj->data[$i]->b1;
	$a2 = $obj->data[$i]->a2;
	$b2 = $obj->data[$i]->b2;
	
	for($j = $i + 1; $j < count($obj->data); $j++){
		if($a1 == $obj->data[$j]->a1 &&
		   $b1 == $obj->data[$j]->b1 &&
		   $a2 == $obj->data[$j]->a2 &&
		   $b2 == $obj->data[$j]->b2
		){
			http_response_code($ERR_UNPROCESSABLE_ENTITY);
			echo "Объект № $i совпадает с объектом № $j и равен {a1:$a1,b1:$b1,a2:$a2,b2:$b2}";
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
for($i = 0; $i < count($obj->data); $i++){
	$a1 = $obj->data[$i]->a1;
	$b1 = $obj->data[$i]->b1;
	$a2 = $obj->data[$i]->a2;
	$b2 = $obj->data[$i]->b2;
	if ($a1 >= $b1){
		$obj->data[$i]->r = "Значение A должно быть меньше значения B";
		$countCaseErrorLeft++;
		continue;
	}
	if ($a2 >= $b2){
		$obj->data[$i]->r = "Значение A должно быть меньше значения B";
		$countCaseErrorRight++;
		continue;
	}
	if ($b1 < $a2){
		$obj->data[$i]->r = "не пересекаются";
		$countClass1++;
		continue;
	}
	if ($b2 < $a1){
		$obj->data[$i]->r = "не пересекаются";
		$countClass2++;
		continue;
	}
	if ($a1 < $a2 && $a2 < $b1){
		if ($b2 > $b1){
			$countClass3++;
			$obj->data[$i]->r = "пересекаются ($a2;$b1)";
		} else {
			$countClass4++;
			$obj->data[$i]->r = "пересекаются ($a2;$b2)";
		}
	} else {
		if ($b2 > $b1){
			$countClass5++;
			$obj->data[$i]->r = "пересекаются ($a1;$b1)";
		} else {
			$countClass6++;
			$obj->data[$i]->r = "пересекаются ($a1;$b2)";
		}
	}
}
if($countCaseErrorLeft != $ERROR_AMOUNT){
	http_response_code($ERR_CONFLICT);
	echo "В данных должно находиться $ERROR_AMOUNT случаев с ошибкой 'Значение A должно быть меньше значения B' для первого интервала. Пришло $countCaseErrorLeft";
	die;
}
if($countCaseErrorRight != $ERROR_AMOUNT){
	http_response_code($ERR_CONFLICT);
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
	http_response_code($ERR_CONFLICT);
	echo "Один из классов эквивалентности представлен не полностью";
	die;
}
echo json_encode($obj);
?>