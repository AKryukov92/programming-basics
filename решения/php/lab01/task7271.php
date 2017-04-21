<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
<head/>
<body>
    <form action="task7271.php" method="GET">
		<label>X<input name="x"/></label>
		<label>Y<input name="y"/></label>
		<input type="submit">
	</form>
	<div style="border:1px solid black">
<?php
if (!isset($_GET["x"])){
	echo "Нужно ввести x";
	return;
}
if (!isset($_GET["y"])){
	echo "Нужно ввести y";
	return;
}
$x = $_GET["x"];
$y = $_GET["y"];
echo "INSERT INTO points (x, y) VALUES ('$x', '$y');";
?>
	</div>
</body>
</html>