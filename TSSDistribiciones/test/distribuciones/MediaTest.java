/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuciones;

import manejadores.Media;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Dougl
 */
public class MediaTest {
    
    private final ArrayList<Double> datos;
    public MediaTest() {
        datos = new ArrayList<>();
        datos.add(0.59);
        datos.add(0.298);
        datos.add(0.267);
        datos.add(0.24);
        datos.add(0.24);
        datos.add(0.242);
        datos.add(0.234);
        datos.add(0.2224);
        datos.add(0.2334);
        datos.add(0.2114);
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

    @Test
    public void testSomeMethod() {
        Media m = new Media(datos);
        m.calculoMedia();
        System.out.println(m.calculoMedia());
    }
    
}
