chcp 65001
set lang=csharp
set index=9
set chapter=Чтение файлов
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
 ^<li^>^<a href="#task6175" class="example"^>№ 1^</a^>^</li^> ^
 ^<li^>^<a href="#task4488" class="supervision"^>№ 2^</a^>^</li^> ^
 ^<li^>^<a href="#task4954" class="supervision"^>№ 3^</a^>^</li^> ^
 ^<li^>^<a href="#task4642"^>№ 4^</a^>^</li^> ^
 ^<li^>^<a href="#task9765"^>№ 5^</a^>^</li^> ^
 ^<li^>^<a href="#task5537"^>№ 6^</a^>^</li^> ^
 ^<li^>^<a href="#task6431" class="supervision"^>№ 7^</a^>^</li^> ^
 ^<li^>^<a href="#task7193"^>№ 8^</a^>^</li^> ^
 ^<li^>^<a href="#task5847"^>№ 9^</a^>^</li^> ^
 ^<li^>^<a href="#task4769"^>№ 10^</a^>^</li^> ^
 ^</ul^> ^
 ^<ul^> ^
 ^<li^>^<a href="#task9930"^>№ 11^</a^>^</li^> ^
 ^<li^>^<a href="#task6861"^>№ 12^</a^>^</li^> ^
 ^<li^>^<a href="#task2205"^>№ 13^</a^>^</li^> ^
 ^<li^>^<a href="#task5032" class="example"^>№ 14^</a^>^</li^> ^
 ^<li^>^<a href="#task3567"^>№ 15^</a^>^</li^> ^
 ^<li^>^<a href="#task5108"^>№ 16^</a^>^</li^> ^
 ^<li^>^<a href="#task2033"^>№ 17^</a^>^</li^> ^
 ^<li^>^<a href="#task3226"^>№ 18^</a^>^</li^> ^
 ^<li^>^<a href="#task4372"^>№ 19^</a^>^</li^> ^
 ^<li^>^<a href="#task4463"^>№ 20^</a^>^</li^> ^
 ^<li^>^<a href="#task1668"^>№ 21^</a^>^</li^> ^
 ^<li^>^<a href="#task2137"^>№ 22^</a^>^</li^> ^
 ^</ul^> ^
 ^</div^>>>%filename%
 
type quiz.html>> %filename%

type info.html>>%filename%

echo ^<div class="section"^>>>%filename%

type task6175.html>>%filename%
type task4488.html>>%filename%
type task4954.html>>%filename%
type task4642.html>>%filename%
type task9765.html>>%filename%
type task5537.html>>%filename%
type task6431.html>>%filename%
type task7193.html>>%filename%
type task5847.html>>%filename%
type task4769.html>>%filename%
type task9930.html>>%filename%
type task6861.html>>%filename%
type task2205.html>>%filename%
type task5032.html>>%filename%
type task3567.html>>%filename%
type task5108.html>>%filename%
type task2033.html>>%filename%
type task3226.html>>%filename%
type task4372.html>>%filename%
type task4463.html>>%filename%
type task1668.html>>%filename%
type task2137.html>>%filename%

echo ^</div^>>>%filename%

echo ^</body^> ^
 ^</html^>>> %filename%

pushd ..\..\%lang%\
mkdir files
popd

pushd ..\..\%lang%\files\
mkdir task6175
mkdir task4488
mkdir task4642
mkdir task4954
mkdir task9765
mkdir task5537
mkdir task6431
mkdir task7193
mkdir task5847
mkdir task4769
mkdir task9930
mkdir task6861
mkdir task2205
mkdir task5032
mkdir task3567
mkdir task5108
mkdir task2033
mkdir task3226
mkdir task4372
mkdir task4463
mkdir task1668
mkdir task2137
popd

pushd "task6175"
copy "*" "..\..\..\%lang%\files\task6175\*"
popd
pushd "task4488"
copy "*" "..\..\..\%lang%\files\task4488\*"
popd
pushd "task4954"
copy "*" "..\..\..\%lang%\files\task4954\*"
popd
pushd "task4642"
copy "*" "..\..\..\%lang%\files\task4642\*"
popd
pushd "task9765"
copy "*" "..\..\..\%lang%\files\task9765\*"
popd
pushd "task5537"
copy "*" "..\..\..\%lang%\files\task5537\*"
popd
pushd "task6431"
copy "*" "..\..\..\%lang%\files\task6431\*"
popd
pushd "task7193"
copy "*" "..\..\..\%lang%\files\task7193\*"
popd
pushd "task5847"
copy "*" "..\..\..\%lang%\files\task5847\*"
popd
pushd "task4769"
copy "*" "..\..\..\%lang%\files\task4769\*"
popd
pushd "task9930"
copy "*" "..\..\..\%lang%\files\task9930\*"
popd
pushd "task6861"
copy "*" "..\..\..\%lang%\files\task6861\*"
popd
pushd "task2205"
copy "*" "..\..\..\%lang%\files\task2205\*"
popd
pushd "task5032"
copy "*" "..\..\..\%lang%\files\task5032\*"
popd
pushd "task3567"
copy "*" "..\..\..\%lang%\files\task3567\*"
popd
pushd "task5108"
copy "*" "..\..\..\%lang%\files\task5108\*"
popd
pushd "task2033"
copy "*" "..\..\..\%lang%\files\task2033\*"
popd
pushd "task3226"
copy "*" "..\..\..\%lang%\files\task3226\*"
popd
pushd "task4372"
copy "*" "..\..\..\%lang%\files\task4372\*"
popd
pushd "task4463"
copy "*" "..\..\..\%lang%\files\task4463\*"
popd
pushd "task1668"
copy "*" "..\..\..\%lang%\files\task1668\*"
popd
pushd "task2137"
copy "*" "..\..\..\%lang%\files\task2137\*"
popd

if x%1==x start "" %filename%