/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;


public class Moto extends  Vehiculo{
    
    public Moto(String hp,int ruedas,String modelo,String color,String marca,int capacidad,int añoFabrica){
        super(hp,ruedas,modelo,color,marca,capacidad,añoFabrica);
    }
        public void frenar(){
            System.out.println("La moto frena");
        }
    public void choca (){  
         System.out.println("La moto choca");
    }
    public void gira (){ 
         System.out.println("La moto gira");
    }
    public void acelera (){  
         System.out.println("La moto ascelera");
    }
            
}
