chcp 65001
set lang=java
if "%1"=="" (
  set index=12
) else (
  set index=%1
)
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

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#task7740" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task1439"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task1934" class="example"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task3943"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task9020" class="example"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task5871"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task7799"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task9354"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task5170"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task6882" class="example"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task1212"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task9472"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task5081"^>№ 13^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type link_c2_p8.4.html>>%filename%
type taskjava7740.html>>%filename%
type taskjava1439.html>>%filename%
type taskjava1934.html>>%filename%
type taskjava3943.html>>%filename%
type taskjava9020.html>>%filename%
type taskjava5871.html>>%filename%
type taskjava7799.html>>%filename%
type taskjava9354.html>>%filename%
type taskjava5170.html>>%filename%
type task6882.html>>%filename%
type task1212.html>>%filename%
type task9472.html>>%filename%
type task5081.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

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
copy ..\..\решения\java\src\Lab13Task9701.java ..\..\%lang%\lab13\Lab12Task9701.java
copy ..\..\решения\java\src\Lab13Task3784.java ..\..\%lang%\lab13\Lab12Task3784.java
copy ..\..\решения\java\src\Lab13Task6732.java ..\..\%lang%\lab13\Lab12Task6732.java

if "%2"=="" start "" %filename%