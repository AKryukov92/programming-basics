<?php
$EXPECTED_AMOUNT = 1000;
$UNPROCESSABLE_ENTITY = 422;
$raw = file_get_contents('php://input');
$arr = explode(";", $raw);
if(count($arr) != $EXPECTED_AMOUNT){
	http_response_code($UNPROCESSABLE_ENTITY);
	$length = count($arr);
	echo "Нужно прислать массив из $EXPECTED_AMOUNT элементов. Пришло $length";
	die;
}
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
	
	if ($current <= 0){
		http_response_code($UNPROCESSABLE_ENTITY);
		echo "Число № $i равное $current вызвало ошибку";
		die;
	}
}
for ($i = 0; $i < count($arr); $i++){
	$c = 2 * pi() * $arr[$i];
	echo round($c, 4);
	echo "; ";
}
?>