chcp 65001
set lang=java
set index=11
set title=Двумерные массивы
set chapter=Алгоритмы работы с двумерными массивами
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

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
 ^<li^>^<a href="#info1"^>справка^</a^>^</li^> ^
 ^<li^>^<a href="#task9299"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task7560"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task9002"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task7432"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task1954"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task2048"^>№ 6^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
echo ^<div class="section"^>>>%filename%

type info01.html>>%filename%

echo ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%

type task9299.html>>%filename%
type task7560.html>>%filename%
type task9002.html>>%filename%
type task7432.html>>%filename%
type task1954.html>>%filename%
type task2048.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

pushd ..\..\%lang%\files\
mkdir task9299
mkdir task7560
mkdir task9002
mkdir task7432
mkdir task1954
mkdir task2048
popd

pushd "task9299"
copy "*" "..\..\..\%lang%\files\task9299\*"
popd
pushd "task7560"
copy "*" "..\..\..\%lang%\files\task7560\*"
popd
pushd "task9002"
copy "*" "..\..\..\%lang%\files\task9002\*"
popd
pushd "task7432"
copy "*" "..\..\..\%lang%\files\task7432\*"
popd
pushd "task1954"
copy "*" "..\..\..\%lang%\files\task1954\*"
popd
pushd "task2048"
copy "*" "..\..\..\%lang%\files\task2048\*"
popd

if x%1==x start "" %filename%