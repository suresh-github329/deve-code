package com.lara.sanitizer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public  class Util {

	public enum  status {ORDERED, IN_PROCESS, SHIPPED, DELIVERED, CANCELLED};

	public static String generateDate()
	{
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   return(dtf.format(now));  
	}

}
