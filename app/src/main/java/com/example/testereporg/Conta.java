package com.example.testereporg;

public class Conta {
    private int numero;
    private int agencia;

    public Conta(int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
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
