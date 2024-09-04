package com.tnsif.testing;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class parametrizedTest {
	
	@ParameterizedTest
	@ValueSource(strings= {"cali","bali","manu","ravi"})
	void endswithI(String str) {
		
		assertTrue(str.endsWith("i"));
		
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"12321","25431","89421","5624"})
	void endwithI(String str) {
		
		assertTrue(str.startsWith("1"));
		
	}

}
