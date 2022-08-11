# Part-2: Compile and run a program containing multiple packages

Compiling a program containing multiple packages is trivialy simple: Just as in
part one the `javac` program is used in exactly the same manner to compile the
source files:

```bash
javac src/main/java/me/learning/ArgsPrinterApplication.java src/main/java/me/learning/argsprinter/ArgsPrinter.java
```

This will again create the class files in the same location as their
corresponding Java source files.

Running the newly compiled program is achieved by invocing the `java` program as
specified in part one, one just has to make sure to invoke the class file that
contains the main method.

Also, mind that now the package hierarchy needs to be prepended to the class
file name, so in this example's case it would be:

```bash
java -classpath src/main/java me.learning.ArgsPrinterApplication
```

