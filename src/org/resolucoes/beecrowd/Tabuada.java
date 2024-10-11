package org.resolucoes.beecrowd;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner tabuada = new Scanner(System.in);

        int i = 0;
        int numeroEscolhido;
        int quantNumeros = 11;

        System.out.println("Digite o numero para gerar a tabuada ");
        numeroEscolhido = tabuada.nextInt();


        if (numeroEscolhido > 0) {
            while (i < quantNumeros) {
                System.out.println("Tabuada do " + numeroEscolhido + " é : " + i + " x " + numeroEscolhido + " = " + i * numeroEscolhido);
                i++;
            }
        } else {
            System.out.println("Numero invalido");
        }

    }
}
