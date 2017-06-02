@echo off
pushd ..\csharp
rmdir files /s /q
rmdir images /s /q
del *.html
del *.docx
rmdir code-complete-citations /s /q
popd
mkdir "..\csharp\code-complete-citations\"
copy code-complete-citations\*.html ..\csharp\code-complete-citations\*.html
copy code-complete-citations\*.css ..\csharp\code-complete-citations\*.css
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