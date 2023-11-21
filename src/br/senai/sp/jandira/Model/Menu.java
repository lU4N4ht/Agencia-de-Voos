package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    List<Voo> voos = new ArrayList<>();
    List<Passageiro> passageiros = new ArrayList<>();
    Passageiro passageiro = new Passageiro();
    boolean exit = true;

    public void menuChoice() {

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
                    cadastrarVoos();
                    break;
                case 2:
                    consultarVoos(voos);
                    break;
                case 3:
                    listarPassageiros();
                    break;

                case 4:
                  adicionarPassageiros(passageiro);

                case 5:
                    exit = true;
                    break;
            }
        }
    }

    public void consultarVoos(List<Voo> voos) {

        for (Voo voo : voos) {
            System.out.println("Número do Voo: " + voo.getNumeroVoo());
            System.out.println("Origem: " + voo.getOrigemVoo());
            System.out.println("Destino: " + voo.getDestinoVoo());
//            System.out.println("Data e horário de partida: " + voo.getTempoDoVoo());
            System.out.println("Lotação: " + voo.getLotacao());
            System.out.println(" ");
        }
    }

    public void cadastrarVoos() {

        Gol voo1 = new Gol(1, 572, "Jandira, São Paulo", "São João de Meriti, Rio de Janeiro");
        voos.add(voo1);

        Decolar voo2 = new Decolar(2, 489, "Carapicuíba, São Paulo", "Recife, Pernambuco");
        voos.add(voo2);

        CVC voo3 = new CVC(3, 298, "Osasco, São Paulo", "São Vicente de Fora, Lisboa");
        voos.add(voo3);

    }
    public void listarPassageiros(){
        for (Passageiro passageiro: passageiros){
            System.out.println("Nome do passageiro: " + passageiro.getNome());
            System.out.println("CPF do passageiro: " + passageiro.getCpf());
            System.out.println("Endereço do passageiro: " + passageiro.getEndereco());
            System.out.println("RG do passageiro: " + passageiro.getRg());
            System.out.println("Telefone do passageiro: " + passageiro.getTelefone());
        }
    }

    public void adicionarPassageiros(Passageiro passageiro){
        passageiros.add(passageiro);
    }


}

