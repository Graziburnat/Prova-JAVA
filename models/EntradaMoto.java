package models;

import java.util.Date;

public class EntradaMoto {

    public EntradaMoto(String placa) {
        setData(new Date());
    }

    Date data;
    Moto placa;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Moto getPlaca() {
        return placa;
    }

    public void setPlaca(Moto placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Placa do carro: " + getPlaca() + "|| Data de entrada: " + getData();
    }

}
