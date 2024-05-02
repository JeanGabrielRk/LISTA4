import controles.EventoController;
import telas.EventoView;

public class Programa {
    public static void main(String[] args) throws Exception {
        
        EventoController controller = new EventoController();
        EventoView view = new EventoView(controller);

        view.exibirMenu();
    }
}
