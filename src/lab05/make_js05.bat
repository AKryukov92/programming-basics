chcp 65001
set lang=js
set index=5
set chapter=Разветвленные алгоритмы
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

pushd ..\..\
mkdir %lang%
popd

pushd ..\..\%lang%\
mkdir images
popd

pushd ..\..\images
copy "Области 1.png" "..\%lang%\images\Области 1.png"
copy "Области 2.png" "..\%lang%\images\Области 2.png"
copy "Области 3.png" "..\%lang%\images\Области 3.png"
copy "Области 4.png" "..\%lang%\images\Области 4.png"
copy "Области 5.png" "..\%lang%\images\Области 5.png"
copy "Области 6.png" "..\%lang%\images\Области 6.png"
copy "Области 7.png" "..\%lang%\images\Области 7.png"
copy "Области 8.png" "..\%lang%\images\Области 8.png"
copy "Области 9.png" "..\%lang%\images\Области 9.png"
copy "Области 10.png" "..\%lang%\images\Области 10.png"
copy "Области 11.png" "..\%lang%\images\Области 11.png"
copy "Области 12.png" "..\%lang%\images\Области 12.png"
copy "Области 13.png" "..\%lang%\images\Области 13.png"
copy "Области 14.png" "..\%lang%\images\Области 14.png"
copy "Области 15.png" "..\%lang%\images\Области 15.png"
copy "Области 16.png" "..\%lang%\images\Области 16.png"
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
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^>>>%filename%

type ..\nav_js.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#quiz"^>?^</a^>^</li^> ^
 ^<li^>^<a href="#writing1"^>П 1^</a^>^</li^> ^
 ^<li^>^<a href="#writing2"^>П 2^</a^>^</li^> ^
 ^<li^>^<a href="#writing3"^>П 3^</a^>^</li^> ^
 ^<li^>^<a href="#writing4"^>П 4^</a^>^</li^> ^
 ^<li^>^<a href="#writing5"^>П 5^</a^>^</li^> ^
 ^<li^>^<a href="#writing6"^>П 6^</a^>^</li^> ^
 ^<li^>^<a href="#task1"^>№ 1^</a^>^</li^> ^
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
 ^<li^>^<a href="#task13"^>№ 13^</a^>^</li^> ^
 ^</ul^> ^
 ^<ul^> ^
 ^<li^>^<a href="#task14"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task15"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task16"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task17"^>№ 17^</a^>^</li^> ^
 ^<li^>^<a href="#task18"^>№ 18^</a^>^</li^> ^
 ^<li^>^<a href="#task19"^>№ 19^</a^>^</li^> ^
 ^<li^>^<a href="#task20"^>№ 20^</a^>^</li^> ^
 ^<li^>^<a href="#task21"^>№ 21^</a^>^</li^> ^
 ^<li^>^<a href="#task22"^>№ 22^</a^>^</li^> ^
 ^<li^>^<a href="#task23"^>№ 23^</a^>^</li^> ^
 ^<li^>^<a href="#task24"^>№ 24^</a^>^</li^> ^
 ^<li^>^<a href="#task25"^>№ 25^</a^>^</li^> ^
 ^<li^>^<a href="#task26"^>№ 26^</a^>^</li^> ^
 ^<li^>^<a href="#task27"^>№ 27^</a^>^</li^> ^
 ^<li^>^<a href="#task28"^>№ 28^</a^>^</li^> ^
 ^<li^>^<a href="#task29"^>№ 29^</a^>^</li^> ^
 ^<li^>^<a href="#task30"^>№ 30^</a^>^</li^> ^
 ^<li^>^<a href="#task31"^>№ 31^</a^>^</li^> ^
 ^<li^>^<a href="#task32"^>№ 32^</a^>^</li^> ^
 ^<li^>^<a href="#task33"^>№ 33^</a^>^</li^> ^
 ^<li^>^<a href="#task34"^>№ 34^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

echo ^<div class="section"^>>>%filename%

type writingjs01.html>>%filename%
type writingjs02.html>>%filename%
type writing03.html>>%filename%
type writingjs04.html>>%filename%
type writingjs05.html>>%filename%
type writing06.html>>%filename%

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
type task23.html>>%filename%
type task24.html>>%filename%
type task25.html>>%filename%
type task26.html>>%filename%
type task27.html>>%filename%
type task28.html>>%filename%
type task29.html>>%filename%
type task30.html>>%filename%
type task31.html>>%filename%
type task32.html>>%filename%
type task33.html>>%filename%
type task34.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%