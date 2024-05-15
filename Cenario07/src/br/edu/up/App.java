import controles.AcademicoController;
import telas.AcademicoView;

public class App {
    public static void main(String[] args) throws Exception {
        AcademicoController controller = new AcademicoController();
        AcademicoView view = new AcademicoView(controller);
        view.exibirMenuPrincipal();
    }
}
