package br.unama;

import java.util.ArrayList;

public class empresario {
    private String nomeEmpresa;
    private String CNPJ;
    private ArrayList<frota> a;

    public empresario(String nomeEmpresa, String CNPJ) {
        this.nomeEmpresa = nomeEmpresa;
        this.CNPJ = CNPJ;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    public void cadastroEmpresa(){

    }
}
