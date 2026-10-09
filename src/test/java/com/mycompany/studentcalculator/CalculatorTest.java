/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package com.mycompany.studentcalculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    // Test addition
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(5, 5));
    }

    // Test subtraction
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.subtract(8, 5));
    }

    // Test multiplication
    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(20, calc.multiply(4, 5));
    }

    // Test division
    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.divide(10, 2));
    }
}

