public class Banco {
    private Cliente[] arrClien;
    private int cont;
    private CuentaBancaria[] cuentas;
    int capacidadCuentas = 5;
    int capacidadClientes = 5;
    public Banco() {
        arrClien = new Cliente[capacidadClientes];
        cuentas = new CuentaBancaria[capacidadCuentas];
        cont = 0;
    }

    public boolean registrarCliente(Cliente cliente) {
        if(cont > arrClien.length){return false;}
        else{arrClien[cont] = cliente;
            cont++;
            return true;

        }

    }

    public void removerClientePorId(int ID) {
        for(int i = 0; i < cont ; i++){
            if(arrClien[i].getID() == ID){
                for(int j = i; j<cont-1; j++){
                    arrClien[j]=arrClien[j+1];
                }

                arrClien[cont--]= null;
                cont--;

            }
        }
    }

    public Cliente buscarClientePorId(int idCliente) {
        for(int i = 0; i<cont; i++){
            if(arrClien[i].getID() == idCliente){
                return arrClien[i];
            }    
        }
        return null;
    }

    public void mostrarClientes() {
        if (cont == 0) {
            System.out.println("No hay clientes registrados.");
            return;
        }

        for (int i = 0; i < cont; i++) {
            System.out.println("Nombre: " + arrClien[i].getnombre());
            System.out.println("Dirección: " + arrClien[i].getdireccion());
            System.out.println("ID: " + arrClien[i].getID());
            System.out.println("----------------------------");
        }
    }

}
