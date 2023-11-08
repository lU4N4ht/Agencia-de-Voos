package br.senai.sp.jandira.Model;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Voo voos = new Voo(1, 1088, "São Paulo, São Paulo", "Bora Bora, Polinésia Francesa", 1200);
    boolean exit = false;
    public void menuChoice() {

        for (Voo voo: voos) {
            System.out.println("Número do Voo: " + voo.getNumeroVoo());
            System.out.println("Origem: " + voo.getOrigemVoo());
            System.out.println("Destino: " + voo.getDestinoVoo());
            System.out.println("Data e horário de partida: " + voo.getTempoDoVoo());
            System.out.println("Lotação: " + voo.getLotacao());
            System.out.println(" ");
        }




        while (!exit) {
            System.out.println("+______________________________________________________+");
            System.out.println("|                 SE JOGA LINHAS AÉREAS                |");
            System.out.println("+______________________________________________________+");
            System.out.println("| Escolha uma opção....................................| ");
            System.out.println("| 1 - Cadastrar Voos...................................|");
            System.out.println("| 2 - Constultar Voos..................................|");
            System.out.println("| 3 - Listar Passageiros...............................|");
            System.out.println("| 4 - Sair.............................................|");
            System.out.println("+______________________________________________________+");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:


                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 6:
                    exit = true;
                    break;
            }
        }
    }
}
