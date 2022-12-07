package com.sofkau.cantera2;

import java.time.LocalDate;

/**
 * Clase que define la estructura para los objetos
 * de tipo vehículo
 * @version 0.00.001 2022-12-05
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-12-05
 */
public class Vehicle {

    private int passengers;
    private int wheels;
    private double speed;
    private LocalDate registration;
    private String displacementOn;
    private String howToEnter;
    private boolean  crew;
    private String id;
    private String type;

    /**
     * Informa al usuario que el vehículo está en marcha
     */
    public void start(){
        if (speed > 0 ){
            System.out.println("En marcha");
        }
    }

    /**
     * Lleva al auto a una velocidad 0
     */
    public void stop(){
        while(speed > 0){
            speed -= 10;
        }
    }

    /**
     * Constructor vacío
     */
    public Vehicle() {
    }

    /**
     * Constructor de vehículo con todos los atributos
     * @param passengers número de pasajeros
     * @param wheels número de ruedas
     * @param speed velocidad máxima
     * @param registration fecha de registro
     * @param displacementOn medio por el que se desplaza
     * @param howToEnter modo de ingresar
     * @param crew ¿tripulación?
     * @param id placa identificadora
     * @param type tipo
     */
    public Vehicle(int passengers, int wheels, double speed, LocalDate registration,
                   String displacementOn, String howToEnter, boolean crew, String id, String type)
    {
        this.passengers = passengers;
        this.wheels = wheels;
        this.speed = speed;
        this.registration = registration;
        this.displacementOn = displacementOn;
        this.howToEnter = howToEnter;
        this.crew = crew;
        this.id = id;
        this.type = type;
    }

    /**
     * Sobrescribe el método toString para imprimir de forma
     * ordena los vehículos y su información
     * @return Cadena de caracteres ordenada
     */
    @Override
    public String toString() {
        return "Vehículo {" +
                "Capacidad para "  + passengers + " pasajeros" +
                ", tiene " + wheels + " ruedas" +
                ", su velocidad máxima es " + speed +
                ",\n fue registrado el " + registration +
                ", se desplaza por " + displacementOn +
                ", su ingreso es por medio de " + howToEnter +
                ",\n ¿tiene tripulación? " + crew +
                ", su placa es " + id +
                " y es de tipo " + type + "}\n";
    }
}