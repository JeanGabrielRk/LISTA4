import java.util.Scanner;

import controles.TrafegoAereoController;
import telas.TrafegoAereoView;

public class Programa {
    public static void main(String[] args) throws Exception {
        
        TrafegoAereoView view = new TrafegoAereoView();
        TrafegoAereoController controller = new TrafegoAereoController(view);
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            view.exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    controller.adicionarPassageiro(scanner);
                    break;
                case 2:
                    controller.adicionarTripulacao(scanner);
                    break;
                case 3:
                    controller.listarPessoas();
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 4);
        
        scanner.close();
    }
}
