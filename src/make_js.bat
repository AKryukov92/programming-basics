@echo off
chcp 65001
pushd ..
mkdir js
popd
pushd ..\js
rmdir files /s /q
rmdir images /s /q
rmdir конспекты /s /q
rmdir handlers /s /q
del *.html
del *.docx
mkdir files
mkdir images
mkdir конспекты
mkdir handlers
popd
pushd lab01
call make_js01 1 skip
popd
pushd lab02
call make_js02 2 skip
popd
pushd lab03
call make_js03 3 skip
popd
pushd lab04
call make_js04 4 skip
popd
pushd lab05
call make_js05 5 skip
popd
pushd lab06
call make_js06 6 skip
popd
pushd lab07
call make_js07 7 skip
popd
pushd lab08
call make_js08 8 skip
popd
pushd lab12
call make_js12 9 skip
popd
pushd lab13
call make_js13 10 skip
popd
pushd lab14
call make_js14 11 skip
popd
pushd lab16
call make_js16 12 skip
popd
copy /Y base.html ..\js 
pause