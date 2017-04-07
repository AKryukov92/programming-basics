chcp 65001
set lang=csharp
set index=7
set chapter=Строки
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
 ^<li^>^<a href="#writing8165"^>П 1^</a^>^</li^> ^
 ^<li^>^<a href="#writing9001"^>П 2^</a^>^</li^> ^
 ^<li^>^<a href="#task9631"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task9812"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task5728"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task7491"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task5923"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task4265"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task2166"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task9116"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task9925"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task1618"^>№ 10^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

echo ^<div class="section"^>>>%filename%

type writingcs8165.html>>%filename%
type writingcs9001.html>>%filename%

echo ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%

type task9631.html>>%filename%
type task9812.html>>%filename%
type task5728.html>>%filename%
type task7491.html>>%filename%
type task5923.html>>%filename%
type task4265.html>>%filename%
type task2166.html>>%filename%
type task9116.html>>%filename%
type task9925.html>>%filename%
type task1618.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%