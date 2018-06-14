chcp 65001
set lang=js
set index=13
set chapter=Исключения
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

type ..\nav_%lang%.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#task9701"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task3784"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task6732"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task6454"^>№ 4^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type link_c2_p8.4.html>>%filename%
type task9701.html>>%filename%
type task3784.html>>%filename%
type task6732.html>>%filename%
type taskjs6454.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

pushd ..\..\%lang%\files\
mkdir task9701
mkdir task3784
mkdir task6732
popd

pushd "..\..\решения\js\task9701"
copy "*" "..\..\..\%lang%\files\task9701\*"
popd

pushd "..\..\решения\js\task3784"
copy "*" "..\..\..\%lang%\files\task3784\*"
popd

pushd "..\..\решения\js\task6732"
copy "*" "..\..\..\%lang%\files\task6732\*"
popd

pushd ..\..\%lang%\
rmdir lab13 /s /q
mkdir lab13
popd
xcopy ..\..\решения\js\task9701 ..\..\%lang%\lab13\task9701 /s /I
xcopy ..\..\решения\js\task3784 ..\..\%lang%\lab13\task3784 /s /I
xcopy ..\..\решения\js\task6732 ..\..\%lang%\lab13\task6732 /s /I

if x%1==x start "" %filename%