package Ejercicio2;

public class CuentaBancaria implements Retiro, Transferencias{
    private double saldo;
    private String numCuenta;
    private String tipoCuenta;
    private String cuentaDestino;

    public CuentaBancaria(double saldo, String numCuenta, String tipoCuenta, String cuentaDestino) {
        this.saldo = saldo;
        this.numCuenta = numCuenta;
        this.tipoCuenta = tipoCuenta;
        this.cuentaDestino = cuentaDestino;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public void transferir(double monto){
        double nuevoSaldo = getSaldo()-monto;
        System.out.println("Se ha transferido correctamente "+monto+" de la cuenta "+getNumCuenta()+""+getTipoCuenta()+
        " a la cuenta "+getCuentaDestino()+" correctamente");
        System.out.println("El nuevo saldo de la cuenta "+getNumCuenta()+""+getTipoCuenta()+" es de "+nuevoSaldo+" pesos");
        setSaldo(nuevoSaldo);
    }
    @Override
    public void retiro(double monto){
        double nuevoSaldo = getSaldo()-monto;
        System.out.println("Se ha retirado "+monto+" de la cuenta "+getNumCuenta()+""+getTipoCuenta()+" del cajero automatico");
        System.out.println("Su nuevo saldo es de: "+nuevoSaldo+" pesos");
        setSaldo(nuevoSaldo);
    }
}
