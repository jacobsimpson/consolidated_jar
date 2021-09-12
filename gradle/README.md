# Consolidated Jar

A mini project demonstrating how to configure the build system to create
a consolidated jar with the artifacts of the build process.

A consolidated jar contains all the class files and jar contents necessary to
execute the compiled java program.

The final step is to munge a bash script on the front of the jar file. Once
that is done, the script+jar is made executable. Then, when a Unix style OS
tries to execute the script+jar, the Unix interpreter will run the bash script
at the beginning of the file. The bash script starts a Java interpreter with
the script_+jar file as the jar file parameter. Java will ignore the text at
the beginning of the script+jar file and keep reading until it finds the jar
portion of the file.

## How to Build

```bash
gradle
chmod a+x build/util
build/util
```
