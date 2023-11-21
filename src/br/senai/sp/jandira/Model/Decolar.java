package br.senai.sp.jandira.Model;

public final class Decolar extends Voo {

    String nomeAgencia;
    public Decolar(int numeroVoo, int lotacao, String origem, String destino){
        super(numeroVoo, lotacao, origem, destino);

        this.nomeAgencia = "Voo Emirates";
    }
}
