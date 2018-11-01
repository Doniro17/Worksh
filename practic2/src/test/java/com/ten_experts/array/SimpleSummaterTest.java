package com.ten_experts.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSummaterTest {

    @org.junit.Test
    public void sumTest() {
        SimpleSummater summater = new SimpleSummater();
        int actual = summater.sum(new int[] {1, 2, 3});
        int expected = 6;
        assertEquals("wrong sum", expected, actual);
        assertEquals("wrong sum", -expected, summater.sum(new int[] {-1,-3,4,-6}));
        assertEquals(0, summater.sum(new int[] {}));
    }

}