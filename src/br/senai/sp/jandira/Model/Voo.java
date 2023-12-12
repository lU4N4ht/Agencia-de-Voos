package br.senai.sp.jandira.Model;

import java.time.LocalDate;
import java.time.LocalTime;

class Voo {
        private int numeroVoo, lotacao;
        private String origemVoo, destinoVoo;
        private LocalDate dataVoo;
        private LocalTime horaVoo;
        public Voo(int numeroVoo, int lotacao, String origem, String destino, LocalDate dataVoo, LocalTime horaVoo) {
                this.numeroVoo = numeroVoo;
                this.lotacao = lotacao;
                this.origemVoo = origem;
                this.destinoVoo = destino;
                this.dataVoo = dataVoo;
                this.horaVoo = horaVoo;
        }

        public int getNumeroVoo() {return numeroVoo;}
        public int getLotacao() {return lotacao;}
        public String getOrigemVoo() {return origemVoo;}
        public String getDestinoVoo() {return destinoVoo;}

        public LocalDate getDataVoo() {return dataVoo;}

        public LocalTime getHoraVoo() {return horaVoo;}

}
