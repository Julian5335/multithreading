package com.julian5335.hackergame;

public class Hacker1 extends HackerThread {
  
  public Hacker1(Vault vault) {
    super(vault);
  }

  @Override
  public void run() {
    for (int guess = Vault.MIN_PASSWORD; guess <= Vault.MAX_PASSWORD; guess++) {
      boolean unlocked = this.vault.unlock(guess);
      if (unlocked) {
        System.out.println("Vault is unlocked by: " + this.getName());
        System.exit(0);
      }
    }
  }

  @Override
  public void start() {
    System.out.println(this.getName() + " begins counting upwards");
    super.start();
  }

}
