/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dougl
 */
public class MediaTest {
    
    public MediaTest() {
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
     * Test of calculoMedia method, of class Media.
     */
    @Test
    public void testCalculoMedia() {
        List datos = new ArrayList();
        datos.add(51.0);
        datos.add(100.0);       
        datos.add(515.0);       
        Media instance = new Media(datos);
        double expResult = 51.0;
        double result = instance.calculoMedia();
        assertEquals(expResult, result, 0.0);
    }
    
}
