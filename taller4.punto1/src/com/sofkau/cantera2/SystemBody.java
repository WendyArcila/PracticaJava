package com.sofkau.cantera2;

/**
 * Clase que define la estructura para los objetos
 * de tipo cuerpo del sistema
 * @version 0.00.001 2022-11-28
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-28
 */
public class SystemBody {
    private int id;
    private double mass;
    private double density;
    private double diameter;
    private double distanceToSun;
    private String name;

    /**
     * Constructor para crear cuerpos del sistema
     * @param id identificador
     * @param mass masa
     * @param density densidad
     * @param diameter diámetro
     * @param distanceToSun distancia al sol
     * @param name nombre
     */
    public SystemBody(int id, double mass, double density, double diameter, double distanceToSun, String name) {
        this.id = id;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;
        this.name = name;
    }

    public SystemBody() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sobrescribe el método toString para imprimir de forma
     * ordena las características de los cuerpos del sistema
     * @return Cadena de caracteres ordenada
     */
    @Override
    public String toString() {
        return "SystemBody{" +
                "id=" + id +
                ", mass=" + mass +
                ", density=" + density +
                ", diameter=" + diameter +
                ", distanceToSun=" + distanceToSun +
                ", name='" + name + '\'' +
                '}';
    }
}