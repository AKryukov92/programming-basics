chcp 65001
set lang=java
set index=9
set chapter=Чтение файлов
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

pushd ..\..\
mkdir %lang%
popd

pushd ..\..\%lang%\
mkdir files
popd

pushd ..\..\%lang%\files\
mkdir "9 ОСАЛП"
popd

pushd "..\..\%lang%\files\9 ОСАЛП"
mkdir task01
mkdir task02
mkdir task03
mkdir task04
mkdir task05
mkdir task06
mkdir task07
mkdir task08
mkdir task09
mkdir task10
mkdir task11
mkdir task12
mkdir task13
mkdir task14
mkdir task15
mkdir task16
mkdir task17
popd

pushd "..\..\9 ОСАЛП\task01"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task01\*"
popd
pushd "..\..\9 ОСАЛП\task02"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task02\*"
popd
pushd "..\..\9 ОСАЛП\task03"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task03\*"
popd
pushd "..\..\9 ОСАЛП\task04"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task04\*"
popd
pushd "..\..\9 ОСАЛП\task05"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task05\*"
popd
pushd "..\..\9 ОСАЛП\task06"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task06\*"
popd
pushd "..\..\9 ОСАЛП\task07"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task07\*"
popd
pushd "..\..\9 ОСАЛП\task08"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task08\*"
popd
pushd "..\..\9 ОСАЛП\task09"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task09\*"
popd
pushd "..\..\9 ОСАЛП\task10"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task10\*"
popd
pushd "..\..\9 ОСАЛП\task11"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task11\*"
popd
pushd "..\..\9 ОСАЛП\task12"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task12\*"
popd
pushd "..\..\9 ОСАЛП\task13"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task13\*"
popd
pushd "..\..\9 ОСАЛП\task14"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task14\*"
popd
pushd "..\..\9 ОСАЛП\task15"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task15\*"
popd
pushd "..\..\9 ОСАЛП\task16"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task16\*"
popd
pushd "..\..\9 ОСАЛП\task17"
copy "*" "..\..\%lang%\files\9 ОСАЛП\task17\*"
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
 ^<li^>^<a href="#task14"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task15"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task16"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task17"^>№ 17^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

type info.html>>%filename%

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

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%