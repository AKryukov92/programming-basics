chcp 65001
set lang=csharp
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
 ^<body class="section"^> ^
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^>>> %filename%

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#task9701"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task3784"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task6732"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task6882"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task1212"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task9472"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task5081"^>№ 7^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type link_c2_p8.4.html>>%filename%
type taskcs9701.html>>%filename%
type taskcs3784.html>>%filename%
type taskcs6732.html>>%filename%
type task6882.html>>%filename%
type task1212.html>>%filename%
type task9472.html>>%filename%
type task5081.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

pushd ..\..\%lang%\
mkdir files
popd

pushd ..\..\%lang%\files\
mkdir task6882
mkdir task1212
mkdir task9472
mkdir task5081
popd

pushd "task6882"
copy "*" "..\..\..\%lang%\files\task6882\*"
popd
pushd "task1212"
copy "*" "..\..\..\%lang%\files\task1212\*"
popd
pushd "task9472"
copy "*" "..\..\..\%lang%\files\task9472\*"
popd
pushd "task5081"
copy "*" "..\..\..\%lang%\files\task5081\*"
popd

if x%1==x start "" %filename%