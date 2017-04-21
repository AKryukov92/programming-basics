<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
<head/>
<body>
    <form action="task9231.php" method="GET">
		<label>A<input name="a"/></label>
		<input type="submit">
	</form>
	<div style="border:1px solid black">
<?php
if (!isset($_GET["a"])){
	echo "Нужно ввести A";
	return;
}
$a = (float) $_GET["a"];
echo round($a,4);
?>
	</div>
</body>
</html>