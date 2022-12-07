package com.sofkau.cantera2;

/**
 * Interfaz que nombra los métodos necesarios para solicitar los números,
 * guardarlos en un vector hasta que se repitan.
 * @version 0.00.001 2022-11-28
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-28
 */
public interface GenerateNumbers {

    /**
     * Solicita al usuario ingrese un número
     * @return el número ingresado por el usuario
     */
    int requestInformation();

    /**
     * Guarda el número dentro del vector de la clase
     * @param number número ingresado por el usuario
     */
    void saveInformation(int number);

    /**
     * Por medio de un condicional anidado se verifica si el número
     * fue ingresado dos veces seguidas, de ser así se cierra el
     * ciclo y el programa.
     * @param number número ingresado por el usuario
     * @return boolean que evalúa la continuidad del ciclo externo
     */
    boolean equalNumbers(int number);

    /**
     * Imprime el vector de la clase
     */
    void print();
}