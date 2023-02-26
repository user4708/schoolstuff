// Riley Olson
// SE470
// JUnit for Calc.java

package junitTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Riley
 */
public class CalcTest {
    
    public CalcTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    /**
     * Test of add method, of class Calc.
     */
    @org.junit.jupiter.api.Test
    public void testAdd() {
        System.out.println("add");
        int a = 2;
        int b = 2;
        int expResult = 4;
        int result = Calc.add(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of substract method, of class Calc.
     */
    @org.junit.jupiter.api.Test
    public void testSubstract() {
        System.out.println("substract");
        int a = 6;
        int b = 3;
        int expResult = 3;
        int result = Calc.substract(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiply method, of class Calc.
     */
    @org.junit.jupiter.api.Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 6;
        int b = 2;
        int expResult = 12;
        int result = Calc.multiply(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class Calc.
     */
    @org.junit.jupiter.api.Test
    public void testDivide() {
        System.out.println("divide");
        int a = 100;
        int b = 10;
        int expResult = 10;
        int result = Calc.divide(a, b);
        assertEquals(expResult, result);
    }
}
