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
				
	}

}
