package views;

import controllers.CarroController;
import utils.Console;

public class SaidaCarro {

    public void saida(){

        CarroController carroController = new CarroController();
        System.out.println("\n -- Saída de carros -- \n");
        carroController.remover((Console.readString("Digite a placa que deseja remover: ")));

    }
}
