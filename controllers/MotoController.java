package controllers;

import java.util.ArrayList;

import models.Moto;

public class MotoController {

    private static ArrayList<Moto> motos = new ArrayList<Moto>();

    public boolean entrada(Moto moto) {

        if (buscarPlaca(moto.getPlaca()) == null) {
            motos.add(moto);
            return true;
        }
        return false;
    }

    public ArrayList<Moto> listar() {

        return motos;

    }

    public Moto buscarPlaca(String placa) {

        for (Moto motoCadastrada : motos) {
            if (motoCadastrada.getPlaca().equals(placa)) {
                return motoCadastrada;
            }
        }
        return null;
    }

    public Moto remover(String placa){

        for (Moto motoCadastrada : motos) {
            if (motoCadastrada.getPlaca().equals(placa)) {
                motos.remove(motoCadastrada);
                return motoCadastrada;
            }
        }
        return null;
    }
    
}
