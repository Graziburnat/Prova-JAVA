package views;

import controllers.MotoController;
import models.Moto;
import utils.Console;

public class CadastrarMoto {

    public void renderizar() {

        MotoController motoController = new MotoController();

        System.out.println("\n -- CADASTRO DE MOTOS --");

        String modelo, cor, placa;

        modelo = (Console.readString("Digite o modelo da moto: "));
        cor = (Console.readString("Digite a cor da moto: "));
        placa = (Console.readString("Digite a placa da moto: "));

        Moto moto = new Moto(modelo, placa, cor);

        if (motoController.entrada(moto)) {

            System.out.println("\n   Moto cadastrada com sucesso!");

        } else {
            System.out.println("\n    Placa já cadastrada.");
        }

    }
    
}
