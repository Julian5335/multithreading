package com.julian5335.utils;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {
  
  private List<Thread> threads = new ArrayList<>();

  public MultiExecutor(Thread... threads) {
    for (Thread thread: threads) {
      this.threads.add(thread);
    }
  }

  public void executeAll() {
    for (Thread thread: this.threads) {
      thread.start();
    }
  }

}
