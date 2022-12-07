package com.sofkau.cantera2;

/**
 * Clase que ejecuta el método main, implementa la clase ShowVehicle
 * @version 0.00.001 2022-12-05
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-12-05
 */
public class Main {

    public static void main(String[] args) {
        ShowVehicle showVehicle = new ShowVehicle();
        System.out.println("Se le solicitarán los datos de 10 vehículos");
        showVehicle.saveVehicles();
        showVehicle.print();
    }
}