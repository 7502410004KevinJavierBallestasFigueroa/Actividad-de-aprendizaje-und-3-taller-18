package Ejercicio1;

public class Bicicleta implements Reparacion, Limpieza{

    @Override
    public void reparar(){
        System.out.println("Se repara la bicicleta");
    }
    @Override
    public void limpiar(){
        System.out.println("Se limpia la bicicleta");
    }
    
}
