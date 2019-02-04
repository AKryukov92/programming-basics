chcp 65001
set lang=csharp
if "%1"=="" (
  set index=4
) else (
  set index=%1
)
set chapter=Взаимоисключающие случаи
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
 ^<li^>^<a href="#task3072" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task5980"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task8174"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task7178"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task1186"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task4257"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task3883"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task1763"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task1945"^>№ 9^</a^>^</li^> ^
 ^</ul^> ^
 ^<ul^> ^
 ^<li^>^<a href="#task8878" class="example"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task6291"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task5662"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task2291"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task8518" class="example"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task1292"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task4527"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task6556"^>№ 17^</a^>^</li^> ^
 ^<li^>^<a href="#task3878"^>№ 18^</a^>^</li^> ^
 ^<li^>^<a href="#task2153"^>№ 19^</a^>^</li^> ^
 ^<li^>^<a href="#task7937"^>№ 20^</a^>^</li^> ^
 ^<li^>^<a href="#task8135"^>№ 21^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

REM Два взаимоисключающих случая if() {} else {}
type task3072.html>>%filename%
type link_c4_p15.1.html>>%filename%
type task5980.html>>%filename%
type link_c4_p19.4.html>>%filename%
type task8174.html>>%filename%
type task7178.html>>%filename%
type task1186.html>>%filename%
type task4257.html>>%filename%
type task3883.html>>%filename%
REM Формулы для вычисления таковы, что площади могут быть равны только если вводит понятие погрешности
type task1763.html>>%filename%
type task1945.html>>%filename%
REM Несколько взаимоисключающих случаев if() {} else if() {} else {}
type task8878.html>>%filename%
type task6291.html>>%filename%
type task5662.html>>%filename%
type link_c4_p19.2.html>>%filename%
type task2291.html>>%filename%
REM Одна задача, решение которой нужно для объяснения циклов и массивов потом
type task8518.html>>%filename%
REM Похожая задача, на самостоятельное выполнение
type task1292.html>>%filename%
REM Просто задачи повышенного уровня сложности
type task4527.html>>%filename%
type task6556.html>>%filename%
type link_c2_p5.3.html>>%filename%
type task3878.html>>%filename%
type task2153.html>>%filename%
type task7937.html>>%filename%
type task8135.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

pushd images
copy "example6556.png" "..\..\..\%lang%\images\example6556.png"
popd

if "%2"=="" start "" %filename%