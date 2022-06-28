package controllers;

import java.util.ArrayList;

import models.Carro;

public class CarroController {

    private static ArrayList<Carro> carros = new ArrayList<Carro>();

    public boolean cadastrar(Carro carro) {
        if (buscarPlaca(carro.getPlaca()) == null) {
            carros.add(carro);
            return true;
        }
        return false;
    }


    public ArrayList<Carro> listar() {
        return carros;
    }


    public Carro buscarPlaca(String placa) {
        for (Carro carroCadastrado : carros) {
            if (carroCadastrado.getPlaca().equals(placa)) {
                return carroCadastrado;
            }
        }
        return null;
    }


    public Carro remover(String placa){
        for (Carro carroCadastrado : carros) {
            if (carroCadastrado.getPlaca().equals(placa)) {
                carros.remove(carroCadastrado);
                return carroCadastrado;
            }
        }
        return null;
    }
}
