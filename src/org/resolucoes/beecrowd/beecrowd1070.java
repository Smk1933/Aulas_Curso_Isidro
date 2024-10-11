package org.resolucoes.beecrowd;
import java.util.Scanner;

public class beecrowd1070 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int X;
        System.out.println("Digite um numero");
        X = teclado.nextInt();

        for (int i = 0; i < 6; i++) {
            if (X > 0 && X % 2 == 1) {
                System.out.println(X);
                X += 2;

            } else {
                    System.out.println(++X);
                    X +=2;
                }


            }
        }
    }
