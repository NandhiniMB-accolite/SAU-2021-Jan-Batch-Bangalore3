package com.testing.Assignment1;

/**
 * Unit test for simple App.
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit test for LeapYearCalculator
 */
public class LeapYearTest
{
  @Test
  public void leapTest0()
  {
    String msg = "Year 2000 should be a leap year.";
    boolean result = LeapYear.isLeapYear(2000);
    assertEquals(msg, true, result);
  }
  
  @Test
  public void leapTest1()
  {
    String msg = "Year 2004 should be a leap year.";
    boolean result = LeapYear.isLeapYear(2004);
    assertEquals(msg, true, result);
  }

  @Test
  public void leapTest2()
  {
    String msg = "Year 1900 should not be a leap year.";
    boolean result = LeapYear.isLeapYear(1900);
    assertEquals(msg, false, result);
  }

  @Test
  public void leapTest3()
  {
    String msg = "Year 2005 should not be a leap year.";
    boolean result = LeapYear.isLeapYear(2005);
    assertEquals(msg, false, result);
  }

}