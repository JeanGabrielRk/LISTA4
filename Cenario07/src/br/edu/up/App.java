package br.edu.up;

import br.edu.up.controles.AcademicoController;
import br.edu.up.telas.AcademicoView;

public class App {
    public static void main(String[] args) throws Exception {
        AcademicoController controller = new AcademicoController();
        AcademicoView view = new AcademicoView(controller);
        view.exibirMenuPrincipal();
    }
}
