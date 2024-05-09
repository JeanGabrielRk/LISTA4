package telas;

import controles.ClienteController;
import modelos.Cidade;
import modelos.ClienteEmpresa;
import modelos.ClientePessoa;
import modelos.Endereco;

import java.util.Scanner;

public class MenuView {
    private Scanner scanner;

    public MenuView() {
        scanner = new Scanner(System.in);
    }

    public void exibirMenu(ClienteController controller) {
        boolean sair = false;
        while (!sair) {
            int opcao = mostrarMenu();

            switch (opcao) {
                case 1:
                    ClientePessoa clientePessoa = lerClientePessoa();
                    controller.incluirClientePessoa(clientePessoa);
                    break;
                case 2:
                    ClienteEmpresa clienteEmpresa = lerClienteEmpresa();
                    controller.incluirClienteEmpresa(clienteEmpresa);
                    break;
                case 3:
                    controller.mostrarDadosClientePessoa();
                    break;
                case 4:
                    controller.mostrarDadosClienteEmpresa();
                    break;
                case 5:
                    controller.emprestarParaClientePessoa();
                    break;
                case 6:
                    controller.emprestarParaClienteEmpresa();
                    break;
                case 7:
                    controller.devolverDeClientePessoa();
                    break;
                case 8:
                    controller.devolverDeClienteEmpresa();
                    break;
                case 9:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private int mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Incluir cliente pessoa");
        System.out.println("2. Incluir cliente empresa");
        System.out.println("3. Mostrar dados cliente pessoa");
        System.out.println("4. Mostrar dados cliente empresa");
        System.out.println("5. Emprestar para cliente pessoa");
        System.out.println("6. Emprestar para cliente empresa");
        System.out.println("7. Devolução de cliente pessoa");
        System.out.println("8. Devolução de cliente empresa");
        System.out.println("9. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    private ClientePessoa lerClientePessoa() {
        ClientePessoa cliente = new ClientePessoa();
        System.out.println("Digite o nome do cliente pessoa:");
        cliente.setNome(scanner.next());
        System.out.println("Digite o telefone:");
        cliente.setTelefone(scanner.next());
        System.out.println("Digite o CPF:");
        cliente.setCpf(scanner.next());
        System.out.println("Digite o valor máximo de crédito:");
        cliente.setVlrMaxCredito(scanner.nextDouble());
        System.out.println("Digite o valor emprestado:");
        cliente.setVlrEmprestado(scanner.nextDouble());
        System.out.println("Digite o valor da altura:");
        cliente.setAltura(scanner.nextDouble());
        System.out.println("Digite o valor do PEC:");
        cliente.setPec(scanner.nextDouble());
        Endereco endereco = new Endereco();
        System.out.println("Digite a rua:");
        endereco.setRua(scanner.next());
        System.out.println("Digite o número:");
        endereco.setNumero(scanner.next());
        System.out.println("Digite o bairro:");
        endereco.setBairro(scanner.next());
        System.out.println("Digite o nome da cidade:");
        Cidade cidade = new Cidade();
        cidade.setNome(scanner.next());
        endereco.setCidade(cidade);
        cliente.setEndereco(endereco);
        return cliente;
    }
    
    private ClienteEmpresa lerClienteEmpresa() {
        ClienteEmpresa cliente = new ClienteEmpresa();
        System.out.println("Digite o nome do cliente empresa:");
        cliente.setNome(scanner.next());
        System.out.println("Digite o telefone:");
        cliente.setTelefone(scanner.next());
        System.out.println("Digite o CNPJ:");
        cliente.setCnpj(scanner.next());
        System.out.println("Digite o valor máximo de crédito:");
        cliente.setVlrMaxCredito(scanner.nextDouble());
        System.out.println("Digite o valor emprestado:");
        cliente.setVlrEmprestado(scanner.nextDouble());
        System.out.println("Digite a inscrição estadual:");
        cliente.setInscEstadual(scanner.next());
        Endereco endereco = new Endereco();
        System.out.println("Digite a rua:");
        endereco.setRua(scanner.next());
        System.out.println("Digite o número:");
        endereco.setNumero(scanner.next());
        System.out.println("Digite o bairro:");
        endereco.setBairro(scanner.next());
        System.out.println("Digite o nome da cidade:");
        Cidade cidade = new Cidade();
        cidade.setNome(scanner.next());
        endereco.setCidade(cidade);
        cliente.setEndereco(endereco);
        return cliente;
    }
    
}
