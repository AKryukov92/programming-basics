chcp 65001
set lang=java
if "%1"=="" (
  set index=8
) else (
  set index=%1
)
set chapter=Вычисление агрегатов
set filename="..\..\%lang%\Задания к %index% практической работе.html"

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
 ^<li^>^<a href="#task2475" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task9180" class="supervision"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task1544"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task9562"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task3669"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task5951"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task2802"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task6580"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task8696" class="example"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task5969"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task3946"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task6497"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task5648"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task7035"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task9271"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task8769"^>№ 16^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type task2475.html>>%filename%
type task9180.html>>%filename%
type task1544.html>>%filename%
type task9562.html>>%filename%
type task3669.html>>%filename%
type task5951.html>>%filename%
type link_c5_p23.1.html>>%filename%
type task2802.html>>%filename%
type task6580.html>>%filename%
type task8696.html>>%filename%
type task5969.html>>%filename%
type task3946.html>>%filename%
type task6497.html>>%filename%
type task5648.html>>%filename%
type task7035.html>>%filename%
type task9271.html>>%filename%
type task8769.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

if "%2"=="" start "" %filename%