package br.senai.sp.jandira.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public final class Gol extends Voo{

    String nomeAgencia;
    public Gol(int numeroVoo, int lotacao, String origem, String destino, LocalDate data, LocalTime hora){
        super(numeroVoo, lotacao, origem, destino, data, hora);

        this.nomeAgencia = "Gol";

    }

}
