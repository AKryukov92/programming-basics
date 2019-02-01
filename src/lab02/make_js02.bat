chcp 65001
set lang=js
if "%1"=="" (
  set index=2
) else (
  set index=%1
)
set chapter=Организация вычислений
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

type ..\nav_js.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#task3862" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task9231" class="example"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task4411" class="example"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task3832" class="supervision"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task7457"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task9865"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task8428" class="example"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task7711" class="example"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task1262" class="supervision"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task9164"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task3558"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task6924"^>№ 12^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type task3862.html>>%filename%
type task9231.html>>%filename%
type task4411.html>>%filename%
type task3832.html>>%filename%
type task7457.html>>%filename%
type task9865.html>>%filename%
type task8428.html>>%filename%
type link_c7_p32.5.html>>%filename%
type task7711.html>>%filename%
type task1262.html>>%filename%
type task9164.html>>%filename%
type task3558.html>>%filename%
type task6924.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

pushd images
copy "task7799.png" "..\..\..\%lang%\images\task7799.png"
popd

if "%2"=="" start "" %filename%