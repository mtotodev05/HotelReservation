/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.hotelreservation.Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author John Gachoki
 */
public class BaseTest {
    
    public BaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getConnection method, of class Base.
     */
    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        Base instance = new BaseImpl();
        boolean expResult = true;
        boolean result = instance.getConnection();
        assertEquals(expResult, result);

    }

    /**
     * Test of closeConnection method, of class Base.
     */
    @Test
    public void testCloseConnection() throws Exception {
        System.out.println("closeConnection");
        Base instance = new BaseImpl();
        boolean expResult = true;
        boolean result = instance.closeConnection();
        assertEquals(expResult, result);

    }

    public class BaseImpl extends Base {
    }
    
}
