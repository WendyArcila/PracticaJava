package com.sofkaU.cantera2.vehicle;

import com.sofkaU.cantera2.type.vehicle.Bicycle;
import com.sofkaU.cantera2.type.vehicle.Bike;
import com.sofkaU.cantera2.type.vehicle.Boat;
import com.sofkaU.cantera2.type.vehicle.Car;
import com.sofkaU.cantera2.type.vehicle.Truck;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Clase que permite la creación de un nuevo vehículo
 * @version 0.00.001 2022-12-05
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-12-05
 */
public class NewVehicle {

    Vehicle vehicle1 = new Vehicle();
    /**
     * Imprime en pantalla la solicitud de información
     * al usuario
     * @param message mensaje que informa la solicitud
     * @param number número de vehículo que se está creando
     * @return la información que ingresa el usuario.
     */
    public String printRequest(String message, int number){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese " + message + " del vehículo " + number);
        return input.nextLine();
    }

    /**
     * Crea una arreglo con la información ingresada por el usuario
     * @param number el número del vehículo que se está creando
     * @param specificFeatures característica específica de la clase
     *                         que extiende de vehículo
     * @return un arreglo con la información del vehículo
     */
    public String[] createVehicle(int number, String specificFeatures ){
        String[] messages = {
                "número de pasajeros", "número de ruedas",
                "ingrese la velocidad", "la fecha de registro (yyyy-mm-dd)",
                "medio por el que se desplaza", "modo de ingreso",
                "tiene tripulación (sí/no)", "placa o identificador",
                specificFeatures};

        String[] vehicle = new String[messages.length];

        for (int i = 0; i < messages.length; i++) {
            vehicle[i] = printRequest(messages[i], number);
        }
        return vehicle;
    }

    /**
     * Cambia el tipo de dato recibido(String) a entero(int)
     * @param num texto con el número a castear
     * @return el número casteado
     */
    public int parseInt(String num){
        return Integer.parseInt(num);
    }

    /**
     * Evalúa la decisión del usuario para devolver un boolean
     * @param bool decisión del usuario (sí/no)
     * @return respuesta en boolean donde sí es true y no es false
     */
    public boolean parseBoolean(String bool){
        if(bool.equalsIgnoreCase("sí")){
            return true;
        } else if (bool.equalsIgnoreCase("no")) {
            return false;
        } else {
            System.out.println("Respuesta no válida");
            return false;
        }
    }

    /**
     * Cambia el tipo de dato recibido(String) a número decimal(double)
     * @param number número en texto
     * @return número en double
     */
    public double parseDouble(String number){
        return Double.parseDouble(number);
    }

    /**
     * Cambia el tipo de dato recibido(String) a tipo fecha (LocalDate)
     * @param date fecha recibida en String
     * @return fecha en LocalDate
     */
    public LocalDate parseDate(String date){
        return LocalDate.parse(date);
    }

    /**
     * Ciclo infinito que evalúa la información ingresada por usuario
     * finaliza cuando el usuario ingresa la información correctamente
     * @param specificFeatures Característica específica de la clase
     *                         que extiende de vehículo
     * @param number número de vehículo en creación
     * @return el vehículo a guardar (nuevo objeto de tipo Vehicle)
     */
    public Vehicle newVehicle(String specificFeatures, int number){
        for(;;) {
            try {
                String[] vehicle = createVehicle(number, specificFeatures);
                return new Vehicle(
                        parseInt(vehicle[0]),
                        parseInt(vehicle[1]),
                        parseDouble(vehicle[2]),
                        parseDate(vehicle[3]),
                        vehicle[4], vehicle[5],
                        parseBoolean(vehicle[6]),
                        vehicle[7], vehicle[8]
                );
            } catch (Exception e) {
                System.out.println("Ingrese la información correctamente");
            }
        }
    }

    /**
     * Ciclo infinito que evalúa la información ingresada por usuario
     * finaliza cuando el usuario ingresa la información correctamente
     * @param specificFeatures Característica específica del carro
     * @param number número de vehículo en creación
     * @return el vehículo a guardar (nuevo objeto de tipo Vehicle)
     */
    public Car newCar(int number, String specificFeatures){
        vehicle1.setType("Carro");
        for(;;) {
            try {
                String[] vehicle = createVehicle(number, specificFeatures);
                return new Car(
                        parseInt(vehicle[0]),
                        parseInt(vehicle[1]),
                        parseDouble(vehicle[2]),
                        parseDate(vehicle[3]),
                        vehicle[4], vehicle[5],
                        parseBoolean(vehicle[6]),
                        vehicle[7], vehicle1.getType(),
                        parseBoolean(vehicle[8])
                );
            } catch (Exception e) {
                System.out.println("Ingrese la información correctamente");
            }
        }
    }

    /**
     * Ciclo infinito que evalúa la información ingresada por usuario
     * finaliza cuando el usuario ingresa la información correctamente
     * @param specificFeatures Característica específica de la bicicleta
     * @param number número de vehículo en creación
     * @return el vehículo a guardar (nuevo objeto de tipo Vehicle)
     */
    public Bicycle newBicycle(int number, String specificFeatures){
        vehicle1.setType("Bicicleta");
        for(;;) {
            try {
                String[] vehicle = createVehicle(number, specificFeatures);
                return new Bicycle(
                        parseInt(vehicle[0]),
                        parseInt(vehicle[1]),
                        parseDouble(vehicle[2]),
                        parseDate(vehicle[3]),
                        vehicle[4], vehicle[5],
                        parseBoolean(vehicle[6]),
                        vehicle[7], vehicle1.getType(),
                        parseBoolean(vehicle[8])
                );
            } catch (Exception e) {
                System.out.println("Ingrese la información correctamente");
            }
        }
    }

    /**
     * Ciclo infinito que evalúa la información ingresada por usuario
     * finaliza cuando el usuario ingresa la información correctamente
     * @param specificFeatures Característica específica de la moto
     * @param number número de vehículo en creación
     * @return el vehículo a guardar (nuevo objeto de tipo Vehicle)
     */
    public Bike newBike(int number, String specificFeatures){
        vehicle1.setType("Moto");
        for(;;) {
            try {
                String[] vehicle = createVehicle(number, specificFeatures);
                return new Bike(
                        parseInt(vehicle[0]),
                        parseInt(vehicle[1]),
                        parseDouble(vehicle[2]),
                        parseDate(vehicle[3]),
                        vehicle[4], vehicle[5],
                        parseBoolean(vehicle[6]),
                        vehicle[7], vehicle1.getType(),
                        vehicle[8]
                );
            } catch (Exception e) {
                System.out.println("Ingrese la información correctamente");
            }
        }
    }

    /**
     * Ciclo infinito que evalúa la información ingresada por usuario
     * finaliza cuando el usuario ingresa la información correctamente
     * @param specificFeatures Característica específica de la lancha
     * @param number número de vehículo en creación
     * @return el vehículo a guardar (nuevo objeto de tipo Vehicle)
     */
    public Boat newBoat(int number, String specificFeatures){
        vehicle1.setType("Lancha");
        for(;;) {
            try {
                String[] vehicle = createVehicle(number, specificFeatures);
                return new Boat(
                        parseInt(vehicle[0]),
                        parseInt(vehicle[1]),
                        parseDouble(vehicle[2]),
                        parseDate(vehicle[3]),
                        vehicle[4], vehicle[5],
                        parseBoolean(vehicle[6]),
                        vehicle[7], vehicle1.getType(),
                        parseBoolean(vehicle[8])
                );
            } catch (Exception e) {
                System.out.println("Ingrese la información correctamente");
            }
        }
    }

    /**
     * Ciclo infinito que evalúa la información ingresada por usuario
     * finaliza cuando el usuario ingresa la información correctamente
     * @param specificFeatures Característica específica del camión
     * @param number número de vehículo en creación
     * @return el vehículo a guardar (nuevo objeto de tipo Vehicle)
     */
    public Truck newTruck(int number, String specificFeatures){
        vehicle1.setType("Camión");
        for(;;) {
            try {
                String[] vehicle = createVehicle(number, specificFeatures);
                return new Truck(
                        parseInt(vehicle[0]),
                        parseInt(vehicle[1]),
                        parseDouble(vehicle[2]),
                        parseDate(vehicle[3]),
                        vehicle[4], vehicle[5],
                        parseBoolean(vehicle[6]),
                        vehicle[7], vehicle1.getType(),
                        parseDouble(vehicle[8])
                );
            } catch (Exception e) {
                System.out.println("Ingrese la información correctamente");
            }
        }
    }

}
