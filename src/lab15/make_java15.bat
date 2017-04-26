chcp 65001
set lang=java
set index=15
set chapter=Коллекции
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
 ^<li^>^<a href="#task8787"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task5087" class="example"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task9990"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task9924"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task7657"^>№ 5^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

echo ^<div class="section"^>>>%filename%

type taskjava8787.html>>%filename%
type task5087.html>>%filename%
type task9990.html>>%filename%
type task9924.html>>%filename%
type task7657.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

pushd ..\..\%lang%\
mkdir files
popd

pushd ..\..\%lang%\files
mkdir task9990
mkdir task9924
mkdir task7657
popd

pushd "task9990"
copy "*" "..\..\..\%lang%\files\task9990\*"
popd
pushd "task9924"
copy "*" "..\..\..\%lang%\files\task9924\*"
popd
pushd "task7657"
copy "*" "..\..\..\%lang%\files\task7657\*"
popd

if x%1==x start "" %filename%