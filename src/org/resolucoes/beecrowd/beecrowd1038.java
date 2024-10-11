package org.resolucoes.beecrowd;
import java.util.Scanner;

public class beecrowd1038 {
    public static void main(String[] args) {

        double codigo,numeroLanches;
        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite codigo do lanche (1 - 5) e o numero de lanches ");

        codigo = teclado.nextInt();
        numeroLanches = teclado.nextInt();

        if (codigo == 1){
            System.out.printf("Total: R$ %.2f", 4 * numeroLanches);
        }
        else if (codigo == 2){
            System.out.printf("Total: R$ %.2f", 4.50 * numeroLanches);
        }
        else if (codigo == 3){
            System.out.printf("Total: R$ %.2f", 5 * numeroLanches);
        }
        else if (codigo == 4){
            System.out.printf("Total: R$ %.2f", 2 * numeroLanches);
        }
        else if (codigo == 5){
            System.out.printf("Total: R$ %.2f", 1.5 * numeroLanches);
        }
        else {
            System.out.println("Opção invalida");
        }

        teclado.close();
    }
}
