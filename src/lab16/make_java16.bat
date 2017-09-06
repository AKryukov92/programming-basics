chcp 65001
set lang=java
set index=16
set chapter=HTTP клиент
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

echo ^<!DOCTYPE html^> ^
 ^<html^> ^
 ^<head^> ^
 ^<meta charset=^"utf-8^"/^> ^
 ^<title^>%index% %chapter%^</title^> ^
 ^<style^>> %filename%

type ..\styles.css >> %filename%

echo ^</style^> ^
 ^</head^> ^
 ^<body class="section"^> ^
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^>>> %filename%

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#info1"^>справка^</a^>^</li^> ^
 ^<li^>^<a href="#task4304"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task2070"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task7693"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task8718"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task7248"^>№ 5^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type info01.html>>%filename%

echo ^<div class="section"^>>>%filename%

type task4304.html>>%filename%
type task2070.html>>%filename%
type task7693.html>>%filename%
type task8718.html>>%filename%
type task7248.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "*.php" "..\..\%lang%\handlers\*.php"

if x%1==x start "" %filename%