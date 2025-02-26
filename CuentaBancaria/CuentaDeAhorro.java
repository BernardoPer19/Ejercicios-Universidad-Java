public class CuentaDeAhorro extends CuentaBancaria {
    private final double TASA_INTERES = 0.02; // 2% de interés anual

    public CuentaDeAhorro(int idCuenta, int numCuenta, double saldo) {
        super(idCuenta, numCuenta, saldo);
    }

  //  public void calcularIntereses() {
//        double intereses = saldo * TASA_INTERES;
       // saldo += intereses;
       // System.out.println("Intereses calculados: " + intereses);
      //  System.out.println("Nuevo saldo con intereses: " + saldo);
    //}
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de cuenta: Ahorro");
    }
}
