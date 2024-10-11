package org.resolucoes.beecrowd;
import java.util.Scanner;

public class beecrowd1064 {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    double valor;
    int quantNumPares = 1;
    double valores = 0;
    double media = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um valor");
            valor = teclado.nextDouble();
            if ( valor > 0){
                System.out.println(quantNumPares + " valor(es) positivo");
                valores += valor;
                media = valores / quantNumPares;
                System.out.printf("A média é : %.2f\n", media);
                quantNumPares++;
            } else {
                System.out.println("Valor negativo");
            }
        }







    }
}
