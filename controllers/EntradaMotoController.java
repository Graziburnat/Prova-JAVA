package controllers;

import java.util.ArrayList;

import models.EntradaMoto;

public class EntradaMotoController {
    
    private static ArrayList<EntradaMoto> entradas = new ArrayList<EntradaMoto>();

    public boolean cadastrar(EntradaMoto entrada){
        if(buscarPlaca(entrada.getPlaca().toString()) != null){
            entradas.add(entrada);
            return true;
        }
        return false;
    }

    public ArrayList<EntradaMoto> listar() {
        return entradas;
    }


    public EntradaMoto buscarPlaca(String placa) {
        for (EntradaMoto entradaCadastrado : entradas) {
            if (entradaCadastrado.getPlaca().toString().equals(placa)) {
                return entradaCadastrado;
            }
        }
        return null;
    }


    public EntradaMoto remover(String placa){
        for (EntradaMoto entradaCadastrado : entradas) {
            if (entradaCadastrado.getPlaca().toString().equals(placa)) {
                entradas.remove(entradaCadastrado);
                return entradaCadastrado;
            }
        }
        return null;
    }
}
