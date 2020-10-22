package com.in28minutes.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {
	
	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {4,6,2,0};
		int[] expected = {0,2,4,6};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(expected, numbers);
	}
	
	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout = 100)
	public void testArraySort_Performance() {
		int[] numbers = {4,6,2,0};
		for(int i=0; i<=1000000 ; i++) {
			numbers[0]=i;
			Arrays.sort(numbers);
		}
	}

}
