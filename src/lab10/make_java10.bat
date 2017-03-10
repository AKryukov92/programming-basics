chcp 65001
set lang=java
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
mkdir task9300
mkdir task3951
mkdir task6409
mkdir task7343
mkdir task7060
popd

pushd "..\..\10 ОСАЛП"
copy "Main example.png" "..\%lang%\images\10 ОСАЛП\Main example.png"
popd
pushd "..\..\10 ОСАЛП\task9300"
copy "*.png" "..\..\%lang%\images\10 ОСАЛП\task9300\*.png"
popd
pushd "..\..\10 ОСАЛП\task3951"
copy "*.png" "..\..\%lang%\images\10 ОСАЛП\task3951\*.png"
popd
pushd "..\..\10 ОСАЛП\task6409"
copy "*.png" "..\..\%lang%\images\10 ОСАЛП\task6409\*.png"
popd
pushd "..\..\10 ОСАЛП\task7343"
copy "*.png" "..\..\%lang%\images\10 ОСАЛП\task7343\*.png"
popd
pushd "..\..\10 ОСАЛП\task7060"
copy "*.png" "..\..\%lang%\images\10 ОСАЛП\task7060\*.png"
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
 ^<li^>^<a href="#info1"^>И 1^</a^>^</li^> ^
 ^<li^>^<a href="#info2"^>И 2^</a^>^</li^> ^
 ^<li^>^<a href="#task9300"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task3951"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task6409"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task7343"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task7060"^>№ 5^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

echo ^<div class="section"^>>>%filename%

type info01.html>>%filename%
type info02.html>>%filename%

echo ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%

type task9300.html>>%filename%
type task3951.html>>%filename%
type task6409.html>>%filename%
type task7343.html>>%filename%
type task7060.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%