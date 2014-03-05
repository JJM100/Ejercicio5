package com.componentes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan Jara Morales y Mildred Guerra Rodriguez
 */
public class testArrayMath {

    public testArrayMath() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testArregloSuma() {
        int[] arreglo1 = {10, 5, 20, 40, 50};
        int[] arreglo2 = {10, 5, 20, 40, 50};
        int[] arreglo3 = {20, 10, 40, 80, 100};

        assertArrayEquals(arreglo3, ArrayMath.arregloSuma(arreglo1, arreglo2));
    }

    @Test
    public void testArregloMultipliacacion() {
        int[] arreglo1 = {2, 5, 5, 4, 3};
        int[] arreglo2 = {2, 5, 4, 4, 3};
        int[] arreglo3 = {4, 25, 20, 16, 9};
        assertArrayEquals(arreglo3, ArrayMath.arregloMultiplicacion(arreglo1, arreglo2));
    }

    @Test
    public void testArregloMayores() {
        int[] arreglo1 = {9, 5, 5, 8, 3};
        int[] arreglo2 = {2, 6, 4, 4, 39};
        int[] arreglo3 = {9, 6, 5, 8, 39};
        assertArrayEquals(arreglo3, ArrayMath.arregloMayores(arreglo1, arreglo2));
    }

    @Test
    public void testArregloArreglosDistintos() {
        int[] arreglo1 = {9, 5, 8, 4, 3};
        int[] arreglo2 = {2, 7, 4, 1, 3};
        int[] arreglo3 = {1, 2, 3, 4, 5, 7, 8, 9};
        assertArrayEquals(arreglo3, ArrayMath.arregloDistintos(arreglo1, arreglo2));
    }

    @Test
    public void testGetMinValue() {
        int[] arreglo1 = {9, -5, 8, 4, 3};
        assertEquals(-5, ArrayMath.getMinValue(arreglo1));
    }

    @Test
    public void testGetAverage() {
        int[] arreglo1 = {9, 5, 8, 4, 3};
        double DELTA = 1e-15;
        assertEquals(0, ArrayMath.getAverage(arreglo1), DELTA);
        
    }

    @Test
    public void testGetMaxValue() {
        int[] arreglo1 = {9, 5, 8, 4, 3};
        assertEquals(9, ArrayMath.getMaxValue(arreglo1));
        
     
    }
}
