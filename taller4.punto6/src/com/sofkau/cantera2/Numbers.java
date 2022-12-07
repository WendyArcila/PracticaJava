package com.sofkau.cantera2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * Clase que implementa la interfaz GenerateNumbers e implementa los
 * métodos necesarios para solicitar los números,
 * guardarlos en un vector hasta que se repitan.
 * @version 0.00.001 2022-11-28
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-28
 */
public class Numbers implements GenerateNumbers {
    Vector<Integer> vector1 = new Vector<>();

    /**
     * Solicita al usuario ingrese un número
     * @return el número ingresado por el usuario, en su defecto -1
     * para informar al programa que debe realizar de nuevo la solicitud
     * @throws InputMismatchException verifica que el usuario ingrese números
     */
    @Override
    public int requestInformation() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Ingrese un número para guardar");
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Solo ingrese números");
        } return -1;
    }

    /**
     * Guarda el número dentro del vector de la clase
     * @param number número ingresado por el usuario
     */
    @Override
    public void saveInformation(int number) {
        this.vector1.add(number);
    }

    /**
     * Por medio de un condicional anidado se verifica si el número
     * fue ingresado dos veces seguidas, de ser así se cierra el
     * ciclo y el programa.
     * @param number número ingresado por el usuario
     * @return boolean que evalúa la continuidad del ciclo externo
     */
    @Override
    public boolean equalNumbers(int number){
        if(number != -1) {
            if (!this.getVector1().isEmpty() &&
                    this.getVector1().lastElement().equals(number))
            {
                saveInformation(number);
                print();
                return false;
            } else {
                saveInformation(number);
                return true;
            }
        }return true;
    }

    /**
     * Imprime el vector de la clase
     */
    @Override
    public void print() {
        System.out.println(getVector1().toString());
    }

    /**
     * Obtiene el vector
     * @return retorna el vector
     */
    public Vector<Integer> getVector1() {
        return vector1;
    }

    /**
     * Asigna valor al vector
     * @param vector1 el vector
     */
    public void setVector1(Vector<Integer> vector1) {
        this.vector1 = vector1;
    }

}
