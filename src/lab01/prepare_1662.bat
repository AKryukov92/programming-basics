chcp 65001
set lang=csharp
set index=1
set task=1662
set filename="..\..\%lang%\конспекты\pre%task%.html"

echo ^<!DOCTYPE html^> ^
 ^<html^> ^
 ^<head^> ^
 ^<meta charset=^"utf-8^"/^> ^
 ^<title^>%index% %task%^</title^> ^
 ^<style^>> %filename%

type ..\styles.css >> %filename%

echo ^</style^> ^
 ^</head^> ^
 ^<body class="section"^>>> %filename%

type pre%task%cs.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%
pause

if x%1==x start "" %filename%