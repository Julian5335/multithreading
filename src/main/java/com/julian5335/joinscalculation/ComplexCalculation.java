package com.julian5335.joinscalculation;

import java.math.BigInteger;

public class ComplexCalculation {
  public BigInteger calculateResult(BigInteger base1, BigInteger power1, BigInteger base2, BigInteger power2) {
    BigInteger result;
    /*
     * Calculate result = ( base1 ^ power1 ) + (base2 ^ power2).
     * Where each calculation in (..) is calculated on a different thread
     */
    PowerCalculatingThread thread1 = new PowerCalculatingThread(base1, power1);
    PowerCalculatingThread thread2 = new PowerCalculatingThread(base2, power2);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    result = thread1.getResult();
    result = result.add(thread2.getResult());

    return result;
  }
}