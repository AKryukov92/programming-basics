chcp 65001
set filename=file.html
set title=Ввод и вывод информации
set chapter=Линейные алгоритмы

echo ^<!DOCTYPE html^> > %filename%
echo ^<html^>>> %filename%
echo ^<head^>>> %filename%
echo ^<meta charset=^"utf-8^"/^> >> %filename%
echo ^<title^>1 %title%^</title^>>> %filename%
echo ^<style^>>> %filename%
type ..\styles.css >> %filename%
echo ^</style^>>> %filename%
echo ^</head^>>> %filename%
echo ^<body^>>> %filename%
echo ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^>>> %filename%
echo ^<h2^>%title%^</h2^>>> %filename%
type ..\nav_cs.html>> %filename%
echo ^</body^>>> %filename%
echo ^</html^>>> %filename%