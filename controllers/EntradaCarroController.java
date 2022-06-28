package controllers;

import java.util.ArrayList;

import models.EntradaCarro;

public class EntradaCarroController {

    private static ArrayList<EntradaCarro> entradas = new ArrayList<EntradaCarro>();

    public boolean cadastrar(EntradaCarro entrada){
        if(buscarPlaca(entrada.getPlaca().toString()) != null){
            entradas.add(entrada);
            return true;
        }
        return false;
    }

    public ArrayList<EntradaCarro> listar() {
        return entradas;
    }


    public EntradaCarro buscarPlaca(String placa) {
        for (EntradaCarro entradaCadastrado : entradas) {
            if (entradaCadastrado.getPlaca().toString().equals(placa)) {
                return entradaCadastrado;
            }
        }
        return null;
    }


    public EntradaCarro remover(String placa){
        for (EntradaCarro entradaCadastrado : entradas) {
            if (entradaCadastrado.getPlaca().toString().equals(placa)) {
                entradas.remove(entradaCadastrado);
                return entradaCadastrado;
            }
        }
        return null;
    }
    
}
