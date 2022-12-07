package com.sofkaU.cantera2;

import java.util.Scanner;

/**
 * Clase imprime en pantalla las solicitudes al usuario
 * Válida la información ingresada
 * Llama a la clase Sort para usar sus métodos de ordenamiento.
 * Imprime la información solicitada
 * @version 0.00.001 2022-11-28
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-28
 */
public class ShowSort {

    /**
     * Ciclo infinito que solicita al usuario ingresar número
     * cierra cuando se logra ingresar la información correctamente.
     * @param message Mensaje con la información que solicita
     * @return
     */
    public int requestInformation(String message){
        for(;;) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println(message);
                int option =  input.nextInt();
                if ( option < 0) {
                    throw new Exception();
                }else {
                    return option;
                }
            } catch (Exception  e) {
                System.out.println("Solo ingrese números positivos, inténtelo de nuevo");
            }
        }
    }

    /**
     * Implementa el ordenamiento según la decisión del usuario
     * @param option decisión del usuario
     * @param numbers números a ordenar
     * @return números ordenados
     */
    public double[] typeSort(int option, double[] numbers){
        Sort sort = new Sort();
        if(option <= 2){
            if (option == 1) {
                return sort.bubbleSort(numbers);
            } else if (option == 2) {
                return sort.quickSort(numbers, 0, numbers.length - 1);
            }
        } else {
            System.out.println("La opción no existe");
        } return numbers;
    }

    /**
     * Imprime una lista de números
     * @param numbers lista de números
     */
    public void print(double[] numbers){
        for (double number : numbers) {
            System.out.println(number);
        }
    }
}