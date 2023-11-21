package br.senai.sp.jandira.Model;

import java.time.LocalDateTime;

public final class CVC extends Voo {

    String nomeAgencia;
    public CVC(int numeroVoo, int lotacao, String origem, String destino){
        super(numeroVoo, lotacao, origem, destino);

        this.nomeAgencia = "Voo Delta";
    }


}
