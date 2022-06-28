package views;

import utils.Console;

import controllers.MotoController;

public class SaidaMoto {

    public void saida() {

        MotoController motoController = new MotoController();
        System.out.println("\n -- Saída de carros -- \n");
        motoController.remover((Console.readString("Digite a placa que deseja remover: ")));
        
    }

}
