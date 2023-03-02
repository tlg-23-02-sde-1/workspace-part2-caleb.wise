package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest {
    private Television tv;
    private Television tv1;
    private Television tv2;

    @Before
    public void setUp() {
        tv = new Television();
        tv1 = new Television("Sony", 50, DisplayType.LCD);
        tv2 = new Television("Sony", 50, DisplayType.LCD);
    }

    @Test
    public void hashCode_shouldBeEqual_whenObjectsEqual() {
        assertEquals(tv1.hashCode(), tv2.hashCode());
    }

    @Test
    public void equals_shouldReturnFalse_withDifferentDisplay() {
        tv2.setBrand("LG");
        assertEquals(tv1, tv2);
    }

    @Test
    public void equals_shouldReturnFalse_withDifferentBrand() {
        tv1.setBrand("LG");
        assertNotEquals(tv1, tv2);
    }

    @Test
    public void equals_shouldReturnFalse_withDifferentVolume() throws Exception {
        tv1.setVolume(24);
        assertNotEquals(tv1, tv2);
    }

    @Test
    public void equals_shouldReturnTrue_allPropertiesSame() {
        assertEquals(tv1, tv2);
    }

//    @Test
//    public void compareTo_shouldReturnTrue_allPropertiesSame() {
//        assertEquals(tv1, tv2);
//    }

    @Test
    public void changeChannel_shouldThrowInvalidChannelException_whenInvalid_upperBound() {
        try {
            tv.changeChannel(1000);
            fail("Should have thrown InvalidChannelException");
        }
        catch (InvalidChannelException e) {
            assertEquals("Invalid channel: 1000. Allowed range: [1,999].", e.getMessage());
        }
    }

    @Test
    public void changeChannel_shouldStoreValue_whenValid_upperBound() throws Exception{
        tv.changeChannel(999);
        assertEquals(999, tv.getCurrentChannel());
    }

    @Test
    public void changeChannel_shouldThrowInvalidChannelException_whenInvalid_lowerBound() {
        try {
            tv.changeChannel(0);  // should trigger the exception
            fail("Should have thrown InvalidChannelException");
        }
        catch (InvalidChannelException e) {
            assertEquals("Invalid channel: 0. Allowed range: [1,999].", e.getMessage());
        }
    }

    @Test
    public void changeChannel_shouldStoreValue_whenValid_lowerBound() throws Exception {
        tv.changeChannel(1);
        assertEquals(1, tv.getCurrentChannel());
    }

    @Test(expected=IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_upperBound() {
        tv.setVolume(101);
    }

    @Test
    public void setVolume_shouldStoreValue_whenValid_upperBound() {
        tv.setVolume(100);
        assertEquals(100, tv.getVolume());
    }

    @Test(expected=IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_lowerBound() {
        tv.setVolume(-1);  // trigger the exception, and don't catch it
    }

    @Test
    public void setVolume_shouldStoreValue_whenValid_lowerBound() {
        tv.setVolume(0);
        assertEquals(0, tv.getVolume());
    }


}