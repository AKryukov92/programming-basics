chcp 65001
set lang=php
set index=8
set chapter=Работа с массивами
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

type ..\nav_php.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#quiz"^>?^</a^>^</li^> ^
 ^<li^>^<a href="#writing1"^>П 1^</a^>^</li^> ^
 ^<li^>^<a href="#writing2"^>П 2^</a^>^</li^> ^
 ^<li^>^<a href="#writing3"^>П 3^</a^>^</li^> ^
 ^<li^>^<a href="#writing4"^>П 4^</a^>^</li^> ^
 ^<li^>^<a href="#task1"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task2"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task3"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task4"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task5"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task6"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task7"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task8"^>№ 8^</a^>^</li^> ^
 ^</ul^> ^
 ^<ul^> ^
 ^<li^>^<a href="#task9"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task10"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task11"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task12"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task13"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task14"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task15"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task16"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task17"^>№ 17^</a^>^</li^> ^
 ^<li^>^<a href="#task18"^>№ 18^</a^>^</li^> ^
 ^<li^>^<a href="#task19"^>№ 19^</a^>^</li^> ^
 ^<li^>^<a href="#task20"^>№ 20^</a^>^</li^> ^
 ^<li^>^<a href="#task21"^>№ 21^</a^>^</li^> ^
 ^<li^>^<a href="#task22"^>№ 22^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

echo ^<div class="section"^>>>%filename%

type writingphp01.html>>%filename%
type writingphp02.html>>%filename%
type writingphp03.html>>%filename%
type writingphp04.html>>%filename%

echo ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%

type taskjs01.html>>%filename%
type taskjs02.html>>%filename%
type taskjs03.html>>%filename%
type taskjs04.html>>%filename%
type taskjs05.html>>%filename%
type taskjs06.html>>%filename%
type taskjs07.html>>%filename%
type taskjs08.html>>%filename%
type task09.html>>%filename%
type task10.html>>%filename%
type taskjs11.html>>%filename%
type taskjs12.html>>%filename%
type taskjs13.html>>%filename%
type taskjs14.html>>%filename%
type taskjs15.html>>%filename%
type taskjs16.html>>%filename%
type taskjs17.html>>%filename%
type taskjs18.html>>%filename%
type taskjs19.html>>%filename%
type taskjs20.html>>%filename%
type taskjs21.html>>%filename%
type taskjs22.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%