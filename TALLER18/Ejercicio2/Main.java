package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(80000, "123456", "ahorros", "789456");
        cuenta1.retiro(10000);
        cuenta1.transferir(5000);
    }
}