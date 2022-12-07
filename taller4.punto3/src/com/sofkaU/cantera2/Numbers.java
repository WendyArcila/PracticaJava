package com.sofkaU.cantera2;

/**
 * Clase que ejecuta el método main e implementa la clase numbers
 * @version 0.00.001 2022-11-28
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-28
 */
public class Numbers {

    /**
     * Genera números aleatorios
     * @return un número aleatorio.
     */
    public double generateNumber(){
        return Math.random()*10;
    }

    /**
     * Crea un arreglo de tamaño recibido con números aleatorios
     * @param numberOfNumbers tamaño del arreglo
     * @return el arreglo con los números aleatorios
     */
    public double[] saveArrayOfNumber(int numberOfNumbers){
        double[] randomNumbers = new double[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++) {
            randomNumbers[i] = generateNumber();
        }
        return randomNumbers;
    }
}

