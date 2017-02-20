chcp 65001
pushd ..\..\
mkdir csharp
popd
set filename="..\..\csharp\[11] лаб. ОСАЛП.html"
set title=Двумерные массивы
set chapter=Алгоритмы работы с двумерными массивами

echo ^<!DOCTYPE html^> ^
 ^<html^> ^
 ^<head^> ^
 ^<meta charset=^"utf-8^"/^> ^
 ^<title^>11 %title%^</title^> ^
 ^<style^>> %filename%

type ..\styles.css >> %filename%

echo ^</style^> ^
 ^</head^> ^
 ^<body^> ^
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^>>> %filename%

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#quiz"^>?^</a^>^</li^> ^
 ^<li^>^<a href="#info1"^>И 1^</a^>^</li^> ^
 ^<li^>^<a href="#task1"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task2"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task3"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task4"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task5"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task6"^>№ 6^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

echo ^<div class="section"^>>>%filename%

type info01.html>>%filename%

echo ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%

type task01.html>>%filename%
type task02.html>>%filename%
type task03.html>>%filename%
type task04.html>>%filename%
type task05.html>>%filename%
type task06.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%