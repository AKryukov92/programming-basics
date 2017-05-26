chcp 65001
set lang=csharp
set index=12
set title=Методы
set chapter=Оформление подпрограмм с помощью методов
set filename="..\..\%lang%\[%index%] лаб. ОСАЛП.html"

pushd ..\..\
mkdir %lang%
popd

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

type ..\nav_cs.html>> %filename%

echo ^<div class="nav"^> ^
 ^<ul^> ^
 ^<li^>^<a href="#heading"^>^^^</a^>^</li^> ^
 ^<li^>^<a href="#task5164"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task2354"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task2030"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task7649"^>№ 4^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%

type taskcs5164.html>>%filename%
type taskcs2354.html>>%filename%
type taskcs2030.html>>%filename%
type taskcs7649.html>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

if x%1==x start "" %filename%