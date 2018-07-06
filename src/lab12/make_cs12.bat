chcp 65001
set lang=csharp
set index=12
set title=Методы
set chapter=Оформление подпрограмм с помощью методов
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

echo ^<!DOCTYPE html^> ^
 ^<html^> ^
 ^<head^> ^
 ^<meta charset=^"utf-8^"/^> ^
 ^<title^>%index% %title%^</title^> ^
 ^<style^>> %filename%

type ..\styles.css>>%filename%

echo ^</style^> ^
 ^</head^> ^
 ^<body class="section"^> ^
 ^<a name="heading"^>^<h1^>%title%^</h1^>^</a^> ^
 ^<h2^>%chapter%^</h2^>>> %filename%

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#info01"^>Подготовка^</a^>^</li^> ^
 ^<li^>^<a href="#task1860" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task4140"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task2632"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task7474"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task4411" class="example"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task2790"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task5662"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task3669"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task1292"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task2354"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task2030"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task7649"^>№ 4^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%
type link_c2_p7.html>>%filename%
type infocs01.html>>%filename%
echo ^</div^>>>%filename%

echo ^<div class="section"^>>>%filename%
type task1860.html>>%filename%
type task4140.html>>%filename%
type task2632.html>>%filename%
type task7474.html>>%filename%
type link_c2_p7.1.html>>%filename%
type taskcs4411.html>>%filename%
type taskcs2790.html>>%filename%
type taskcs5662.html>>%filename%
type taskcs3669.html>>%filename%
type taskcs1292.html>>%filename%


type link_c2_p7.html>>%filename%
type task5164.html>>%filename%
type task2354.html>>%filename%
type link_c2_p7.1.html>>%filename%
type task2030.html>>%filename%
type link_c2_p7.2.html>>%filename%
type task7649.html>>%filename%
type link_c2_p7.3.html>>%filename%
type link_c2_p7.5.html>>%filename%
echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index% %lang%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

pushd ..\..\%lang%\
rmdir lab12 /s /q
mkdir lab12
popd
xcopy ..\..\решения\cs\task5164 ..\..\%lang%\lab12\task5164 /s /I
xcopy ..\..\решения\cs\task2354 ..\..\%lang%\lab12\task2354 /s /I
xcopy ..\..\решения\cs\task2030 ..\..\%lang%\lab12\task2030 /s /I
xcopy ..\..\решения\cs\task7649 ..\..\%lang%\lab12\task7649 /s /I

if x%1==x start "" %filename%