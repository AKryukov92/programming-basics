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
call make_js01 skip
popd
pushd lab02
call make_js02 skip
popd
pushd lab03
call make_js03 skip
popd
pushd lab04
call make_js04 skip
popd
pushd lab05
call make_js05 skip
popd
pushd lab06
call make_js06 skip
popd
pushd lab07
call make_js07 skip
popd
pushd lab08
call make_js08 skip
popd
pushd lab12
call make_js12 skip
popd
pushd lab13
call make_js13 skip
popd
pushd lab14
call make_js14 skip
popd
pushd lab16
call make_js16 skip
popd
copy /Y base.html ..\js 
pause