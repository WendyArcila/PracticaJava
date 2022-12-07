package com.sofkaU.cantera2;

/**
 * Clase que ejecuta el método main, implementa la clase numbers y
 * la clase ShowSort, muestra en pantalla las solicitudes al usuario.
 * @version 0.00.001 2022-11-28
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-28
 */
public class Main {
    public static void main(String[] args) {
        Numbers numbersArray = new Numbers();
        ShowSort showSort = new ShowSort();

        String request = "Ingrese la cantidad de números que desea ordenar";
        String menu = """
                Seleccione cómo desea ordenar sus números:\s
                1. Para order por bubbleSort
                2. Para ordenar por quickSort""";
        int option =0;

        option = showSort.requestInformation(request);
        double[] numbers = numbersArray.saveArrayOfNumber(option);

        showSort.print(numbers);

        option = showSort.requestInformation(menu);

        showSort.print(showSort.typeSort(option,numbers));
    }
}
