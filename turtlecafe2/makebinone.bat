cd %1
mkdir bin
copy src\*.jpg bin\*.jpg
copy src\*.gif bin\*.gif
copy src\*.png bin\*.png
copy src\*.mid bin\*.mid
copy src\*.wav bin\*.wav
copy src\*.mp3 bin\*.mp3	
javac -target 1.5 -classpath ../blib.jar -sourcepath src -d bin src/*.java
jar cvf binary.jar -C bin .
cd ..

