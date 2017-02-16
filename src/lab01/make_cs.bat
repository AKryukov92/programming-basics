chcp 65001
set filename=file.html
set title=Ввод и вывод информации
set chapter=Линейные алгоритмы

echo ^<!DOCTYPE html^> ^
 ^<html^> ^
 ^<head^> ^
 ^<meta charset=^"utf-8^"/^> ^
 ^<title^>1 %title%^</title^> ^
 ^<style^>> %filename%

type ..\styles.css >> %filename%

echo ^</style^> ^
 ^</head^> ^
 ^<body^> ^
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^> ^
 ^<h2^>%title%^</h2^>>> %filename%

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#quiz"^>?^</a^>^</li^> ^
 ^<li^>^<a href="#writing1"^>П 1^</a^>^</li^> ^
 ^<li^>^<a href="#writing2"^>П 2^</a^>^</li^> ^
 ^<li^>^<a href="#task1"^>П 1^</a^>^</li^> ^
 ^<li^>^<a href="#writing3"^>П 1^</a^>^</li^> ^
 ^<li^>^<a href="#task2"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task3"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task4"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task5"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task6"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task7"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task8"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task9"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task10"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task11"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task12"^>№ 12^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type ..\quiz.html>> %filename%

echo ^<div class="section"^>>>%filename%

type writing01.html>>%filename%

type writing02.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%