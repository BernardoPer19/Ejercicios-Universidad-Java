public class Empleado2 extends Persona2 {
    private Banco banco;

    public Empleado2(String nombre, int dni, String direccion, Banco banco) {
        super(nombre, dni, direccion);
        this.banco = banco;
    }

    public void registrarCliente(Cliente cliente) {
        banco.registrarCliente(cliente);
    }

    public void removerClientePorId(int idCliente) {
        banco.removerClientePorId(idCliente);
    }

    public Cliente buscarClientePorId(int idCliente) {
        return banco.buscarClientePorId(idCliente);
    }
}
