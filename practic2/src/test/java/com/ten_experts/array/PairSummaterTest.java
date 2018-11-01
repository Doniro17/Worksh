package com.ten_experts.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PairSummaterTest {

    @Test(expected = ArraySummaterException.class)
    public void exceptionTrowsTest() throws ArraySummaterException {
        PairSummater summater = new PairSummater();
        int actual = summater.sum(new int[]{1, 2, 3});

    }

    @Test
    public void maxSumTest() throws ArraySummaterException {
        PairSummater summater = new PairSummater();
        int actual = summater.sum(new int[]{1, 2, 3, 4});
        int expected = 7;
        assertEquals("wrong sum", expected, actual);
        assertEquals("wrong sum", -expected, summater.sum(new int[]{-1, -6, -10, 1}));
    }

}