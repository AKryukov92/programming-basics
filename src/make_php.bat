@echo off
chcp 65001
pushd ..
mkdir php
popd
pushd ..\php
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
call make_php01 skip
popd
pushd lab02
call make_php02 skip
popd
pushd lab05
call make_php05 skip
popd
pushd lab06
call make_php06 skip
popd
pushd lab07
call make_php07 skip
popd
pushd lab08
call make_php08 skip
popd
pushd lab09
call make_php09 skip
popd
pushd lab10
call make_php10 skip
popd
pushd lab12 
call make_php12 skip
popd
pause