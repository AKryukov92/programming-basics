<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
<head/>
<body>
    <form action="task2429.php" method="GET">
		<label>A<input name="a"/></label>
		<input type="submit">
	</form>
	<div style="border:1px solid black">
<?php
if (!isset($_GET["a"])){
	echo "Нужно ввести A";
	return;
}
$a = $_GET['a'];
echo "Программирование это $a!";
?>
	</div>
</body>
</html>