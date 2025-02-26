public class CuentaNormal extends CuentaBancaria {
    private final double LIMITE_DEUDA = -300;

    public CuentaNormal(int idCuenta, int numCuenta, double saldo) {
        super(idCuenta, numCuenta, saldo);
    }

    @Override
    public void retirar(double monto) {
       if (monto <= 0) {
            System.out.println("Monto inválido.");
        } else {
           saldo -= monto;
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);
        }
    }
}
