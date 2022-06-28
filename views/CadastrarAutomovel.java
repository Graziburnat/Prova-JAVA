package views;

import utils.Console;

public class CadastrarAutomovel {

    public void cadastrar(){

        String tipo = (Console.readString("\n Digite M para moto ou C para carro: "));

        if(tipo.toUpperCase().equals("C")){
            CadastrarCarro cadastrarCarro = new CadastrarCarro();
            cadastrarCarro.renderizar();
        }else{
            CadastrarMoto cadastrarMoto = new CadastrarMoto();
            cadastrarMoto.renderizar();
        }

    }
    
}
