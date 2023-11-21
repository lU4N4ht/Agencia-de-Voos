package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {
    List<Passageiro> ListPassageiro = new ArrayList<>();
    private String nome, endereco;
    private long cpf, rg, telefone;

    public List<Passageiro> getListPassageiro() {
        return ListPassageiro;
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
