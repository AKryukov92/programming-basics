chcp 65001
set lang=js
set index=13
set chapter=Исключения
set filename="..\..\%lang%\Задания к %index% практической работе.html"

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
 ^<li^>^<a href="#task7740" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task1439"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task9020" class="example"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task3943"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task7799"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task9354"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task5170"^>№ 7^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type link_c2_p8.4.html>>%filename%
type taskjs7740.html>>%filename%
type taskjs1439.html>>%filename%
type taskjs9020.html>>%filename%
type taskjs3943.html>>%filename%
type taskjs7799.html>>%filename%
type taskjs9354.html>>%filename%
type taskjs5170.html>>%filename%

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