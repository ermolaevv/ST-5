package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit tests.
 */
public class AppTest {
    private static final double DELTA = 1e-10;
    
    @Test
    public void testConstructor() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(4.0, sqrt.arg, DELTA);
    }
    
    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(5.0, sqrt.average(4.0, 6.0), DELTA);
    }
    
    @Test
    public void testGoodWithExactValue() {
        Sqrt sqrt = new Sqrt(1.0);
        assertTrue(sqrt.good(2.0, 4.0));
    }
    
    @Test
    public void testGoodWithApproximateValue() {
        Sqrt sqrt = new Sqrt(1.0);
        assertTrue(sqrt.good(2.000000001, 4.0));
    }
    
    @Test
    public void testGoodWithInvalidValue() {
        Sqrt sqrt = new Sqrt(1.0);
        assertFalse(sqrt.good(1.9, 4.0));
    }
    
    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(2.0, sqrt.improve(2.0, 4.0), DELTA);
    }
    
    @Test
    public void testIterWithExactGuess() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(2.0, sqrt.iter(2.0, 4.0), DELTA);
    }
    
    @Test
    public void testIterWithApproximation() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(3.0, sqrt.iter(3.5, 9.0), DELTA);
    }
    
    @Test
    public void testCalcForPerfectSquare() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(4.0, sqrt.calc(), DELTA);
    }
    
    @Test
    public void testCalcForNonPerfectSquare() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), DELTA);
    }
}
