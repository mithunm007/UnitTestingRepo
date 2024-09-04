package com.tnsif.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	@Test
	public void testassumption() {
		
		int a=5,s=25;
		Assumptions.assumeTrue(s==a*a);
		System.out.println("Displayed");
	}
	
	@Test
	public void testassuption() {
		
		int a=50,b=5;
		Assumptions.assumingThat(a!=b,()->System.out.println("Disppppplayed"));
		
	}


}
