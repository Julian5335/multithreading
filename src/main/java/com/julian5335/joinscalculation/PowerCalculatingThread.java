package com.julian5335.joinscalculation;

import java.math.BigInteger;

public class PowerCalculatingThread extends Thread {

  private BigInteger result = BigInteger.ONE;
  private BigInteger base;
  private BigInteger power;

  public PowerCalculatingThread(BigInteger base, BigInteger power) {
    this.base = base;
    this.power = power;
  }

  @Override
  public void run() {
    result = pow(base, power);
  }

  private BigInteger pow(BigInteger base, BigInteger exponent) {
    BigInteger result = BigInteger.ONE;
    while (exponent.signum() > 0) {
      if (exponent.testBit(0))
        result = result.multiply(base);
      base = base.multiply(base);
      exponent = exponent.shiftRight(1);
    }
    return result;
  }

  public BigInteger getResult() {
    return result;
  }
}
