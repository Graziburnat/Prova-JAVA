package models;

import java.util.Date;

public class EntradaCarro {

    public EntradaCarro(String placa){
        setData(new Date());
    }

    Date data;
    Carro placa;

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Carro getPlaca() {
        return placa;
    }
    public void setPlaca(Carro placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Placa do carro: " + getPlaca() + "|| Data de entrada: " + getData();
    }

}
