package com.tnsif.testing;

public class Assignment1 {
	
	public int getFact(int n) {
		
		if (n < 0) {
			System.out.println("negative not allowed");
			return -1;  
		}
		if (n == 0) {
			return 1; 
		}

		int fact = 1;
		
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
