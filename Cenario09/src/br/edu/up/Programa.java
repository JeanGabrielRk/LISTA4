import controles.ClienteController;
import telas.MenuView;

public class Programa {
    public static void main(String[] args) {
        MenuView menu = new MenuView();
        ClienteController controller = new ClienteController();
        try {
            menu.exibirMenu(controller);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
