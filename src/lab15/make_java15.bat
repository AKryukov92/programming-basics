chcp 65001
set lang=java
set index=15
set chapter=Коллекции
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

echo ^<!DOCTYPE html^> ^
 ^<html^> ^
 ^<head^> ^
 ^<meta charset=^"utf-8^"/^> ^
 ^<title^>%index% %chapter%^</title^> ^
 ^<style^>> %filename%

type ..\styles.css >> %filename%

echo ^</style^> ^
 ^</head^> ^
 ^<body class="section"^> ^
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^>>> %filename%

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#task8787"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task5087" class="example"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task9990" class="supervision"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task7738" class="supervision"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task9924"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task7657"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task8258" class="example"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task7186"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task1457"^>№ 9^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type task8787.html>>%filename%
type task5087.html>>%filename%
type task9990.html>>%filename%
type task7738.html>>%filename%
type task9924.html>>%filename%
type task7657.html>>%filename%
type task8258.html>>%filename%
type task7186.html>>%filename%
type task1457.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

pushd ..\..\%lang%\files
mkdir task9990
mkdir task7738
mkdir task9924
mkdir task7657
popd

pushd "task9990"
copy "*" "..\..\..\%lang%\files\task9990\*"
popd
pushd "task7738"
copy "*" "..\..\..\%lang%\files\task7738\*"
popd
pushd "task9924"
copy "*" "..\..\..\%lang%\files\task9924\*"
popd
pushd "task7657"
copy "*" "..\..\..\%lang%\files\task7657\*"
popd

if x%1==x start "" %filename%