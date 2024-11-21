package Ejercicio3;

public class Camion implements Transportar, Conduccion {

    public String tipoCamion;
    private int numPaquete;
    
    public Camion(String tipoCamion, int numPaquete) {
        this.tipoCamion = tipoCamion;
        this.numPaquete = numPaquete;
    }

    public int getNumPaquete() {
        return numPaquete;
    }

    public void setNumPaquete(int numPaquete) {
        this.numPaquete = numPaquete;
    }

    @Override
    public void cargarMercancia(){
        System.out.println("Se han cargado "+getNumPaquete()+" paquetes al camion");
    }
    @Override
    public void descargarMercancia(int numPaquetesDescarga){
        int numPaqueteTotal = getNumPaquete()-numPaquetesDescarga;
        System.out.println("Se han descargado "+numPaquetesDescarga+" paquetes del camion");
        System.out.println("El total de paquetes que quedan son "+numPaqueteTotal);
        setNumPaquete(numPaqueteTotal);
    }
    @Override
    public void arrancar(){
        System.out.println("El camion arranca");
    }
    public void acelerar(double acelera){
        System.out.println("El camion acelera "+acelera+" km/h");
    }
    public void detener(){
        System.out.println("El camion frena y se detiene");
    }
    
}
