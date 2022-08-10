package me.learning.argsprinter;

import java.util.Arrays;

public final class ArgsPrinter {

  private final String[] args;

  public ArgsPrinter(final String[] args) {
    this.args = args;
  }

  public void print() {
    System.out.println(Arrays.toString(args));
  }

}

