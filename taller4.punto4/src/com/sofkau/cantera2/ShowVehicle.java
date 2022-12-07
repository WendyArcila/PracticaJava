package com.sofkau.cantera2;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase en la que se crea una Lista de vehículos y
 * se muestran en pantalla
 * @version 0.00.001 2022-12-05
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-12-05
 */
public class ShowVehicle {

    private List<Vehicle> vehicles = new ArrayList<>();

    /**
     * Añada a la lista de vehículos un vehículo nuevo
     * @param vehicle vehículo a guardar
     */
    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    /**
     * Implementa la clase NewVehicle para crear 10 vehículos nuevos
     */
    public void saveVehicles(){
        NewVehicle newVehicle = new NewVehicle();
        for (int i = 0; i < 10; i++) {
            int j= i +1;
            addVehicle(newVehicle.newVehicle(j));
            System.out.println("Su vehículo " + j + " se ha guardado correctamente");
        }
    }

    /**
     * Imprime en pantalla la lista de vehículos
     */
    public void print(){
        System.out.println(vehicles.toString());
    }
}