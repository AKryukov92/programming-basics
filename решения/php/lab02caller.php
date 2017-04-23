<?php
include 'lab02functions.php'
?><!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<style>
	div {
		font-family:monospace;
		white-space:pre;
		border:1px solid black;
		margin:5px;
		padding:5px;
	}
</style>
</head>
<body>
<h3>4411</h3>
<?php
$in4411 = array(11.13, -7919, 0);
for ($i = 0; $i < count($in4411); $i++){
	echo "<div>";
	echo task4411($in4411[$i]);
	echo "</div>";
}
?>

<h3>9298</h3>
<?php
$in9298 = array("1","5","0","-2");
for ($i = 0; $i < count($in9298); $i++){
	echo "<div>";
	try {
		echo task9298($in9298[$i]);
	} catch (Exception $e){
		echo $e->getMessage();
	}
	echo "</div>";
}
?>
<h3>3354</h3>
<?php
$in3354 = array("7", "11", "0", "-3");
for ($i = 0; $i < count($in3354); $i++){
	echo "<div>";
	try {
		echo task3354($in3354[$i]);
	} catch (Exception $e){
		echo $e->getMessage();
	}
	echo "</div>";
}
?>

<h3>5201</h3>
<?php
$in5201 = array("13", "17", "0", "-2");
for ($i = 0; $i < count($in5201); $i++){
	echo "<div>";
	try {
		echo task5201($in5201[$i]);
	} catch (Exception $e){
		echo $e->getMessage();
	}
	echo "</div>";
}
?>

<h3>2981</h3>
<?php
$in2981 = array("19", "23", "0", "-7");
for ($i = 0; $i < count($in2981); $i++){
	echo "<div>";
	try {
		echo task2981($in2981[$i]);
	} catch (Exception $e){
		echo $e->getMessage();
	}
	echo "</div>";
}
?>

<h3>4312</h3>
<?php
$in4312a = array("1","2","0","-2","3");
$in4312h = array("1","3","10","1","-4");
for ($i = 0; $i < count($in4312a); $i++){
	echo "<div>";
	try {
		echo task4312($in4312a[$i], $in4312h[$i]);
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

<h3>8428</h3>
<?php
$in8428 = array("45","1125","0","360","90","2000");
for ($i = 0; $i < count($in8428); $i++){
	echo "<div>";
	echo task8428($in8428[$i]);
	echo "</div>";
}
?>

<h3>2361</h3>
<?php
$in2361t = array("400","103","300","-800");
$in2361l = array("17","29","-70","20");
for ($i = 0; $i < count($in2361t); $i++){
	echo "<div>";
	try {
		$r = task2361($in2361t[$i], $in2361l[$i]);
		echo $r->q . " шт и " . $r->d . " см";
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

<h3>5063</h3>
<?php
$in5063 = array("365","45","1125","1500","2000","0","360");
for ($i = 0; $i < count($in5063); $i++){
	echo "<div>";
	echo task5063($in5063[$i]);
	echo "</div>";
}
?>

<h3>7711</h3>
<?php
$in7711 = array("45", "1125", "7639", "360", "90");
for ($i = 0; $i < count($in7711); $i++){
	echo "<div>";
	echo task7711($in7711[$i]);
	echo "</div>";
}
?>

<h3>8833</h3>
<?php
$in8833 = array("7606", "9", "0", "-7603");
for ($i = 0; $i < count($in8833); $i++){
	echo "<div>";
	try {
		echo task8833($in8833[$i]);
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

<h3>1262</h3>
<?php
$in1262 = array("7583", "200", "360", "90");
for ($i = 0; $i < count($in1262); $i++){
	echo "<div>";
	echo task1262($in1262[$i]);
	echo "</div>";
}
?>

<h3>9020</h3>
<?php
$in9020 = array("0", "-9", "61", "60", "62", "7573", "75");
for ($i = 0; $i < count($in9020); $i++){
	echo "<div>";
	try {
		echo task9020($in9020[$i]);
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

<h3>1934</h3>
<?php
$in1934a = array("6047","-3","0","13","6221");
$in1934b = array("-6011", "-7", "-50","0", "6373");
for ($i = 0; $i < count($in1934a); $i++){
	echo "<div>";
	try {
		echo task1934($in1934a[$i], $in1934b[$i]);
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

<h3>7237</h3>
<?php
$in7237 = array("0","20.5","691.9","-273.15","-300");
for ($i = 0; $i < count($in7237); $i++){
	echo "<div>";
	try {
		echo task7237($in7237[$i]);
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

<h3>3943</h3>
<?php
$in3943x = array("-5", "7507", "7489", "-7481");
$in3943y = array("81", "7499", "-7487", "7477");
for ($i = 0; $i < count($in3943x); $i++){
	echo "<div>";
	try {
		echo task3943($in3943x[$i], $in3943y[$i]);
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

<h3>7619</h3>
<?php
$in7619v1 = array("31", "0", "-13", "67");
$in7619v2 = array("47", "7", "11", "-79");
$in7619s = array("6833", "6829", "200", "400");
for ($i = 0; $i < count($in7619v1); $i++){
	echo "<div>";
	try {
		echo task7619($in7619v1[$i], $in7619v2[$i], $in7619s[$i]);
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

<h3>3832</h3>
<?php
$in3832x1 = array("7451", "3" ,"-2");
$in3832x2 = array("7433", "7", "-2029");
$in3832x3 = array("7417", "11", "0");
for ($i = 0; $i < count($in3832x1); $i++){
	echo "<div>";
	echo task3832($in3832x1[$i], $in3832x2[$i], $in3832x3[$i]);
	echo "</div>";
}
?>

<h3>1346</h3>
<?php
$in1346v0 = array("7411", "3");
$in1346t = array("7433", "7");
$in1346a = array("7417", "11");
for ($i = 0; $i < count($in1346v0); $i++){
	echo "<div>";
	echo task1346($in1346v0[$i], $in1346t[$i], $in1346a[$i]);
	echo "</div>";
}
?>

<h3>9622</h3>
<?php
$in9622m = array("7351","19","-1","2","3");
$in9622v = array("7349","23","4","-5","6");
$in9622h = array("7333","29","7","8","-9");
for ($i = 0; $i < count($in9622m); $i++){
	echo "<div>";
	try {
		$r = task9622($in9622m[$i], $in9622v[$i], $in9622h[$i]);
		echo "T: " . $r->t . " Wn: " . $r->wn;
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

<h3>8873</h3>
<?php
$in8873r1 = array("7331","3","0","7309");
$in8873r2 = array("7321","5","7307","0");
for ($i = 0; $i < count($in8873r1); $i++){
	echo "<div>";
	try {
		echo task8873($in8873r1[$i], $in8873r2[$i]);
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

<h3>7799</h3>
<?php
$in7799m = array("7297","2659");
$in7799a = array("7283", "0");
for ($i = 0; $i < count($in7799m); $i++){
	echo "<div>";
	echo task7799($in7799m[$i], $in7799a[$i]);
	echo "</div>";
}
?>

<h3>9354</h3>
<?php
$in9354a = array("7247", "7");
$in9354b = array("7243", "1");
$in9354c = array("7229", "3");
for ($i = 0; $i < count($in9354a); $i++){
	echo "<div>";
	echo task9354($in9354a[$i], $in9354b[$i], $in9354c[$i]);
	echo "</div>";
}
?>

<h3>9130</h3>
<?php
$in9130y = array("7211","11","7177");
$in9130m1 = array("7219","3","7193");
$in9130m2 = array("7213","7","7207");
$in9130r = array("7207","13","0");
for ($i = 0; $i < count($in9130y); $i++){
	echo "<div>";
	try {
		echo task9130($in9130y[$i], $in9130m1[$i], $in9130m2[$i], $in9130r[$i]);
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

<h3>5895</h3>
<?php
$in5895a = array("7109", "3");
$in5895b = array("7103", "7");
$in5895c = array("7079","13");
for ($i = 0; $i < count($in5895a); $i++){
	echo "<div>";
	echo task5895($in5895a[$i], $in5895b[$i], $in5895c[$i]);
	echo "</div>";
}
?>

<h3>2461</h3>
<?php
$in2461a = array("7069", "0", "7019");
$in2461b = array("7043", "7043", "7043");
$in2461c = array("7039", "7039","7001");
$in2461d = array("7057","7027","0");
for ($i = 0; $i < count($in2461a); $i++){
	echo "<div>";
	try {
		echo task2461($in2461a[$i], $in2461b[$i], $in2461c[$i], $in2461d[$i]);
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

<h3>2790</h3>
<?php
$in2790 = array("6997", "31", "0");
for ($i = 0; $i < count($in2790); $i++){
	echo "<div>";
	echo task2790($in2790[$i]);
	echo "</div>";
}
?>

<h3>2624</h3>
<?php
$in2624a = array("6991", "11", "-6959", "0");
$in2624b = array("6983", "13", "6949", "0");
$in2624c = array("6977", "17", "6947", "0");
$in2624x = array("6961", "19", "6917", "0");
for ($i = 0; $i < count($in2624a); $i++){
	echo "<div>";
	try {
		echo task2624($in2624a[$i], $in2624b[$i],$in2624c[$i], $in2624x[$i]);
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

<h3>5871</h3>
<?php
$in5871 = array("6911", "3", "0.9");
for ($i = 0; $i < count($in5871); $i++){
	echo "<div>";
	try {
		echo task5871($in5871[$i]);
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

<h3>9164</h3>
<?php
$in9164a = array("90", "90", "7559");
$in9164b = array("90", "0", "7549");
for ($i = 0; $i < count($in9164a); $i++){
	echo "<div>";
	echo task9164($in9164a[$i], $in9164b[$i]);
	echo "</div>";
}
?>

<h3>7457</h3>
<?php
$in7457 = array("6883", "-6871", "0");
for ($i = 0; $i < count($in7457); $i++){
	echo "<div>";
	echo task7457($in7457[$i]);
	echo "</div>";
}
?>

<h3>9865</h3>
<?php
$in9865 = array("6869", "-6863", "0", "-1.482634");
for ($i = 0; $i < count($in9865); $i++){
	echo "<div>";
	echo task9865($in9865[$i]);
	echo "</div>";
}
?>

<h3>3591</h3>
<?php
$in3591 = array("0", "200", "6857", "-500");
for ($i = 0; $i < count($in3591); $i++){
	echo "<div>";
	try {
		echo task3591($in3591[$i]);
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

<h3>3558</h3>
<?php
$in3558a = array("45","200","7523");
$in3558b = array("90", "45","7517");
for ($i = 0; $i < count($in3558a); $i++){
	echo "<div>";
	echo task3558($in3558a[$i], $in3558b[$i]);
	echo "</div>";
}
?>

<h3>4366</h3>
<?php
$in4366x1 = array("7459","-3","0");
$in4366x2 = array("7457","-7","0");
for ($i = 0; $i < count($in4366x1); $i++){
	echo "<div>";
	echo task4366($in4366x1[$i], $in4366x2[$i]);
	echo "</div>";
}
?>

<h3>5789</h3>
<?php
$in5789xa = array("1","-2","0","0","-1");
$in5789ya = array("1","4","0","0","-3");
$in5789xb = array("3","8","-5","0","2");
$in5789yb = array("4", "-10", "-7", "0", "9");
for ($i = 0; $i < count($in5789xa); $i++){
	echo "<div>";
	echo task5789($in5789xa[$i], $in5789ya[$i], $in5789xb[$i], $in5789yb[$i]);
	echo "</div>";
}
?>

<h3>6522</h3>
<?php
$in6522v1 = array("1", "1","5","-2","4");
$in6522t1 = array("30","-20","90","10","100");
$in6522v2 = array("3","10","1","5","-10");
$in6522t2 = array("20","20","-10","50","4");
for ($i = 0; $i < count($in6522v1); $i++){
	echo "<div>";
	try {
		echo task6522($in6522v1[$i], $in6522t1[$i], $in6522v2[$i], $in6522t2[$i]);
	} catch (Exception $e){
		echo $e->getMessage();;
	}
	echo "</div>";
}
?>

</body>
</html>