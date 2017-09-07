<?php
$MAX_VALUE = 2000;
$MIN_VALUE = -2000;
$EXPECTED_AMOUNT = 2000;
$UNPROCESSABLE_ENTITY = 422;
$raw = file_get_contents('php://input');
$arr = explode(";", $raw);
if(count($arr) != $EXPECTED_AMOUNT){
	http_response_code($UNPROCESSABLE_ENTITY);
	$length = count($arr);
	echo "Нужно прислать массив из $EXPECTED_AMOUNT элементов. Пришло $length";
	die;
}
$sum = 0;
for($i = 0; $i < count($arr); $i++){
	$current = $arr[$i];
	for($j = $i + 1; $j < count($arr); $j++){
		$checked = $arr[$j];
		if($current == $checked){
			http_response_code($UNPROCESSABLE_ENTITY);
			echo "Число № $i совпадает с числом № $j и равно $current";
			die;
		}
	}
	if ($current < $MIN_VALUE || $MAX_VALUE < $current){
		http_response_code($UNPROCESSABLE_ENTITY);
		echo "Число № $i = $current находится за пределами интервала [$MIN_VALUE;$MAX_VALUE]";
		die;
	}
	$sum += $current;
}
echo $sum;
?>