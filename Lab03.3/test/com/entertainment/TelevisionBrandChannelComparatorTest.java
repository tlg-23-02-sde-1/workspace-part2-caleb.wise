package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionBrandChannelComparatorTest {
    Television tv1;
    Television tv2;
    TelevisionBrandChannelComparator compares;

    @Before
    public void setUp() {
        tv1 = new Television("Sony", 50, DisplayType.OLED);
        tv2 = new Television("Sony", 50, DisplayType.OLED);
        compares = new TelevisionBrandChannelComparator();
    }

    @Test
    public void compare_shouldEqualZero_sameChannel() {
        assertEquals(0,compares.compare(tv1, tv2));
    }

    @Test
    public void compare_shouldReturnPositiveInt_sameCurrentChannel_differentBrand() {
        tv2.setBrand("RCA");
        assertTrue(compares.compare(tv1, tv2) > 0);
    }

    @Test
    public void compare_shouldReturnNegative_differentChannel() throws InvalidChannelException {
        tv2.changeChannel(400);
        assertTrue(compares.compare(tv1, tv2) < 0);
    }
}