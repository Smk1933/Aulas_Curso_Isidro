package org.resolucoes.beecrowd;
import java.util.Scanner;

public class beecrowd1073 {
    public static void main (String [] args){

        Scanner teclado = new Scanner(System.in);

        int N;
        int resultado = 0;

        System.out.println("Digite um numero");

        N = teclado.nextInt();

        for (int i = 1; i <= N; i++) {
            resultado = i * i;
            if (i % 2 == 0) {
            System.out.println(i + "*" + i + "=" + resultado);
            }
        }

        teclado.close();
    }
}
