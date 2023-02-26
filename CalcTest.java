// Riley Olson
// SE470
// JUnit for Calc.java

package junitTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import org.junit.jupiter.api.Test;

class CalcTest {

	   @Test public void testAdd(){
	      assertTrue ("Calc sum incorrect", 4 == Calc.add (2, 2));
	   }
	   
	   @Test public void testSubstract(){
	      assertTrue ("Calc substraction incorrect", 0 == Calc.substract (2, 2));
	   }
	   
	   @Test public void testMultiply(){
	      assertTrue ("Calc multiplication incorrect", 12 == Calc.multiply (2, 6));
	   }
	   
	   @Test public void testDivide(){
		  try {
			  assertTrue ("Calc division incorrect", 10 == Calc.divide (100, 10));  //Causes underflow
		  }
		  catch(ArithmeticException e) {
			  return;
		  }
		  fail("ArithmeticException expected");
	   }

}
