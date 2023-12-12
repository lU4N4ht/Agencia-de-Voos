package br.senai.sp.jandira.Model;

public class Passageiro {
    private String nome, endereco;
    private long cpf, rg, telefone;

    public Passageiro(String nome, String endereco, long cpf, long rg, long telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public long getCpf() {
        return cpf;
    }

    public long getRg() {
        return rg;
    }

    public long getTelefone() {
        return telefone;
    }
}
