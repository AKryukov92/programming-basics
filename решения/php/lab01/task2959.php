<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
<head/>
<body>
    <form action="task2959.php" method="GET">
		<label>Id<input name="id"/></label>
		<input type="submit">
	</form>
	<div style="border:1px solid black">
<?php
if (!isset($_GET["id"])){
	echo "Нужно ввести id";
	return;
}
$id = $_GET["id"];
echo "SELECT first_name, last_name, group<br/>
FROM students WHERE id = '$id';";
?>
	</div>
</body>
</html>