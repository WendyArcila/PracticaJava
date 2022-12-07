package com.sofkau.cantera2;

/**
 * Clase que ejecuta el método main e implementa la clase numbers
 * @version 0.00.001 2022-11-28
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-28
 */
public class Main {
    /**
     * Método main que por medio de un ciclo implementa los métodos
     * que solicitan los números al usuario y los guarda, hasta que
     * el usuario ingresa dos repetidos
     * @since 0.00.001 2022-11-28
     */
    public static void main(String... args) {
        Numbers numbers = new Numbers();
        boolean flag;
        do{
            int number = numbers.requestInformation();
            flag = numbers.equalNumbers(number);

        }while (flag);
    }
}
