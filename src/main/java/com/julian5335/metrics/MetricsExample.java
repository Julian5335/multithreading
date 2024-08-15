package com.julian5335.metrics;

import com.julian5335.utils.MultiExecutor;

public class MetricsExample {

  MultiExecutor executor;

  public MetricsExample() {
    Metrics metrics = new Metrics();
    executor = new MultiExecutor(
      new BusinessLogic(metrics),
      new BusinessLogic(metrics),
      new MetricsPrinter(metrics)
    );
  }

  public void run() {
    executor.executeAll();
  }

}
