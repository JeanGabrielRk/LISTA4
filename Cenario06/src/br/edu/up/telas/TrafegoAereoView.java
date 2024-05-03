package telas;

import modelos.Aeronave;
import modelos.Passageiro;
import modelos.Pessoa;
import modelos.Tripulacao;

public class TrafegoAereoView {

    public void exibirMenu() {
        System.out.println("===== Menu =====");
        System.out.println("1. Adicionar passageiro");
        System.out.println("2. Adicionar tripulação");
        System.out.println("3. Listar pessoas");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public void mostrarPessoa(Pessoa pessoa) {
        if (pessoa instanceof Passageiro) {
            Passageiro passageiro = (Passageiro) pessoa;
            System.out.println("Passageiro: " + pessoa.getNome());
            System.out.println("Identificador de Bagagem: " + passageiro.getIdentificadorBagagem());
        } else if (pessoa instanceof Tripulacao) {
            Tripulacao tripulacao = (Tripulacao) pessoa;
            System.out.println("Tripulação: " + pessoa.getNome());
            System.out.println("Identificação Aeronáutica: " + tripulacao.getIdentificacaoAeronautica());
        }
    }

    public void mostrarAeronave(Aeronave aeronave) {
        System.out.println("Aeronave:");
        System.out.println("Código: " + aeronave.getCodigo());
        System.out.println("Tipo: " + aeronave.getTipo());
        System.out.println("Quantidade de Assentos: " + aeronave.getQuantidadeAssentos());
    }
}

