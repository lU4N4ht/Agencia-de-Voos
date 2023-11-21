package br.senai.sp.jandira.Model;

public final class Gol extends Voo{

    String nomeAgencia;
    public Gol(int numeroVoo, int lotacao, String origem, String destino){
        super(numeroVoo, lotacao, origem, destino);

        this.nomeAgencia = "Gol";

    }

}
