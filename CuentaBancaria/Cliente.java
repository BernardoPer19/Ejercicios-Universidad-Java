public class Cliente extends Persona2 {
    private int idCliente;
    private CuentaBancaria[] arrCuentas;
    private int contador;
    private int cont;
    int limite = 3;
    public Cliente(String nombre, int dni, String direccion, int  idCliente) {
        super(nombre, dni, direccion);
        this.idCliente = idCliente;
        this.arrCuentas = new CuentaBancaria[limite];
        this.cont = 0;
    }

    public int getID(){return idCliente;}

    public String getnombre(){return nombre;}

    public String getdireccion(){return direccion;}

    public boolean agregarCuenta(CuentaBancaria cuenta) {
        if(cont > arrCuentas.length){System.out.print("no se puede añadir mas");    return false;}
        else{
            arrCuentas[cont]=cuenta;
            cont++;
            return true;
        }
    }

    public void mostrarDatos() {

        for (int i = 0; i < contador; i++) {
            System.out.println(arrCuentas[i].getSaldo());
            System.out.println(arrCuentas[i].getID());
            System.out.println(arrCuentas[i].getNumCuenta());

        }
    }


}
