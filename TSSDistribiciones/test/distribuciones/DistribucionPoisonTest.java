/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuciones;

import manejadores.Media;
import manejadores.DistribucionPoison;
import generadores.Mixto;
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
public class DistribucionPoisonTest {
 Mixto mixto;
 List<Double> datos;
 Media media;
    public DistribucionPoisonTest() {
    }

    @Before
    public void setUp() {
         mixto = new Mixto(2, 5, 7, 8);
         datos = mixto.generar();
         media = new Media(datos);
    }

    /**
     * Test of getPoisson method, of class DistribucionPoison.
     */
    @Test
    public void testGetPoisson() {
        DistribucionPoison instance = new DistribucionPoison();
        double expResult = 100.0;
        double result = instance.getPoisson();

        assertEquals(expResult, result, 0.0);
        assertEquals(expResult, media.calculoMedia());
    }

    /**
     * Test of getPoisson method, of class DistribucionPoison.
     */
    @Test
    public void testGetPoisson_3args() {
        int x = 0;
        float nErroes = 0.0F;
        float probabilidad = 0.0F;
        DistribucionPoison instance = new DistribucionPoison();
        double expResult = 0.0;
        double result = instance.getPoisson(x, nErroes, probabilidad);
        assertEquals(expResult, result, 0.0);
    }

}
