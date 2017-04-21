<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
<head/>
<body>
    <form action="task4343.php" method="GET">
		<label>user<input name="user"/></label>
		<label>pass<input name="pass"/></label>
		<label>host<input name="host"/></label>
		<label>port<input name="port"/></label>
		<label>db<input name="db"/></label>
		<input type="submit">
	</form>
	<div style="border:1px solid black">
<?php
if (!isset($_GET["user"])){
	echo "Нужно ввести user";
	return;
}
if (!isset($_GET["pass"])){
	echo "Нужно ввести pass";
	return;
}
if (!isset($_GET["host"])){
	echo "Нужно ввести host";
	return;
}
if (!isset($_GET["port"])){
	echo "Нужно ввести port";
	return;
}
if (!isset($_GET["db"])){
	echo "Нужно ввести db";
	return;
}
$USER = $_GET["user"];
$PASS = $_GET["pass"];
$HOST = $_GET["host"];
$PORT = $_GET["port"];
$DB = $_GET["db"];
echo "User ID=$USER;Password=$PASS;Host=$HOST;Port=$PORT;Database=$DB;";
?>
	</div>
</body>
</html>