
package vehiculo;
//Autor: Rosmery Carreon Humpiri

public class Principal {
    public static void main (String[] args){
        
         //instanciar = invocar = llamar a un objeto
        Moto moto = new Moto("1700",2,"Toyota Yaris","Gris","Toyota",4,2025);
        //moto.encender();
        //moto.transportar();
        //moto.frenar();
        //moto.choca();
        //moto.gira();
        //moto.acelera();
        moto.informacion();
        
        Moto moto1 = new Moto("1700",2,"Toyota Yaris","Gris","Toyota",4,2025);
        //moto.encender();
        //moto.transportar();
        //moto.frenar();
        //moto.choca();
        //moto.gira();
        //moto.acelera();
         moto1.informacion();
         
       //instanciar = indicar  = llamar a un objeto
       Auto autito = new Auto("500",4,"Toyota Yaris","Negro","Toyota",10,2025,6);
       autito.informacion();
    }
}

