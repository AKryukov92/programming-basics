chcp 65001
set lang=js
if "%1"=="" (
  set index=1
) else (
  set index=%1
)
set chapter=Заполнение шаблона текстом
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

type ..\nav_js.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#task1662" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task4131" class="example"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task7365"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task1910"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task1640"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task1860" class="example"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task4764" class="supervision"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task2429"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task7472"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task4140" class="example"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task2959"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task7271"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task2632"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task4343"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task7474"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task8693"^>№ 16^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type link_c1_p4.3.html>>%filename%
type task1662.html>>%filename%
type task4131js.html>>%filename%
type task7365js.html>>%filename%
type task1910js.html>>%filename%
type task1640js.html>>%filename%
type task1860.html>>%filename%
type link_c7_p33.html>>%filename%
type task4764.html>>%filename%
type task2429.html>>%filename%
type link_c6_p30.2.html>>%filename%
type task7472.html>>%filename%
type link_c3_p10.2.html>>%filename%
type task4140.html>>%filename%
type task2959.html>>%filename%
type task7271.html>>%filename%
type task2632.html>>%filename%
type task4343.html>>%filename%
type task7474.html>>%filename%
type task8693.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

if "%2"=="" start "" %filename%