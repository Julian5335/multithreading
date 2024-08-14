package com.julian5335.hackergame;

public class Vault {
  
  public static final int MIN_PASSWORD = 0;
  public static final int MAX_PASSWORD = 9999;

  private int password;

  public Vault(int password) {
    this.password = password;
  }

  public boolean unlock(int password) {
    boolean guessed = this.password == password;
    try {
      Thread.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return guessed;
  }

}
