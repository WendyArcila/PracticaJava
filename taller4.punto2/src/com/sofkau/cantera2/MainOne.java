package com.sofkau.cantera2;

import java.util.Scanner;

/**
 * Sí es posible que exista un programa con varios métodos main,
 * el punto de entrada del programa se determina según el IDE que estemos usando
 * en IntelliJ al probar el programa, pero al compilarlo usará el
 * último main usado.
 * Sin embargo, no es una buena práctica, ya que este es el método
 * que lanza la máquina virtual cuando se le indica que tiene que ejecutar una clase,
 * si existen varios métodos podrá generar confusiones en el programa.
 * Esta clase implementa el método main realiza operaciones entre dos números enteros.
 * @version 0.00.001 2022-11-28
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-28
 */
public class MainOne {
    private static int number1;
    private static int number2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        number1 = input.nextInt();
        System.out.println("Ingrese el segundo número");
        number2 = input.nextInt();

        System.out.println("El resultado de la suma es: " + sum());
        System.out.println("El resultado de la resta es: " + subtract());
    }

    /**
     * Suma dos números
     * @return el resultado
     */
    public static int sum(){
        return number1 + number2;
    }

    /**
     * Resta dos números
     * @return  el resultado
     */
    public static int subtract(){
        return number1 - number2;
    }
}