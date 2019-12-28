package com.bridgelabz.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void test() 
	{
		int expected=12;
		int actual=VendingMachine.calculateChange(2968);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test1() 
	{
		int expected=16;
		int actual=VendingMachine.calculateChange(5893);
		assertEquals(expected, actual);
	}

}
