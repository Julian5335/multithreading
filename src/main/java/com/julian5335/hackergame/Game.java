package com.julian5335.hackergame;

import java.util.Random;

import com.julian5335.utils.MultiExecutor;

public class Game {

  private Vault vault;
  
  public Game() {
    Random random = new Random();
    int password = random.nextInt(Vault.MAX_PASSWORD + 1);
    System.out.println("Vault created with password: " + password);
    this.vault = new Vault(password);
  }
    
  public void start() {
    MultiExecutor multiExecutor = new MultiExecutor(
      new Hacker1(this.vault),
      new Hacker2(this.vault),
      new Guard()
    );
    multiExecutor.executeAll();
  }

}
