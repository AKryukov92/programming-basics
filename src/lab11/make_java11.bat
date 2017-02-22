chcp 65001
set lang=java
set index=11
set title=Двумерные массивы
set chapter=Алгоритмы работы с двумерными массивами
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

pushd ..\..\
mkdir %lang%
popd

pushd ..\..\%lang%\
mkdir files
popd

pushd ..\..\%lang%\files\
mkdir "11 ОСАЛП"
popd

pushd "..\..\%lang%\files\11 ОСАЛП"
mkdir task01
mkdir task02
mkdir task03
mkdir task04
mkdir task05
mkdir task06
popd

pushd "..\..\11 ОСАЛП\task1"
copy "*" "..\..\%lang%\files\11 ОСАЛП\task01\*"
popd
pushd "..\..\11 ОСАЛП\task2"
copy "*" "..\..\%lang%\files\11 ОСАЛП\task02\*"
popd
pushd "..\..\11 ОСАЛП\task3"
copy "*" "..\..\%lang%\files\11 ОСАЛП\task03\*"
popd
pushd "..\..\11 ОСАЛП\task4"
copy "*" "..\..\%lang%\files\11 ОСАЛП\task04\*"
popd
pushd "..\..\11 ОСАЛП\task5"
copy "*" "..\..\%lang%\files\11 ОСАЛП\task05\*"
popd
pushd "..\..\11 ОСАЛП\task6"
copy "*" "..\..\%lang%\files\11 ОСАЛП\task06\*"
popd

echo ^<!DOCTYPE html^> ^
 ^<html^> ^
 ^<head^> ^
 ^<meta charset=^"utf-8^"/^> ^
 ^<title^>%index% %title%^</title^> ^
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