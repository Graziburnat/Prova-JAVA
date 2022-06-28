package views;

import controllers.EntradaCarroController;
import models.EntradaCarro;
import utils.Console;

public class CadastrarEntradaCarro {

    public void renderizar() {

        EntradaCarroController entradaCarroController = new EntradaCarroController();
        System.out.println("\n -- ENTRADA DE CARROS --");

        String placa;

        placa= (Console.readString("Digite a placa do carro que irá entrar: "));

        EntradaCarro entradaCarro = new EntradaCarro(placa);

        if(entradaCarroController.cadastrar(entradaCarro)){
            System.out.println("\n Entrada cadastrada");
        }else{
            System.out.println("\n Placa não cadastrada");
        }

    }
    
}
