<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
<head/>
<body>
    <form action="task1860.php" method="GET">
		<label>A<input name="a"/></label>
		<input type="submit">
	</form>
	<div style="border:1px solid black">
<?php
if (!isset($_GET["a"])){
	echo "Нужно ввести A";
	return;
}
echo "Мы стремимся к " . $_GET["a"];
?>
	</div>
</body>
</html>