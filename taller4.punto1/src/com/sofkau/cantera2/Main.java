package com.sofkau.cantera2;

/**
 * Clase que ejecuta el método main e implementa la clase SystemBody y
 * la clase PlanetarySystem
 * @version 0.00.001 2022-11-28
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-28
 */
public class Main {
    public static void main(String[] args) {
        SystemBody planet1 = new SystemBody(1, 6.39 * Math.pow(10,23),3.93, 6779, 22827E6, "Marte");
        SystemBody planet2 = new SystemBody(2, 5.972 * Math.pow(10,24),5.51, 120742,150E6, "Tierra");

        PlanetarySystem planetarySystem = new PlanetarySystem();

        planetarySystem.tryGravitationalAttraction(planet1,planet2);

    }
}