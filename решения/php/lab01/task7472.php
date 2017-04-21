<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
<head/>
<body>
    <form action="task7472.php" method="GET">
		<label>A<input name="a"/></label>
		<label>B<input name="b"/></label>
		<input type="submit">
	</form>
	<div style="border:1px solid black">
<?php
if (!isset($_GET["a"])){
	echo "Нужно ввести A";
	return;
}
if (!isset($_GET["b"])){
	echo "Нужно ввести B";
	return;
}
$a = $_GET['a'];
$b = $_GET['b'];
echo $b . " " . $a;
?>
	</div>
</body>
</html>