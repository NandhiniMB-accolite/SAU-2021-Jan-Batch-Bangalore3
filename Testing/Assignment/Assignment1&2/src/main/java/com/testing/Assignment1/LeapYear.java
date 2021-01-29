package com.testing.Assignment1;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class LeapYear {
  static boolean isLeapYear(int year){

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
       return true;
      else
        
	return false;
   }
}

