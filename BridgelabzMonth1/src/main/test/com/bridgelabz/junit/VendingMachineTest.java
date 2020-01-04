package com.bridgelabz.junit;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
//import static org.hamcrest.MatcherAssert.assertThat;

public class VendingMachineTest
{
Map<Integer,Integer> expected=new HashMap<>();

	@Test
	public void given2968_WhenVendingMachine_ThenShouldbe() 
	{
		expected.put(1, 1);
		expected.put(50, 1);
		expected.put(2, 1);
		expected.put(500, 1);
		expected.put(100, 4);
		expected.put(5, 1);
		expected.put(1000, 2);
		expected.put(10, 1);
		
		assertEquals(expected, VendingMachine.calculateChange(2968));
	}
	
	@Test
	public void given5000_WhenVendingMachine_ThenShouldbeFiveThousandNotes() 
	{
		expected.put(1000, 5);
		assertEquals(expected, VendingMachine.calculateChange(5000));
	}
	
}
