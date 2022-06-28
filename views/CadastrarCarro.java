package views;

import controllers.CarroController;
import models.Carro;
import utils.Console;

public class CadastrarCarro {

    public void renderizar() {

        CarroController carroController = new CarroController();

        System.out.println("\n -- CADASTRO DE CARROS --");

        String modelo, cor, placa;

        modelo = (Console.readString("Digite o modelo do carro: "));
        cor = (Console.readString("Digite a cor do carro: "));
        placa = (Console.readString("Digite a placa do carro: "));

        Carro carro = new Carro(modelo, placa, cor);

        if (carroController.cadastrar(carro)){

            System.out.println("\n   Carro cadastrado com sucesso!");

        } else {
            System.out.println("\n    Placa já cadastrada.");

        }

    }

}
