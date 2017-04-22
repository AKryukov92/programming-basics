chcp 65001
set lang=java
set index=13
set chapter=Исключения
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
 ^<li^>^<a href="#task9701"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task3784"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task6732"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task9765"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task6431"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task7193"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task2205"^>№ 7^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

echo ^<div class="section"^>>>%filename%

type taskjava9701.html>>%filename%
type taskjava3784.html>>%filename%
type taskjava6732.html>>%filename%
type task9765.html>>%filename%
type task6431.html>>%filename%
type task7193.html>>%filename%
type task2205.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

pushd ..\..\%lang%\
mkdir files
popd

pushd ..\..\%lang%\files\
mkdir task9765
mkdir task6431
mkdir task7193
mkdir task2205
popd

pushd "task9765"
copy "*" "..\..\..\%lang%\files\task9765\*"
popd
pushd "task6431"
copy "*" "..\..\..\%lang%\files\task6431\*"
popd
pushd "task7193"
copy "*" "..\..\..\%lang%\files\task7193\*"
popd
pushd "task2205"
copy "*" "..\..\..\%lang%\files\task2205\*"
popd

if x%1==x start "" %filename%