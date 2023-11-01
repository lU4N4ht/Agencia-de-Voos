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

    public void listarPassageiros(){
        for (Passageiro passageiro: ListPassageiro){
            System.out.println(passageiro.getNome());
            System.out.println(passageiro.getCpf());
            System.out.println(passageiro.getEndereco());
            System.out.println(passageiro.getRg());
            System.out.println(passageiro.getTelefone());
        }
    }
    public void adicionarPassageiros(Passageiro passageiro){
        ListPassageiro.add(passageiro);
    }
}
