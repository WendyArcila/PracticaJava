package com.sofkau.cantera2;

import java.util.Scanner;

/**
 * Esta clase implementa el método main realiza operaciones entre dos números double.
 * @version 0.00.001 2022-11-28
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-28
 */

public class MainTwo {
    private static float number1;
    private static float number2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        number1 = input.nextFloat();
        System.out.println("Ingrese el segundo número");
        number2 = input.nextFloat();

        System.out.println("El resultado de la suma es: " + multiplication());
        System.out.println("El resultado de la resta es: " + division());
    }

    /**
     * Realiza una multiplicación de dos números
     * @return el resultado
     */
    public static float multiplication(){
        return number1 * number2;
    }

    /**
     * Realiza una división de dos números
      * @return el resultado
     */
    public static float division(){
        return number1 / number2;
    }
}