# Part-1: Compile and run a singular Java file

To compile a single Java file, the `javac` program is used. To compile a Java
source file like `ArgsPrinterApplication.java` do the following:

```bash
javac src/main/java/ArgsPrinterApplication.java
```

This will create a file with the name `ArgsPrinterApplication.class` in the same
location as its corresponding Java source file.

There are multiple options to run this newly compiled program. One could for
example navigate into the directory where the .class file resides and then
execute it:

```bash
cd src/main/java
java ArgsPrinterApplication
```

Another way is to pass the `classpath` argument to the `java` program. The
class path is a collection of paths and `.jar` files that contain `.class` files
and packages. To run the newly compiled program from anywhere by setting the
class path:

```bash
java -classpath /some/path/src/main/java ArgsPrinterApplication
```

The third way to specifiy the classpath is through an environment variable
called `CLASSPATH`.

