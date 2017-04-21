<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
<head/>
<body>
    <form action="task4764.php" method="GET">
		<label>A<input name="a"/></label>
		<input type="submit">
	</form>
	<div style="border:1px solid black">
<?php
if (!isset($_GET["a"])){
	echo "Нужно ввести A";
	return;
}
echo $_GET["a"] . " нас не остановят!";
?>
	</div>
</body>
</html>