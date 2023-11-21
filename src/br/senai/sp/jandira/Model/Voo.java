package br.senai.sp.jandira.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Voo {
        Random random = new Random();
        private int numeroVoo, lotacao;
        private String origemVoo, destinoVoo;
//        private LocalDateTime tempoDoVoo = LocalDateTime.of(2023, random.nextInt(12), random.nextInt(31), random.nextInt(24), random.nextInt(60));
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
//        String formatDateTime = tempoDoVoo.format(format);


        List<Voo> voos = new ArrayList<>();
        public Voo(int numeroVoo, int lotacao, String origem, String destino){
                this.numeroVoo = numeroVoo;
                this.lotacao = lotacao;
                this.origemVoo = origem;
                this.destinoVoo = destino;
//                this.tempoDoVoo = tempo;
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
//        public LocalDateTime getTempoDoVoo() {
//                return tempoDoVoo;
//        }
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
//        public void setTempoDoVoo(LocalDateTime tempoDoVoo) {
//                this.tempoDoVoo = tempoDoVoo;
//        }


}
