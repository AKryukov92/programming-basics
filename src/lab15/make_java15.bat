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
 ^<li^>^<a href="#task5087" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task1056" class="example"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task9990"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task7738"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task8418"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task9512" class="example"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task9924"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task7657"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task8258" class="example"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task7186"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task1457"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task6876"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task5108"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task3956" class="example"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task2033"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task6981"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task1753"^>№ 17^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type task5087.html>>%filename%
type task1056.html>>%filename%
type task9990.html>>%filename%
type task7738.html>>%filename%
type taskjava8418.html>>%filename%
type taskjava9512.html>>%filename%
type task9924.html>>%filename%
type task7657.html>>%filename%
type task8258.html>>%filename%
type task7186.html>>%filename%
type task1457.html>>%filename%
type task6876.html>>%filename%
type task5108.html>>%filename%
type task3956.html>>%filename%
type task2033.html>>%filename%
type task6981.html>>%filename%
type task1753.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

pushd ..\..\%lang%\files
mkdir task9990
mkdir task7738
mkdir task9924
mkdir task7657
mkdir task5108
mkdir task2033
mkdir task6981
mkdir task1753
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
pushd "task5108"
copy "*" "..\..\..\%lang%\files\task5108\*"
popd
pushd "task2033"
copy "*" "..\..\..\%lang%\files\task2033\*"
popd
pushd "task6981"
copy "*" "..\..\..\%lang%\files\task6981\*"
popd
pushd "task1753"
copy "*" "..\..\..\%lang%\files\task1753\*"
popd

if x%1==x start "" %filename%