/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author Alumno-PB203
 */
public class Auto extends Vehiculo{
    private int numeroPuerta;
    public Auto(String hp, int ruedas, String modelo, String color, String marca, int capacidad, int añoFabrica,int numeroPuerta) {
        super(hp, ruedas, modelo, color, marca, capacidad, añoFabrica);
        this.numeroPuerta = numeroPuerta;
    }
    @Override
    public void informacion (){
       super.informacion();
        System.out.println("numero de puertas: "+ numeroPuerta);
    }
}
