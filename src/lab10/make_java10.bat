chcp 65001
set lang=java
set index=10
set chapter=Запись в файлы
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
 ^<li^>^<a href="#info1"^>справка 1^</a^>^</li^> ^
 ^<li^>^<a href="#info2"^>справка 2^</a^>^</li^> ^
 ^<li^>^<a href="#task9300" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task3951" class="supervision"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task7343"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task7060"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task6409"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task2386" class="example"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task4342"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task9159"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task5309" class="supervision"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task3290"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task5345"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task6812"^>№ 12^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%

type info01.html>>%filename%
type info02.html>>%filename%

echo ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%

type task9300.html>>%filename%
type task3951.html>>%filename%
type task7343.html>>%filename%
type task7060.html>>%filename%
type task6409.html>>%filename%
type task2386.html>>%filename%
type task4342.html>>%filename%
type task9159.html>>%filename%
type task5309.html>>%filename%
type task3290.html>>%filename%
type task5345.html>>%filename%
type task6812.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

pushd ..\..\%lang%\
mkdir images
popd

pushd ..\..\%lang%\images
mkdir task9300
mkdir task3951
mkdir task6409
mkdir task7343
mkdir task7060
popd

copy "Main example.png" "..\..\%lang%\images\Main example.png"

pushd "task9300"
copy "*.png" "..\..\..\%lang%\images\task9300\*.png"
popd
pushd "task3951"
copy "*.png" "..\..\..\%lang%\images\task3951\*.png"
popd
pushd "task6409"
copy "*.png" "..\..\..\%lang%\images\task6409\*.png"
popd
pushd "task7343"
copy "*.png" "..\..\..\%lang%\images\task7343\*.png"
popd
pushd "task7060"
copy "*.png" "..\..\..\%lang%\images\task7060\*.png"
popd

if x%1==x start "" %filename%