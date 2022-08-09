package test.unittest;

import org.junit.jupiter.api.Test;

import main.calc.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;;


public class TestCalculator {

	@Test 
	public void TestSum() {
		Calculator calc = new Calculator(); 
		int result= calc.sum(2,3);
		assertEquals(5,result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
