package com.componentes;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Jonathan Jara Morales y Mildred Guerra Rodriguez
 */
public class ArrayMath {

    public static int getMaxValue(int[] arrayOfInt) {
        int maxValue = 0;
        for (int i = 0; i < arrayOfInt.length; i++) {
            if (maxValue < arrayOfInt[i]) {
                maxValue = arrayOfInt[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] arrayOfInt) {
        int minValue = 0;
        for (int i = 0; i < arrayOfInt.length; i++) {
            if (minValue > arrayOfInt[i]) {
                minValue = arrayOfInt[i];
            }
        }
        return minValue;
    }

    public static float getAverage(int[] arrayOfInt) {
        int minValue = 0;
        for (int i = 0; i < arrayOfInt.length; i++) {
            if (minValue > arrayOfInt[i]) {
                minValue = arrayOfInt[i];
            }
        }
        return minValue;
    }

    public static int[] arregloSuma(int[] a, int[] b) {
        int size = a.length;
        int[] tempArray = new int[size];
        for (int i = 0; i < size; i++) {
            tempArray[i] = a[i] + b[i];
        }
        return tempArray;
    }

    public static int[] arregloMultiplicacion(int[] a, int[] b) {
        int size = a.length;
        int[] tempArray = new int[size];
        for (int i = 0; i < size; i++) {
            tempArray[i] = a[i] * b[i];
        }
        return tempArray;
    }

    public static int[] arregloMayores(int[] a, int[] b) {
        int size = a.length;
        int[] tempArray = new int[size];
        for (int i = 0; i < size; i++) {
            int x = a[i] > b[i] ? a[i] : b[i];
            tempArray[i] = x;
        }
        return tempArray;
    }

    public static int[] arregloDistintos(int[] a, int[] b) {
        ArrayList<Integer> tempArray = new ArrayList<>();
        tempArray = addInArray(a, tempArray);
        tempArray = addInArray(b, tempArray);
        Collections.sort(tempArray);
        int size = tempArray.size();
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = tempArray.get(i);
        }
        return newArray;
    }

    private static ArrayList<Integer> addInArray(int[] array, ArrayList<Integer> tempArray) {
        for (int num : array) {
            if (!tempArray.contains(num)) {
                tempArray.add(num);
            }
        }
        return tempArray;
    }

}
