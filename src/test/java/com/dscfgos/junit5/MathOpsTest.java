package com.dscfgos.junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MathOpsTest {

    private MathOps mathOps;

    @BeforeEach
    void setUp() {
        this.mathOps = new MathOps();
        System.out.println("::BeforeEach");
    }

    @AfterEach
    void tearDown() {
        System.out.println("::AfterEach");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("::BeforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("::AfterAll");
    }

    @Test
    void testAdd() {
        assertEquals(2, mathOps.add(1, 1));
    }

    @Test
    void testDivide() {
        assertEquals(1, mathOps.divide(1, 1));
        assertThrows(ArithmeticException.class, () -> mathOps.divide(1, 0));
    }

    @Test
    void testCiercleArea() {
        assertEquals(314.1592653589793, mathOps.circleArea(10));
    }

}