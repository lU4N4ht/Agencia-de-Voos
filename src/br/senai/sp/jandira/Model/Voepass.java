package br.senai.sp.jandira.Model;

import java.time.LocalDateTime;

public final class Voepass extends Voo {
    public Voepass(int numeroVoo, int lotacao, String origem, String destino, LocalDateTime tempo){
        super(numeroVoo, lotacao, origem, destino, tempo);
    }
}
