package me.learning.argsprinter;

import java.util.Arrays;
import org.lib.ColorConsolePrinter;

public final class ArgsPrinter {

  private final String[] args;

  public ArgsPrinter(final String[] args) {
    this.args = args;
  }

  public void print() {
    ColorConsolePrinter
      .print(Arrays.toString(args), ColorConsolePrinter.Color.BLUE);
  }

}

