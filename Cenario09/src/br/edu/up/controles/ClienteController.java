package controles;

import modelos.Cliente;
import modelos.ClienteEmpresa;
import modelos.ClientePessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteController {
    private List<Cliente> clientes;
    private Scanner scanner;

    public ClienteController() {
        clientes = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void incluirClientePessoa(ClientePessoa cliente) {
        clientes.add(cliente);
        System.out.println("Cliente pessoa incluído com sucesso!");
    }

    public void incluirClienteEmpresa(ClienteEmpresa cliente) {
        clientes.add(cliente);
        System.out.println("Cliente empresa incluído com sucesso!");
    }

    public void mostrarDadosClientePessoa() {
        System.out.println("Dados dos clientes pessoa:");
        clientes.stream()
                .filter(cliente -> cliente instanceof ClientePessoa)
                .forEach(System.out::println);
    }

    public void mostrarDadosClienteEmpresa() {
        System.out.println("Dados dos clientes empresa:");
        clientes.stream()
                .filter(cliente -> cliente instanceof ClienteEmpresa)
                .forEach(System.out::println);
    }

    public void emprestarParaCliente(Cliente cliente) {
        System.out.println("Digite o valor a ser emprestado:");
        double valor = scanner.nextDouble();
        cliente.emprestar(valor);
    }

    public void devolverDeCliente(Cliente cliente) {
        System.out.println("Digite o valor a ser devolvido:");
        double valor = scanner.nextDouble();
        cliente.devolver(valor);
    }

    private Cliente encontrarCliente(String nome, Class<? extends Cliente> tipoCliente) {
        for (Cliente cliente : clientes) {
            if (tipoCliente.isInstance(cliente) && cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }

    public void emprestarParaClientePessoa() {
        System.out.println("Digite o nome do cliente pessoa:");
        String nome = scanner.next();
        Cliente cliente = encontrarCliente(nome, ClientePessoa.class);
        if (cliente != null) {
            emprestarParaCliente(cliente);
        } else {
            System.out.println("Cliente pessoa não encontrado.");
        }
    }

    public void emprestarParaClienteEmpresa() {
        System.out.println("Digite o nome do cliente empresa:");
        String nome = scanner.next();
        Cliente cliente = encontrarCliente(nome, ClienteEmpresa.class);
        if (cliente != null) {
            emprestarParaCliente(cliente);
        } else {
            System.out.println("Cliente empresa não encontrado.");
        }
    }

    public void devolverDeClientePessoa() {
        System.out.println("Digite o nome do cliente pessoa:");
        String nome = scanner.next();
        Cliente cliente = encontrarCliente(nome, ClientePessoa.class);
        if (cliente != null) {
            devolverDeCliente(cliente);
        } else {
            System.out.println("Cliente pessoa não encontrado.");
        }
    }

    public void devolverDeClienteEmpresa() {
        System.out.println("Digite o nome do cliente empresa:");
        String nome = scanner.next();
        Cliente cliente = encontrarCliente(nome, ClienteEmpresa.class);
        if (cliente != null) {
            devolverDeCliente(cliente);
        } else {
            System.out.println("Cliente empresa não encontrado.");
        }
    }
}
