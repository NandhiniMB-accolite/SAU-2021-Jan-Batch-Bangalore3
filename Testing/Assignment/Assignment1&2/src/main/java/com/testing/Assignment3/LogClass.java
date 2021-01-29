package com.testing.Assignment3;


import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LogClass{
   private static org.apache.log4j.Logger log = Logger.getLogger(LogClass.class);
   
   public static void main(String[] args) {
	  BasicConfigurator.configure();
	  Scanner sc = new Scanner(System.in);
	  String lev = sc.next();
	  switch(lev)
	  {
	  case "TRACE":log.setLevel(Level.WARN);break;
	  case "DEBUG":log.setLevel(Level.DEBUG);break;
	  case "INFO":log.setLevel(Level.INFO);break;
	  case "WARN":log.setLevel(Level.WARN);break;
	  case "ERROR":log.setLevel(Level.ERROR);break;
	  case "FATAL":log.setLevel(Level.FATAL);break;
	  }
      
      log.trace("Trace Message!");
      log.debug("Debug Message!");
      log.info("Info Message!");
      log.warn("Warn Message!");
      log.error("Error Message!");
      log.fatal("Fatal Message!");
   }
}