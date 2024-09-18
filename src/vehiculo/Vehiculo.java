/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

import java.util.Date;


 //Objeto Vehiculo
public class Vehiculo {
    //caracteristicas = atributos
    private String hp;
    private int ruedas;
    private String modelo;
    private String color;
    private String marca;
    private int capacidad;
    private int añoFabrica;
    private boolean encendido;
    
    //conductor - inicializar
    public Vehiculo(String hp,int ruedas,String modelo,String color,String marca,int capacidad,int añoFabrica){
            this.hp = hp;
            this.ruedas = ruedas;
            this.modelo = modelo;
            this.color = color;
            this.marca = marca;
            this.capacidad = capacidad;
            this.añoFabrica = añoFabrica;
    }
    
    public void transportar(){
        //sout = para que aparesca todo 
        System.out.println("El vehiculo esta en transporte");
    }
    public void encender(){
        System.out.println("El vehiculo encendido");
        this.encendido = true;
    }
    public void informacion(){
        System.out.println("Fuerza: " + hp);
        System.out.println("cantidad de ruedas: " + ruedas);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Año de Fabrica: " + añoFabrica);
    }
    }