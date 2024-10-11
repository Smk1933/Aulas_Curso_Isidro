package org.resolucoes.beecrowd;

import java.util.Scanner;

public class beecrowd1142 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int N;
        N = teclado.nextInt();
        int x = 1;


        for (int i = 0; i < N; i++) {
            System.out.println(x +" "+ (x+1) +" "+  (x+2) +" "+ "PUM");
            x += 4;


        }







        teclado.close();
    }
}
