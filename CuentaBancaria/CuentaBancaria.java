public class CuentaBancaria {
    protected int idCuenta;
    protected int numCuenta;
    protected double saldo;

    public CuentaBancaria(int idCuenta, int numCuenta, double saldo) {
        this.idCuenta = idCuenta;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public int getID() {
        return idCuenta;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar(double monto) {
        if (monto < 0) {
            System.out.println("Fondos insuficientes o monto inválido.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);

        }
    }

    public void ingresarSaldo(double monto) {
       if (monto < 0) {
            System.out.println("Fondos insuficientes o monto inválido.");
        } else {
            saldo += monto;
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);

        }
    }

     public void mostrarDatos() {
    System.out.println("ID Cuenta: " + idCuenta);
    System.out.println("Número de Cuenta: " + numCuenta);
    System.out.println("Saldo: " + saldo);
}
    
    
}
