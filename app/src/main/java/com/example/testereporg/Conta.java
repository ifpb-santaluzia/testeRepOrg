package com.example.testereporg;

public class Conta {
    private int numero;
    private int agencia;
    private String nomeAgencia;

    public Conta(int numero, int agencia, String nomeAgencia) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeAgencia = nomeAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}
