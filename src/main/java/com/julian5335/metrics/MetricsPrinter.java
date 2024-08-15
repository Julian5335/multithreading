package com.julian5335.metrics;

public class MetricsPrinter extends Thread {
  
  private Metrics metrics;

  public MetricsPrinter(Metrics metrics) {
    this.metrics = metrics;
  }

  @Override
  public void run() {
    while(true) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
      }
      double currentAverage = metrics.getAverage();
      System.out.println("Current average is " + currentAverage);
    }
  }

}
