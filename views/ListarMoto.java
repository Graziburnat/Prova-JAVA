package views;

import controllers.MotoController;
import models.Moto;

public class ListarMoto {

    public void compilar() {

        MotoController motoController = new MotoController();
        System.out.println("\n -- Lista de motos -- \n");
        
        for (Moto motoCadastrada : motoController.listar()) {
            System.out.println(motoCadastrada);
        }
    }
}
