package br.unama;

import java.util.ArrayList;

public class usuario {
    private String nome;
    private String CPF;
    private ArrayList<tipoFrota> u;

    public usuario(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public void cadastroUsuario(){

    }
}
