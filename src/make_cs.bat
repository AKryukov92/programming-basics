@echo off
chcp 65001
pushd ..\csharp
rmdir files /s /q
rmdir images /s /q
rmdir конспекты /s /q
del *.html
del *.docx
mkdir files
mkdir images
mkdir конспекты
popd
pushd lab01
call make_cs01 skip
popd
pushd lab02
call make_cs02 skip
popd
pushd lab05
call make_cs05 skip
popd
pushd lab06
call make_cs06 skip
popd
pushd lab07
call make_cs07 skip
popd
pushd lab08
call make_cs08 skip
popd
pushd lab09
call make_cs09 skip
popd
pushd lab10
call make_cs10 skip
popd
pushd lab11
call make_cs11 skip
popd
pushd lab12 
call make_cs12 skip
popd
pushd lab13
call make_cs13 skip
popd
pushd lab14
call make_cs14 skip
popd
pushd lab15
call make_cs15 skip
popd
pause