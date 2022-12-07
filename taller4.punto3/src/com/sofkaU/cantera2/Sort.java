package com.sofkaU.cantera2;

/**
 * Clase que ejecuta el método main e implementa la clase numbers
 * @version 0.00.001 2022-11-28
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-28
 */
public class Sort {

    /**
     * Método de ordenamiento tipo burbuja
     * @param numbers número a ordenar
     * @return números ordenados
     */
    public double[] bubbleSort(double[] numbers){
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j <numbers.length - i - 1 ; j++) {
                if(numbers[j + 1] < numbers[j]){
                    double aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        } return numbers;
    }

    /**
     * Método de ordenamiento quickSort
     * @param numbers números a ordenar
     * @param left posición en la que comienza el pivot
     * @param right última posición del array
     * @return números ordenados
     */
    public double[] quickSort(double[] numbers, int left, int right){
        double pivote = numbers[left];
        int i=left;
        int j=right;
        double aux;

        while(i < j){
            while(numbers[i] <= pivote && i < j) i++;
            while(numbers[j] > pivote) j--;

            if (i < j) {
                aux= numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=aux;
            }
        }

        numbers[left]= numbers[j];
        numbers[j]=pivote;

        recursion(numbers, left, j, right);

        return numbers;
    }

    /**
     * Método que realiza la recursión del ordenamiento quickSort
     * para el lado derecho con los números mayores al pivot
     * para el lado izquierdo con los números menores al pivot
     * @param numbers número a ordenar con el pivot en su posición final
     * @param left posición en la que comienza el pivot de nuevo
     * @param j posición del pivot
     * @param right última posición de la sublista
     */
    public void recursion(double[] numbers, int left, int j, int right){
        if(left < j-1)
            quickSort(numbers,left,j-1);
        if(j+1 < right)
            quickSort(numbers,j+1,right);
    }
}

