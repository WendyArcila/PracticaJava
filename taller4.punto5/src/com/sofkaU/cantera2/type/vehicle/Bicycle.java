package com.sofkaU.cantera2.type.vehicle;


import com.sofkaU.cantera2.vehicle.Vehicle;

import java.time.LocalDate;

/**
 * Clase define la estructura para los objetos
 * de tipo Bicycle, extiende de Vehicle.
 * @version 0.00.001 2022-12-05
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-12-05
 */
public class Bicycle extends Vehicle {

    private boolean basket;

    /**
     * Constructor de bicicleta con todos los atributos
     * @param passengers número de pasajeros
     * @param wheels número de ruedas
     * @param speed velocidad máxima
     * @param registration fecha de registro
     * @param displacementOn medio por el que se desplaza
     * @param howToEnter modo de ingresar
     * @param crew ¿tripulación?
     * @param id placa identificadora
     * @param type tipo de vehículo
     * @param basket ¿tiene canasta?
     */
    public Bicycle(
            int passengers, int wheels, double speed,
            LocalDate registration, String displacementOn,
            String howToEnter, boolean crew, String id, String type,
            boolean basket)
    {
        super(passengers, wheels, speed,
                registration, displacementOn,
                howToEnter, crew, id, type);

        this.basket = basket;
    }

    /**
     * Aumenta la velocidad del vehículo
     */
    @Override
    public void speedUp() {
        for (int i = 0; getSpeed() < 45; i+=2) {
            setSpeed(i);
        }
    }

    /**
     * Sobrescribe el método toString para imprimir de forma
     * ordenada y con la información propia de la clase
     * @return Cadena de caracteres ordenada
     */
    @Override
    public String toString() {
        return super.toString() +
                ", ¿tiene canasta?: " + basket + ".\n" ;
    }
}