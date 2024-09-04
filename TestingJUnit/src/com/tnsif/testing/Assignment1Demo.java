package com.tnsif.testing;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class Assignment1Demo{

    Assignment1 demo = new Assignment1();
    
    @Test
    void testFactorialForPositiveNumber() {
        int n = 5;
        Assumptions.assumeTrue(n > 0);
        int result = demo.getFact(n);
        assertEquals(120, result);  // 5! = 120
    }

    @Test
    void testFactorialForNegativeNumber() {
        int n = -3;
        Assumptions.assumeFalse(n >= 0);
        int result = demo.getFact(n);
        assertEquals(-1, result); 
        
    }
    
	@Test
	public void testassumption() {
		int n=5;
		int result = demo.getFact(n);
		Assumptions.assumingThat(n!=result,()->System.out.println("Displayed"));
		
	}


}
