package com.sofkau.cantera2;

/**
 * Clase calcula la atracción gravitacional y la muestra en pantalla
 * @version 0.00.001 2022-11-28
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-28
 */
public class PlanetarySystem {
    private final double GRAVITATIONALCONSTANT = 6.672E-11;

    /**
     * Intenta calcular la atracción gravitacional
     * evitando que el usuario elija dos planetas iguales
     * @param planet1 planeta 1
     * @param planet2 planeta 2
     * @return la atracción gravitacional
     */
    public double tryGravitationalAttraction(SystemBody planet1, SystemBody planet2){
        try{
            double gravitationalAttraction;

            if (planet1.getDistanceToSun() == planet2.getDistanceToSun()){
                throw new ArithmeticException();
            } else{
                gravitationalAttraction = gravitationalAttraction(planet1,planet2);
                printGravitationalAttraction(planet1,planet2,gravitationalAttraction);
                return gravitationalAttraction;
            }
        } catch (ArithmeticException exc){
            System.out.println("Los planetas seleccionados deben ser diferentes");
        }
        return 0;
    }

    /**
     * Obtiene la constante gravitacional
     * @return la constante gravitacional
     */
    public double getGRAVITATIONALCONSTANT() {
        return GRAVITATIONALCONSTANT;
    }

    /**
     * Calcula la atracción gravitacional entre dos planetas
     * @param planet1 planeta1
     * @param planet2 planeta2
     * @return la atracción gravitacional entre dos planetas
     */
    public double gravitationalAttraction(SystemBody planet1, SystemBody planet2){
        double distance = distance(planet1,planet2);
        return (getGRAVITATIONALCONSTANT() *
                (planet1.getMass() * planet2.getMass())) /
                (Math.pow(distance * 1000, 2));
    }

    /**
     * Calcula la distancia entre los dos planetas
     * @param planet1 planeta 1
     * @param planet2 planeta 2
     * @return la distancia entre los dos planetas
     */
    public double distance(SystemBody planet1, SystemBody planet2){
        return  planet1.getDistanceToSun() - planet2.getDistanceToSun();
    }

    /**
     * Imprime en pantalla la atracción gravitacional
     * @param planet1 planeta1
     * @param planet2 planta 2
     * @param gravitationalAttraction La medida de atracción gravitacional
     */
    public void printGravitationalAttraction( SystemBody planet1,
                                              SystemBody planet2, double gravitationalAttraction){
        System.out.println("La atracción gravitacional entre: " +
                planet1.getName() + " y " + planet2.getName() +
                " es: " + gravitationalAttraction + "\n");
    }
}
