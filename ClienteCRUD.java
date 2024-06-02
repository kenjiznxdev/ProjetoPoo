import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ClienteCRUD {
    private final List<Cliente> clientes;

    public ClienteCRUD() {
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente registrado: " + cliente);
    }

    public Cliente obterCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
        // atualização de cliente e status
    public void atualizarCliente(String cpf, Cliente novoCliente) {
        Cliente cliente = obterCliente(cpf);
        if (cliente != null) {
            cliente.setNome(novoCliente.getNome());
            cliente.setEndereco(novoCliente.getEndereco());
            System.out.println("Cliente atualizado: " + cliente);
        } else {
            System.out.println("Cliente não encontrado no sistema de reservas.");
        }
    }

    public void removerCliente(String cpf) {
        Cliente cliente = obterCliente(cpf);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente removido: " + cliente);
        } else {
            System.out.println("Cliente não encontrado em nosso sistema.");
        }
    }

    // visualizar os clientes 
    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public static void main(String[] args) {
        ClienteCRUD clienteCRUD = new ClienteCRUD();
        
        // crud geral de ações permitidas ao cliente
        Cliente cliente1 = new Cliente("Caíque Soares", "33344455566", "rua dos bobos, n 0");
        Cliente cliente2 = new Cliente("Beatriz Figueiredo", "66555444333", "rua sem saida, n s/n");
        clienteCRUD.adicionarCliente(cliente1);
        clienteCRUD.adicionarCliente(cliente2);
 
        System.out.println("Registros de Hóspedes:");
        clienteCRUD.listarClientes();

        Cliente novoCliente1 = new Cliente("Caique Silva", "33344455566", "avenida infinita, n 888");
        clienteCRUD.atualizarCliente("33344455566", novoCliente1);

        System.out.println("Cliente atualizado:");
        System.out.println(clienteCRUD.obterCliente("33344455566"));

        clienteCRUD.removerCliente("66555444333");

        System.out.println("Lista de hóspedes após atualização de remoção:");
        clienteCRUD.listarClientes();

        // Criação de quarto e reserva com a logica implementada
        Quarto quarto1 = new Quarto(202, "Casal", 350.0, 2);
        
        Calendar cal = Calendar.getInstance();
        cal.set(2024, Calendar.NOVEMBER, 13); // setando a data de entrada do cliente
        Date dataEntrada = cal.getTime();
        
        int numeroDeDias = 3; // entrada do numero de dias que o cliente vai ficar
        Reserva reserva1 = new Reserva(cliente1, quarto1, dataEntrada, dataEntrada, numeroDeDias);

        System.out.println("Detalhes da Reserva:");
        System.out.println(reserva1);
    }
}
