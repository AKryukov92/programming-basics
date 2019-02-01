chcp 65001
set lang=csharp
if "%1"=="" (
  set index=5
) else (
  set index=%1
)
set chapter=Работа с интервалами значений
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
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^>>>%filename%

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#task8715" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task3770"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task8867"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task7865"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task7991"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task8751"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task4858"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task6589"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task3864"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task5635"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task1217"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task1438"^>№ 12^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type task8715.html>>%filename%
type task3770.html>>%filename%
type task8867.html>>%filename%
type task7865.html>>%filename%
type link_c4_p19.3.html>>%filename%
type task7991.html>>%filename%
type task8751.html>>%filename%
type task4858.html>>%filename%
type task6589.html>>%filename%
type task3864.html>>%filename%
type link_c4_p19.1.html>>%filename%
type task5635.html>>%filename%
type task1217.html>>%filename%
type task1438.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

pushd images
copy "example5635.png" "..\..\..\%lang%\images\example5635.png"
popd

if "%2"=="" start "" %filename%