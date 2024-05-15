package controles;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelos.Aeronave;
import modelos.Passageiro;
import modelos.Passagem;
import modelos.Pessoa;
import modelos.Tripulacao;
import telas.TrafegoAereoView;

public class TrafegoAereoController {

    private TrafegoAereoView view;
    private List<Pessoa> pessoas;
    private Aeronave aeronave;

    public TrafegoAereoController(TrafegoAereoView view) {
        this.view = view;
        this.pessoas = new ArrayList<>();
        this.aeronave = new Aeronave();
    }

    public void adicionarPassageiro(Scanner scanner) {
        System.out.println("Informe o nome do passageiro: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o RG do passageiro: ");
        String rg = scanner.nextLine();
        System.out.println("Informe o identificador de bagagem: ");
        String identificadorBagagem = scanner.nextLine();
        System.out.println("Informe o número do assento: ");
        String numeroAssento = scanner.nextLine();
        System.out.println("Informe a classe do assento: ");
        String classeAssento = scanner.nextLine();
        System.out.println("Informe o ano do voo: ");
        int ano = scanner.nextInt();
        System.out.println("Informe o mês do voo: ");
        int mes = scanner.nextInt();
        System.out.println("Informe o dia do voo: ");
        int dia = scanner.nextInt();
        System.out.println("Informe a hora do voo: ");
        int hora = scanner.nextInt();
        System.out.println("Informe os minutos do voo: ");
        int minutos = scanner.nextInt();
        scanner.nextLine(); 
        LocalDateTime dataVoo = LocalDateTime.of(ano, mes, dia, hora, minutos);
        
        
        System.out.println("Informe o código da aeronave: ");
        String codigoAeronave = scanner.nextLine();
        System.out.println("Informe o tipo da aeronave: ");
        String tipoAeronave = scanner.nextLine();
        System.out.println("Informe a quantidade de assentos da aeronave: ");
        int quantidadeAssentosAeronave = scanner.nextInt();
        scanner.nextLine(); 
        Aeronave aeronave = new Aeronave(codigoAeronave, tipoAeronave, quantidadeAssentosAeronave);
        
        Passageiro passageiro = new Passageiro(nome, rg, identificadorBagagem, new Passagem(numeroAssento, classeAssento, dataVoo), aeronave);
        pessoas.add(passageiro);
    }
    
    public void adicionarTripulacao(Scanner scanner) {
        System.out.println("Informe o nome da tripulação: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o RG da tripulação: ");
        String rg = scanner.nextLine();
        System.out.println("Informe a identificação aeronáutica: ");
        String identificacaoAeronautica = scanner.nextLine();
        System.out.println("Informe a matrícula do funcionário: ");
        String matriculaFuncionario = scanner.nextLine();
        
        
        System.out.println("Informe o código da aeronave: ");
        String codigoAeronave = scanner.nextLine();
        System.out.println("Informe o tipo da aeronave: ");
        String tipoAeronave = scanner.nextLine();
        System.out.println("Informe a quantidade de assentos da aeronave: ");
        int quantidadeAssentosAeronave = scanner.nextInt();
        scanner.nextLine(); 
        Aeronave aeronave = new Aeronave(codigoAeronave, tipoAeronave, quantidadeAssentosAeronave);
        
        Tripulacao tripulacao = new Tripulacao(nome, rg, identificacaoAeronautica, matriculaFuncionario, aeronave);
        pessoas.add(tripulacao);
    }

    public void listarPessoas() {
        for (Pessoa pessoa : pessoas) {
            view.mostrarPessoa(pessoa);
            if (pessoa instanceof Passageiro) {
                Passageiro passageiro = (Passageiro) pessoa;
                System.out.println("Identificador de Bagagem: " + passageiro.getIdentificadorBagagem());
                Passagem passagem = passageiro.getPassagem();
                System.out.println("Número do Assento: " + passagem.getNumeroAssento());
                System.out.println("Classe do Assento: " + passagem.getClasseAssento());
                System.out.println("Data do Voo: " + passagem.getDataVoo());
                Aeronave aeronave = passageiro.getAeronave();
                System.out.println("Código da Aeronave: " + aeronave.getCodigo());
                System.out.println("Tipo da Aeronave: " + aeronave.getTipo());
                System.out.println("Quantidade de Assentos da Aeronave: " + aeronave.getQuantidadeAssentos());
            } else if (pessoa instanceof Tripulacao) {
                Tripulacao tripulacao = (Tripulacao) pessoa;
                System.out.println("Identificação Aeronáutica: " + tripulacao.getIdentificacaoAeronautica());
                System.out.println("Matrícula do Funcionário: " + tripulacao.getMatriculaFuncionario());
                Aeronave aeronave = tripulacao.getAeronave();
                System.out.println("Código da Aeronave: " + aeronave.getCodigo());
                System.out.println("Tipo da Aeronave: " + aeronave.getTipo());
                System.out.println("Quantidade de Assentos da Aeronave: " + aeronave.getQuantidadeAssentos());
            }
            System.out.println(); 
        }
    }
    

    public void exibirAeronave() {
        view.mostrarAeronave(aeronave);
    }
}
