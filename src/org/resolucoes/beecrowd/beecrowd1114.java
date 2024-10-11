package org.resolucoes.beecrowd;

import java.util.Scanner;

public class beecrowd1114 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int senhaValida;

        do {
            System.out.println("--------------------------DIGITE A SENHA-----------------------------");
            senhaValida = teclado.nextInt();
                if(senhaValida != 2002) {
                    System.out.println("Senha invalida");
                } else {
                    System.out.println("Acesso Permitido");
                }
        } while (senhaValida != 2002);

        teclado.close();
    }
}
