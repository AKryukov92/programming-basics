chcp 65001
set lang=csharp
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

type ..\nav_cs.html>> %filename%

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

type writing01.html>>%filename%
type writing02.html>>%filename%
type writing03.html>>%filename%
type writing04.html>>%filename%

echo ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%

type task01.html>>%filename%
type task02.html>>%filename%
type task03.html>>%filename%
type task04.html>>%filename%
type task05.html>>%filename%
type task06.html>>%filename%
type task07.html>>%filename%
type task08.html>>%filename%
type task09.html>>%filename%
type task10.html>>%filename%
type task11.html>>%filename%
type task12.html>>%filename%
type task13.html>>%filename%
type task14.html>>%filename%
type task15.html>>%filename%
type task16.html>>%filename%
type task17.html>>%filename%
type task18.html>>%filename%
type task19.html>>%filename%
type task20.html>>%filename%
type task21.html>>%filename%
type task22.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%