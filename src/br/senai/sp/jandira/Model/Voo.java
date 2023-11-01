package br.senai.sp.jandira.Model;

import java.time.LocalDateTime;

abstract class Voo {
        int numeroVoo, lotacao;
        String origemVoo, destinoVoo;
        LocalDateTime tempoDoVoo;
        public Voo(int numeroVoo, int lotacao, String origem, String destino, LocalDateTime tempo){
                this.numeroVoo = numeroVoo;
                this.lotacao = lotacao;
                this.origemVoo = origem;
                this.destinoVoo = destino;
                this.tempoDoVoo = tempo;
        }

        public int getNumeroVoo() {
                return numeroVoo;
        }
        public int getLotacao() {
                return lotacao;
        }
        public String getOrigemVoo() {
                return origemVoo;
        }
        public String getDestinoVoo() {
                return destinoVoo;
        }
        public LocalDateTime getTempoDoVoo() {
                return tempoDoVoo;
        }
        public void setNumeroVoo(int numeroVoo) {
                this.numeroVoo = numeroVoo;
        }
        public void setLotacao(int lotacao) {
                this.lotacao = lotacao;
        }
        public void setOrigemVoo(String origemVoo) {
                this.origemVoo = origemVoo;
        }
        public void setDestinoVoo(String destinoVoo) {
                this.destinoVoo = destinoVoo;
        }
        public void setTempoDoVoo(LocalDateTime tempoDoVoo) {
                this.tempoDoVoo = tempoDoVoo;
        }




}
