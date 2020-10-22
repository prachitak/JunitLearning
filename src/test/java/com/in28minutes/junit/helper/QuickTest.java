package com.in28minutes.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@Test
	public void test1() {
		System.out.println("Execute Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Execute Test 2");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
}
