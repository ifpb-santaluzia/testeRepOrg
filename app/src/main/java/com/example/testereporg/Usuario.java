package com.example.testereporg;

public class Usuario {
    private String nome;
    private int anoDeNascimento;

    public Usuario(String nome, int anoDeNascimento) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }
}
