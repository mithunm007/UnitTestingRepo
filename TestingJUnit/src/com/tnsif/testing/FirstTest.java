package com.tnsif.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class FirstTest {
	//@Disabled()
	@DisplayName("My test 1")
	@Test
	void display()
	{
		System.out.println("My first Test");
	}
	@RepeatedTest(4)
	@Test
	void Hello()
	{
		System.out.println("My first ");
	}
	

}
