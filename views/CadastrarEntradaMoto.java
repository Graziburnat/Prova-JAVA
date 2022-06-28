package views;


import controllers.EntradaMotoController;
import models.EntradaMoto;
import utils.Console;

public class CadastrarEntradaMoto {

    public void renderizar() {

        EntradaMotoController entradaMotoController = new EntradaMotoController();
        System.out.println("\n -- ENTRADA DE MOTOS --");

        String placa;

        placa= (Console.readString("Digite a placa da moto que irá entrar: "));

        EntradaMoto entradaMoto = new EntradaMoto(placa);

        if(entradaMotoController.cadastrar(entradaMoto)){
            System.out.println("\n Entrada cadastrada");
        }else{
            System.out.println("\n Placa não cadastrada");
        }

    }
    
}
