# Part-2: Compile and run a program containing multiple packages

## Compilation

Compiling a program containing multiple packages is trivialy simple: Just as in
part one the `javac` program is used in exactly the same manner to compile the
source files:

```bash
javac src/main/java/me/learning/ArgsPrinterApplication.java \
      src/main/java/me/learning/argsprinter/ArgsPrinter.java
```

This will again create the class files in the same location as their
corresponding Java source files.

It is advised to however put the generated class files in a separate location.
The `-d` option of `javac` can be used for this. Behold the following example:

```bash
javac -d build \
      src/main/java/me/learning/ArgsPrinterApplication.java \
      src/main/java/me/learning/argsprinter/ArgsPrinter.java
```

This will compile all the source files as before, then create a build directory
at the current location if it doesn't already exist, containing the package
hierarchy of the source files and generate the class files in their
corresponding packages inside the build directory.

## Execution

Running the newly compiled program is achieved by invocing the `java` program as
specified in part one, one just has to make sure to invoke the class file that
contains the main method.

Also, mind that now the package hierarchy needs to be prepended to the class
file name, so in this example's case it would be:

```bash
java -classpath src/main/java me.learning.ArgsPrinterApplication
```

Alternatively, if the `-d` option was used as described above, the command would
be:

```bash
java -classpath build me.learning.ArgsPrinterApplication
```

