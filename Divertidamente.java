package Divertidamente;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

import javax.swing.ProgressMonitorInputStream;

public class Divertidamente {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int tristeza = 0;
        int alegria = 0;

        System.out.println("Quantas amizades a Riley fez: ");
        int amigos = leitor.nextInt();

        if (amigos > 0) {
            alegria = amigos * 10;
            System.out.println("Riley fez amigos! alegria recebeu  " + alegria + "pontos");

            // CASO CONTRARIO (SE FOR 0 OU MENOS)

        } else {
            tristeza = 30;
            System.out.println("Riley esta trsite -__-");
            System.out.println("Tristeza recebeu: " + tristeza + " pontos.");
        }

        // Parte 2 Divertidamente
        System.out.println("Qual foi a nota da prova A1 ? ");
        int A1 = leitor.nextInt();

        System.out.println("Qual foi a nota da prova A2 ? ");
        int A2 = leitor.nextInt();

        System.out.println("Qual foi a nota da prova A2 ? ");
        int A3 = leitor.nextInt();

        int media = (int) (A1 + A2 + A3) / 3;

        if (media >= 7) {
            System.out.println("A nota da Riley foi " + media + " Então alegria ganhou " + (alegria += 50) + "Pontos");
            System.out
                    .println("A nota da Riley foi " + media + " Então tristeza ganhou " + (tristeza += 50) + "Pontos");

            // Parte 3 Divertidamente

            System.out.println("Quantos exercicios a Riley conseguiu fazer? ");
            int exercicio = leitor.nextInt();

            int naoFeitos = 10 - exercicio;

            alegria += exercicio * 10;
            tristeza += exercicio * 10;

            System.out.println("Alegria ganhou pontos pelso exercicios feitos " + (exercicio * 10));
            System.out.println("Tristeza ganhou pontos por não ter feito a atividade " + (naoFeitos * 10));

            System.out.println("Pontos totais da alegria " + alegria);
            System.out.println("\"Pontos totais da tristeza" + tristeza);

            if (alegria > tristeza) {
                System.out.println("A mudança para a nova cidade foi uma experiencia incrivel para a Riley ");

            } else {
                System.out.println("A mudança para a nava cidade foi um experinecia desagradavel para Riley");
            }

        }

    }

}
