chcp 65001
set lang=js
set index=12
set title=Функции
set chapter=Оформление подпрограмм с помощью функций
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

echo ^<!DOCTYPE html^> ^
 ^<html^> ^
 ^<head^> ^
 ^<meta charset=^"utf-8^"/^> ^
 ^<title^>%index% %title%^</title^> ^
 ^<style^>> %filename%

type ..\styles.css >> %filename%

echo ^</style^> ^
 ^</head^> ^
 ^<body class="section"^> ^
 ^<a name="heading"^>^<h1^>%title%^</h1^>^</a^> ^
 ^<h2^>%chapter%^</h2^>>> %filename%

type ..\nav_js.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#task5164"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task2354"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task2030"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task7649"^>№ 4^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type link_c2_p7.html>>%filename%
type task5164.html>>%filename%
type task2354.html>>%filename%
type link_c2_p7.1.html>>%filename%
type task2030.html>>%filename%
type link_c2_p7.2.html>>%filename%
type task7649.html>>%filename%
type link_c2_p7.3.html>>%filename%
type link_c2_p7.5.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

copy "Письменные задания к ЛР%index% %lang%.docx" "..\..\%lang%\Письменные задания к ЛР%index%.docx"

pushd ..\..\%lang%\
rmdir lab12 /s /q
mkdir lab12
popd
xcopy ..\..\решения\js\task5164 ..\..\%lang%\lab12\task5164 /s /I
xcopy ..\..\решения\js\task2354 ..\..\%lang%\lab12\task2354 /s /I
xcopy ..\..\решения\js\task2030 ..\..\%lang%\lab12\task2030 /s /I
xcopy ..\..\решения\js\task7649 ..\..\%lang%\lab12\task7649 /s /I

if x%1==x start "" %filename%