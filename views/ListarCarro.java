package views;

import controllers.CarroController;
import models.Carro;

public class ListarCarro {

    public void compilar() {

        CarroController carroController = new CarroController();
        System.out.println("\n -- Lista de carros -- \n");

        for (Carro carroCadastrado : carroController.listar()) {
            System.out.println(carroCadastrado);
        }
    }

}
