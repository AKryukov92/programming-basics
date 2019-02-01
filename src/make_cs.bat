@echo off
chcp 65001
pushd ..\csharp
rmdir files /s /q
rmdir images /s /q
rmdir конспекты /s /q
rmdir handlers /s /q
del *.html
del *.docx
mkdir files
mkdir images
mkdir конспекты
popd
pushd lab01
call make_cs01 1 skip
popd
pushd lab02
call make_cs02 2 skip
popd
pushd lab03
call make_cs03 3 skip
popd
pushd lab04
call make_cs04 4 skip
popd
pushd lab05
call make_cs05 5 skip
popd
pushd lab06
call make_cs06 6 skip
popd
pushd lab07
call make_cs07 7 skip
popd
pushd lab061
call make_cs061 8 skip
popd
pushd lab08
call make_cs08 9 skip
popd
pushd lab09
call make_cs09 10 skip
popd
pushd lab10
call make_cs10 11 skip
popd
REM pushd lab11
REM call make_cs11 -1 skip
REM popd
pushd lab12 
call make_cs12 12 skip
popd
pushd lab13
call make_cs13 13 skip
popd
pushd lab14
call make_cs14 14 skip
popd
pushd lab15
call make_cs15 15 skip
popd
REM pushd lab16
REM call make_cs16 -2 skip
REM popd
pause