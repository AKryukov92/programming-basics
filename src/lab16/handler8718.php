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
	assert_field($i, $obj, "a");
	assert_field($i, $obj, "b");
	assert_field($i, $obj, "c");
	assert_field($i, $obj, "d");
	$a = $obj->data[$i]->a;
	$b = $obj->data[$i]->b;
	$c = $obj->data[$i]->c;
	$d = $obj->data[$i]->d;
	
	for($j = $i + 1; $j < count($obj->data); $j++){
		if($a == $obj->data[$j]->a &&
		   $b == $obj->data[$j]->b &&
		   $c == $obj->data[$j]->c &&
		   $d == $obj->data[$j]->d
		){
			http_response_code($ERR_UNPROCESSABLE_ENTITY);
			echo "Объект № $i совпадает с объектом № $j и равен {a:$a,b:$b,c:$c,d:$d}";
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
$countCasePossible = 0;
$countCaseImpossible = 0;
$countCaseErrorA = 0;
$countCaseErrorB = 0;
$countCaseErrorC = 0;
$countCaseErrorD = 0;
for($i = 0; $i < count($obj->data); $i++){
	$a = $obj->data[$i]->a;
	$b = $obj->data[$i]->b;
	$c = $obj->data[$i]->c;
	$d = $obj->data[$i]->d;
	if(check_field($obj->data[$i],"a")) {
		$countCaseErrorA++;
		continue;
	}
	if(check_field($obj->data[$i],"b")) {
		$countCaseErrorB++;
		continue;
	}
	if(check_field($obj->data[$i],"c")) {
		$countCaseErrorC++;
		continue;
	}
	if(check_field($obj->data[$i],"d")) {
		$countCaseErrorD++;
		continue;
	}
	if ($a < $c && $b < $d){
		$obj->data[$i]->r = "Размещение возможно";
		$countCasePossible++;
	} else {
		$obj->data[$i]->r = "Размещение невозможно";
		$countCaseImpossible++;
	}
}
if($countCasePossible != $RESULTATIVE_AMOUNT){
	http_response_code($ERR_BAD_REQUEST);
	echo "В данных должно находиться $RESULTATIVE_AMOUNT случаев 'Размещение возможно'. Пришло $countCasePossible";
	die;
}
if($countCaseImpossible != $RESULTATIVE_AMOUNT){
	http_response_code($ERR_BAD_REQUEST);
	echo "В данных должно находиться $RESULTATIVE_AMOUNT случаев 'Размещение невозможно'. Пришло $countCaseImpossible";
	die;
}
if($countCaseErrorA != $ERROR_AMOUNT){
	http_response_code($ERR_BAD_REQUEST);
	echo "В данных должно находиться $ERROR_AMOUNT случаев 'Значение A должно быть неотрицательным'. Пришло $countCaseErrorA";
	die;
}
if($countCaseErrorB != $ERROR_AMOUNT){
	http_response_code($ERR_BAD_REQUEST);
	echo "В данных должно находиться $ERROR_AMOUNT случаев 'Значение B должно быть неотрицательным'. Пришло $countCaseErrorB";
	die;
}
if($countCaseErrorC != $ERROR_AMOUNT){
	http_response_code($ERR_BAD_REQUEST);
	echo "В данных должно находиться $ERROR_AMOUNT случаев 'Значение C должно быть неотрицательным'. Пришло $countCaseErrorC";
	die;
}
if($countCaseErrorD != $ERROR_AMOUNT){
	http_response_code($ERR_BAD_REQUEST);
	echo "В данных должно находиться $ERROR_AMOUNT случаев 'Значение D должно быть неотрицательным'. Пришло $countCaseErrorD";
	die;
}
echo json_encode($obj);
?>