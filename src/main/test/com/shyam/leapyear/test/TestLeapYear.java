package com.shyam.leapyear.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.shyam.leapyear.LeapYear;

class TestLeapYear {

	@Test
	void test() {
		//If all years are divisible by 400.
		//Test with input 2000
		Assertions.assertEquals(Boolean.TRUE, LeapYear.checkForLeapYear(2000));
		
		//If all years divisible by 100 but not by 400. 
		//Test with inputs 1700, 1800, 2100, and 1900
		Assertions.assertEquals(Boolean.TRUE, LeapYear.checkForLeapYear(1700));
		Assertions.assertEquals(Boolean.TRUE, LeapYear.checkForLeapYear(1800));
		Assertions.assertEquals(Boolean.TRUE, LeapYear.checkForLeapYear(1900));
		Assertions.assertEquals(Boolean.TRUE, LeapYear.checkForLeapYear(2100));
		
		//If year is divisible by 4 but not by 100. 
		//Test with inputs 2008, 2012, and 2016
		Assertions.assertEquals(Boolean.TRUE, LeapYear.checkForLeapYear(2008));
		Assertions.assertEquals(Boolean.TRUE, LeapYear.checkForLeapYear(2012));
		Assertions.assertEquals(Boolean.TRUE, LeapYear.checkForLeapYear(2016));
				
	}

}
