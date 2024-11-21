package Ejercicio3;

public class Main{
    public static void main(String[] args) {
        Camion camion1 = new Camion("Grande", 189);

        camion1.cargarMercancia();
        camion1.arrancar();
        camion1.acelerar(15);
        camion1.descargarMercancia(15);
        camion1.descargarMercancia(12);
        camion1.detener();
    }   
}
