# Part-3: Using external dependencies

## Compilation

To use an external dependency the program must be compiled as follows:

```bash
javac -classpath lib \
      -d build \
      src/main/java/me/learning/ArgsPrinterApplication.java \
      src/main/java/me/learning/argsprinter/ArgsPrinter.java
```

The `-classpath` option is used to designate where the external dependency is
located. `javac` needs that information so that it can check whether the program
is able to access all the classes of the dependency that it references within
its own source code.

This will create all necessary class files within the `build` directory.

## Execution

Running the program is achieved by the following `java` call:

```bash
java -classpath build:lib me.learning.ArgsPrinterApplication
```

Notice how, compared to the previous parts, the `lib` directory was added to the
`-classpath` option.

