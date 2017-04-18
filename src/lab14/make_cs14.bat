chcp 65001
set lang=csharp
set index=14
set chapter=Классы и объекты
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
 ^<body^> ^
 ^<a name="heading"^>^<h1^>%chapter%^</h1^>^</a^>>> %filename%

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#quiz"^>?^</a^>^</li^> ^
 ^<li^>^<a href="#writing5463"^>П 1^</a^>^</li^> ^
 ^<li^>^<a href="#task8403"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task3185"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task9914"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task6011"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task6037"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task2809"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task7297"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task5242"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task1379"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task2401"^>№ 10^</a^>^</li^> ^
 ^<li^>^<a href="#task5421"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task7301"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task2000"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task4147"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task1953"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task3956"^>№ 16^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

echo ^<div class="section"^>>>%filename%

type writingcs5463.html>>%filename%

echo ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%

type taskcs8403.html>>%filename%
type taskcs3185.html>>%filename%
type taskcs9914.html>>%filename%
type taskcs6011.html>>%filename%
type taskcs6037.html>>%filename%
type taskcs2809.html>>%filename%
type taskcs7297.html>>%filename%
type taskcs5242.html>>%filename%
type taskcs1379.html>>%filename%
type taskcs2401.html>>%filename%
type taskcs5421.html>>%filename%
type taskcs7301.html>>%filename%
type taskcs2000.html>>%filename%
type taskcs4147.html>>%filename%
type taskcs1953.html>>%filename%
type taskcs3956.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

if x%1==x start "" %filename%