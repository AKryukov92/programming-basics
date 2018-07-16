chcp 65001
set lang=csharp
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

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#task9020" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task3943"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task7799"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task9354"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task5170"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task6882" class="example"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task1212"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task9472"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task5081"^>№ 9^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type link_c2_p8.4.html>>%filename%
type taskcs9020.html>>%filename%
type taskcs3943.html>>%filename%
type taskcs7799.html>>%filename%
type taskcs9354.html>>%filename%
type taskcs5170.html>>%filename%
type task6882.html>>%filename%
type task1212.html>>%filename%
type task9472.html>>%filename%
type task5081.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

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

pushd ..\..\%lang%\
rmdir lab13 /s /q
mkdir lab13
popd
xcopy ..\..\решения\cs\task9701 ..\..\%lang%\lab13\task9701 /s /I
xcopy ..\..\решения\cs\task3784 ..\..\%lang%\lab13\task3784 /s /I
xcopy ..\..\решения\cs\task6732 ..\..\%lang%\lab13\task6732 /s /I

if x%1==x start "" %filename%