chcp 65001
set lang=js
if "%1"=="" (
  set index=3
) else (
  set index=%1
)
set chapter=Проверка исходных данных
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
 ^<li^>^<a href="#task9298" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task4312"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task3354"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task5201"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task2981"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task8833" class="example"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task9020"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task1934"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task3943"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task4913"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task2361" class="example"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task5063"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task5870"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task7237"^>№ 14^</a^>^</li^> ^
 ^</ul^> ^
 ^<ul^> ^
 ^<li^>^<a href="#task7619"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task1346"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task9622"^>№ 17^</a^>^</li^> ^
 ^<li^>^<a href="#task8873"^>№ 18^</a^>^</li^> ^
 ^<li^>^<a href="#task7799"^>№ 19^</a^>^</li^> ^
 ^<li^>^<a href="#task9354"^>№ 20^</a^>^</li^> ^
 ^<li^>^<a href="#task9130"^>№ 21^</a^>^</li^> ^
 ^<li^>^<a href="#task5895"^>№ 22^</a^>^</li^> ^
 ^<li^>^<a href="#task2461"^>№ 23^</a^>^</li^> ^
 ^<li^>^<a href="#task2790"^>№ 24^</a^>^</li^> ^
 ^<li^>^<a href="#task2624"^>№ 25^</a^>^</li^> ^
 ^<li^>^<a href="#task5871"^>№ 26^</a^>^</li^> ^
 ^<li^>^<a href="#task3591"^>№ 27^</a^>^</li^> ^
 ^<li^>^<a href="#task4366"^>№ 28^</a^>^</li^> ^
 ^<li^>^<a href="#task5789"^>№ 29^</a^>^</li^> ^
 ^<li^>^<a href="#task6522"^>№ 30^</a^>^</li^> ^
 ^<li^>^<a href="#task3490"^>№ 31^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type link_c2_p8.1.html>>%filename%
type task9298.html>>%filename%
type task4312.html>>%filename%
type task3354.html>>%filename%
type link_c3_p11.1.html>>%filename%
type task5201.html>>%filename%
type task2981.html>>%filename%
type task8833.html>>%filename%
type task9020.html>>%filename%
type link_c3_p11.2.html>>%filename%
type task1934.html>>%filename%
type task3943.html>>%filename%
type task4913.html>>%filename%
type task2361.html>>%filename%
type task5063.html>>%filename%
type task5870.html>>%filename%
type task7237.html>>%filename%
type task7619.html>>%filename%
type task1346.html>>%filename%
type task9622.html>>%filename%
type link_c3_p12.1.html>>%filename%
type task8873.html>>%filename%
type task7799.html>>%filename%
type task9354.html>>%filename%
type task9130.html>>%filename%
type task5895.html>>%filename%
type task2461.html>>%filename%
type task2790.html>>%filename%
type task2624.html>>%filename%
type task5871.html>>%filename%
type task3591.html>>%filename%
type task4366.html>>%filename%
type task5789.html>>%filename%
type task6522.html>>%filename%
type task3490.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

pushd images
copy "task7799.png" "..\..\..\%lang%\images\task7799.png"
popd

if "%2"=="" start "" %filename%