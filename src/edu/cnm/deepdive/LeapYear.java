package edu.cnm.deepdive;

public class LeapYear {

  public static boolean isLeapYear(int year) {
  boolean leapYear;
    if (year >= 1 && year <= 9999){
      return ((year % 4 == 0 && year % 100 ==0 && year % 400 == 0 )
          || (year % 4 ==0 && year % 100 !=0));
    }else{
      return false;
    }
  }
}
