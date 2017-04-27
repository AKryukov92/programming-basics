chcp 65001
set lang=js
set index=16
set chapter=AJAX
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

pushd ..\..\
mkdir %lang%
popd

echo ^<!DOCTYPE html^> ^
 ^<html^> ^
 ^<head^> ^
 ^<meta charset=^"utf-8^"/^> ^
 ^<title^>%index% %chapter%^</title^> ^
 ^<style^>> %filename%

type ..\styles.css >> %filename%

echo ^</style^> ^
 ^</head^> ^
 ^<body^> ^
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^>>> %filename%

type ..\nav_js.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#info1"^>И 1^</a^>^</li^> ^
 ^<li^>^<a href="#task4304"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task2070"^>№ 2^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
REM type quiz.html>> %filename%

REM echo ^<div class="section"^>>>%filename%

REM type writingjs5463.html>>%filename%

REM echo ^</div^>>>%filename%
type info01.html>>%filename%

echo ^<div class="section"^>>>%filename%

type task4304.html>>%filename%
type task2070.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

pushd ..\..\%lang%\
mkdir handlers
popd

copy "*.php" "..\..\%lang%\handlers\*.php"

if x%1==x start "" %filename%