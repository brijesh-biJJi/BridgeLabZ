package com.bridgelabz.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeNumbersTest {
	ArrayList<Integer> expected,actual;
	@Test
	public void test() 
	{
		expected=new ArrayList<>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		actual=PrimeNumbers.getPrime(20);
		assertIterableEquals(expected, actual);
	}

}
