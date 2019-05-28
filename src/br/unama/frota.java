package br.unama;

public class frota {
    private int numero;
    private String placa;
    private String carro;
    private empresario emp;

    public frota(int numero, String placa, String carro) {
        this.numero = numero;
        this.placa = placa;
        this.carro = carro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }
}
