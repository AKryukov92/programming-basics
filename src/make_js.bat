@echo off
pushd ..
mkdir js
popd
pushd ..\js
rmdir files /s /q
rmdir images /s /q
del *.html
del *.docx
popd
pushd lab01
call make_js01 skip
popd
pushd lab02
call make_js02 skip
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