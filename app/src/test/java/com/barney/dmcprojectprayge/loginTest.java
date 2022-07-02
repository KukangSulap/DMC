package com.barney.dmcprojectprayge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class loginTest {

    @Test
    public void Test(){
        boolean result = login.Check("admin", "password");
        assertTrue(result);
    }
}