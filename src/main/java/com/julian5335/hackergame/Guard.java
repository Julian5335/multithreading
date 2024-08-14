package com.julian5335.hackergame;

public class Guard extends Thread {

  public Guard() {
    this.setName(this.getClass().getSimpleName());
  }
  
  @Override
  public void run() {
    System.out.println(this.getName() + " starts counting...");
    for (int i = 10; i > 0; i--) {
      System.out.println("Guard counts: " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println(this.getName() + " has stopped the hackers");
    System.exit(0);
  }

}
