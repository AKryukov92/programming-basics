<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
<head/>
<body>
    <form action="task8624.php" method="GET">
		<label>K<input name="k"/></label>
		<input type="submit">
	</form>
	<div style="border:1px solid black">
<?php
if (!isset($_GET["k"])){
	echo "Нужно ввести K";
	return;
}
$k = (int) $_GET["k"];
echo "&quot;$k&quot;";
?>
	</div>
</body>
</html>