package com.sofkaU.cantera2;

import com.sofkaU.cantera2.vehicle.ShowVehicle;

/**
 * Clase que ejecuta el método main e implementa la clase ShowVehicle
 * @version 0.00.001 2022-12-05
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-12-05
 */
public class Main {

    public static void main(String[] args) {

        ShowVehicle showVehicle = new ShowVehicle();

        System.out.println("Bienvenid@ al ferri transibérico");
        showVehicle.saveVehicles();
        showVehicle.print();

    }
}