package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class TriangleNumberCalculatorTest
{
    TriangleNumberCalculator tnc;

    @BeforeEach
    void setUp()
    {
        tnc = new TriangleNumberCalculator();

    }

    @Test
    void value1()
    {
        assertEquals(tnc.value(1),1);

    }

    @Test
    void value2()
    {
        assertEquals(tnc.value(2),3);

    }

    @Test
    void value4()
    {
        assertEquals(tnc.value(4),10);

    }

    @Test
    void value5()
    {
        assertEquals(tnc.value(5),15);

    }

    @Test
    void value10()
    {
        assertEquals(tnc.value(10),55);

    }

    @Test
    void value100()
    {
        assertEquals(tnc.value(100),5050);

    }

    @Test
    void value200()
    {
        assertEquals(tnc.value(200),20100);

    }

    @Test
    void add1and1()
    {
        assertEquals(tnc.add(1,1),2);

    }

    @Test
    void add2and3()
    {
        assertEquals(tnc.add(2,3),9);

    }

    @Test
    void add4and2()
    {
        assertEquals(tnc.add(4,2),13);

    }

    @Test
    void add10and5()
    {
        assertEquals(tnc.add(10,5),70);

    }

    @Test
    void add100and200()
    {
        assertEquals(tnc.add(100,200),25150);

    }

    @Test
    void subtract1and1()
    {
        assertEquals(tnc.subtract(1,1),0);

    }

    @Test
    void subtract2and3()
    {
        assertEquals(tnc.subtract(2,3),-3);

    }

    @Test
    void subtract4and2()
    {
        assertEquals(tnc.subtract(4,2),7);

    }

    @Test
    void subtract10and5()
    {
        assertEquals(tnc.subtract(10,5),40);

    }

    @Test
    void subtract100and200()
    {
        assertEquals(tnc.subtract(100,200),-15050);

    }

}
