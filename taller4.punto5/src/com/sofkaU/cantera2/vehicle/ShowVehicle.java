package com.sofkaU.cantera2.vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase en la que se crea una Lista de vehículos y
 * se muestran en pantalla
 * @version 0.00.001 2022-12-05
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-12-05
 */
public class ShowVehicle {

    private List vehicles = new ArrayList<>();

    private String menu = """
            Qué vehículo desea ingresar:
            1. Carro
            2. Bicicleta
            3. Moto
            4. Lancha
            5. Camión
            6. Otro""";

    /**
     * Añada a la lista de vehículos un vehículo nuevo
     * @param vehicle vehículo a guardar
     */
    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    /**
     * Imprime en pantalla el menú y guarda
     * la información brindada por el usuario
     * @return decisión del usuario
     */
    public int menu(){
        Scanner input = new Scanner(System.in);
        System.out.println(menu);
        return input.nextInt();
    }

    /**
     * Implementa la clase NewVehicle para crear 10 vehículos nuevos
     */
    public void saveVehicles(){
        int j;
        int option;
        for (int i = 0; i < 2; i++) {
            option= menu();
            j = i +1;
            functionalityMenu(option, j);
            System.out.println("Su vehículo " + j + " se ha guardado correctamente");
        }
    }

    /**
     * Funcionalidad al menú, implementa los métodos
     * según la opción elegida por el usuario.
     * @param option opción elegida por el usuario
     * @param number número de vehículo que se está creando
     */
    public void functionalityMenu(int option, int number){
        NewVehicle newVehicle = new NewVehicle();
        switch (option){
            case 1:
                addVehicle(newVehicle.newCar(number, "maletero(sí/no)"));
                break;
            case 2:
                addVehicle(newVehicle.newBicycle(number,"canasta(sí/no)"));
                break;
            case 3:
                addVehicle(newVehicle.newBike(number, "motor(2 o 4 tiempos)"));
                break;
            case 4:
                addVehicle(newVehicle.newBoat(number, "motor(sí/no)"));
                break;
            case 5:
                addVehicle(newVehicle.newTruck(number, "altura"));
                break;
            case 6:
                addVehicle(newVehicle.newVehicle( "tipo", number));
                break;
            default:
                System.out.println("Ingrese un número dentro de las opciones");
        }
    }

    /**
     * Imprime en pantalla la lista de vehículos
     */
    public void print(){
        System.out.println(vehicles.toString());
    }
}