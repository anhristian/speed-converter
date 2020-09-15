package edu.cnm.deepdive;

public class DecimalComparator {

  public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
    int a1 = (int) (a * 1000);
    int b1 = (int) (b * 1000);
    return a1 == b1;
  }
}
