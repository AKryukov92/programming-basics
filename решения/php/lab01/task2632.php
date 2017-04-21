<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
<head/>
<body>
    <form action="task2632.php" method="GET">
		<label>cx<input name="cx"/></label>
		<label>cy<input name="cy"/></label>
		<label>r<input name="r"/></label>
		<label>fill<input name="fill"/></label>
		<input type="submit">
	</form>
	<div style="border:1px solid black">
<?php
if (!isset($_GET["cx"])){
	echo "Нужно ввести cx";
	return;
}
if (!isset($_GET["cy"])){
	echo "Нужно ввести cy";
	return;
}
if (!isset($_GET["r"])){
	echo "Нужно ввести r";
	return;
}
if (!isset($_GET["fill"])){
	echo "Нужно ввести fill";
	return;
}
$CX = $_GET["cx"];
$CY = $_GET["cy"];
$R = $_GET["r"];
$FILL = $_GET["fill"];
echo "&lt;circle cx=&quot;$CX&quot; cy=&quot;$CY&quot; r=&quot;$R&quot; fill=&quot;$FILL&quot;/&gt;";
?>
	</div>
</body>
</html>