chcp 65001
set lang=%1
set task=%2
set abbreviation=%3
set lab=%4
set filename="..\%lang%\конспекты\pre%task%.html"

echo ^<!DOCTYPE html^> ^
 ^<html^> ^
 ^<head^> ^
 ^<meta charset=^"utf-8^"/^> ^
 ^<title^>Рук-во к %task%^</title^> ^
 ^<style^>> %filename%

type styles.css >> %filename%

echo ^</style^> ^
 ^</head^> ^
 ^<body class="section"^>>> %filename%

type %lab%\pre%task%%abbreviation%.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%