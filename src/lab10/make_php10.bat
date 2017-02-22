chcp 65001
set lang=php
set index=10
set chapter=Запись в файлы
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

pushd ..\..\
mkdir %lang%
popd

pushd ..\..\%lang%\
mkdir images
popd

pushd ..\..\%lang%\images
mkdir "10 ОСАЛП"
popd

pushd "..\..\%lang%\images\10 ОСАЛП"
mkdir task01
mkdir task02
mkdir task03
mkdir task04
mkdir task05
popd

pushd "..\..\10 ОСАЛП"
copy "Main example.png" "..\%lang%\images\10 ОСАЛП\Main example.png"
popd
pushd "..\..\10 ОСАЛП\task01"
copy "*.png" "..\..\%lang%\images\10 ОСАЛП\task01\*.png"
popd
pushd "..\..\10 ОСАЛП\task02"
copy "*.png" "..\..\%lang%\images\10 ОСАЛП\task02\*.png"
popd
pushd "..\..\10 ОСАЛП\task03"
copy "*.png" "..\..\%lang%\images\10 ОСАЛП\task03\*.png"
popd
pushd "..\..\10 ОСАЛП\task04"
copy "*.png" "..\..\%lang%\images\10 ОСАЛП\task04\*.png"
popd
pushd "..\..\10 ОСАЛП\task05"
copy "*.png" "..\..\%lang%\images\10 ОСАЛП\task05\*.png"
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
 ^<li^>^<a href="#info1"^>И 1^</a^>^</li^> ^
 ^<li^>^<a href="#info2"^>И 2^</a^>^</li^> ^
 ^<li^>^<a href="#task1"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task2"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task3"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task4"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task5"^>№ 5^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

echo ^<div class="section"^>>>%filename%

type info01.html>>%filename%
type info02.html>>%filename%

echo ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%

type task01.html>>%filename%
type task02.html>>%filename%
type task03.html>>%filename%
type task04.html>>%filename%
type task05.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%