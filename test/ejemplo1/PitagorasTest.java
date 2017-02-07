/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 312A-32
 */
public class PitagorasTest {
    
    public PitagorasTest() {
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
     * Test of Calcular_Hipotenusa method, of class Pitagoras.
     */
    @Test
    public void testCalcular_Hipotenusa() {
        System.out.println("Calcular_Hipotenusa");
        double ladoA = 4.0;
        double ladoB = 3.0;
        double expResult = 5.0;
        double result = Pitagoras.Calcular_Hipotenusa(ladoA, ladoB);
        assertEquals(expResult, result, 0.0);
       
    }
    
}
