package com.julian5335.hackergame;

public abstract class HackerThread extends Thread {
  
  protected Vault vault;

  public HackerThread(Vault vault) {
    this.setName(this.getClass().getSimpleName());
    this.vault = vault;
    this.setPriority(MAX_PRIORITY);
  }

  @Override
  public void start() {
    System.out.println("Starting thread: " + this.getName());
    super.start();
  }

}
