package models;

import java.util.Date;

public class Automovel {

    public Automovel(String modelo, String placa, String cor) {

        setData(new Date());
        setModelo(modelo);
        setPlaca(placa);
        setCor(cor);
    }

    private String modelo;
    private String placa;
    private String cor;
    private Date data;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Modelo: " + getModelo() + "|| Placa: " + getPlaca() + "|| Cor: " + getCor() + "|| Data do cadastro: " + getData();
    }
    
}
