package views;

import utils.Console;

public class EntradasAutomovel {

    public void entrada(){

        String tipo = (Console.readString("\n Digite M para moto ou C para carro: "));

        if(tipo.toUpperCase().equals("C")){
            CadastrarEntradaCarro cadastrarEntradaCarro = new CadastrarEntradaCarro();
            cadastrarEntradaCarro.renderizar();
        }else{
            CadastrarMoto cadastrarMoto = new CadastrarMoto();
            cadastrarMoto.renderizar();
        }

    }
    
}
