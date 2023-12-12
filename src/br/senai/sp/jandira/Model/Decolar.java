package br.senai.sp.jandira.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public final class Decolar extends Voo {

    String nomeAgencia;
    public Decolar(int numeroVoo, int lotacao, String origem, String destino, LocalDate data, LocalTime hora){
        super(numeroVoo, lotacao, origem, destino, data, hora);

        this.nomeAgencia = "Voo Emirates";
    }
}
