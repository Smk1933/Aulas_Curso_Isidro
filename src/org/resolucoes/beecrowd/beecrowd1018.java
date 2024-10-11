package org.resolucoes.beecrowd;

import java.util.Scanner;

public class beecrowd1018 {
    public static void main(String[] args) {

        int q100,q50,q20,q10,q5,q2,q1;
        int valor,resto;


        Scanner caixaEletronico = new Scanner(System.in);

        System.out.println("Digite o valor de saque ");
        valor = caixaEletronico.nextInt();

        q100 = valor / 100;
        resto = valor % 100;

        q50 = resto / 50;
        resto = resto % 50;

        q20 = resto / 20;
        resto = resto % 20;

        q10 = resto / 10;
        resto = resto % 10;

        q5 = resto / 5;
        resto = resto % 5;

        q2 = resto / 2;
        resto = resto % 2;

        q1 = resto;

        System.out.println( q100 + " nota(s) de R$ 100,00 ");
        System.out.println( q50 + " nota(s) de R$ 50,00 ");
        System.out.println( q20 + " Nota(s) de R$ 20,00 ");
        System.out.println( q10 + " nota(s) de R$ 10,00 ");
        System.out.println( q5 + " nota(s) de R$ 5,00 ");
        System.out.println( q2 + " nota(s) de R$ 2,00 ");
        System.out.println( q1 + " nota(s) de R$ 1,00 ");


        caixaEletronico.close();
    }

}

