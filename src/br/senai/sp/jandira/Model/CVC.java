package br.senai.sp.jandira.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public final class CVC extends Voo {
    String nomeAgencia;
    public CVC(int numeroVoo, int lotacao, String origem, String destino, LocalDate data, LocalTime hora){
        super(numeroVoo, lotacao, origem, destino, data, hora);

        this.nomeAgencia = "Voo Delta";
    }


}
