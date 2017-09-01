rm -rf index.sdoc
rm -rf html4
for /D %%i in (intro* chapter* appendix*) do (
	rm -rf %%i/index.sdoc %%i/binary.jar %%i/bin %%i/src/Turtle.java %%i/src/TurtleLaunchApplet.java
)
