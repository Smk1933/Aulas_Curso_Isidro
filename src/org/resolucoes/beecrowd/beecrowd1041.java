package org.resolucoes.beecrowd;
import java.util.Scanner;

public class beecrowd1041 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite as coordenadas x e y");

        double x,y;

        x = teclado.nextDouble();
        y = teclado.nextDouble();


        if ( x > 0 && y > 0){
            System.out.println("Q1");
        } else if ( x < 0 && y > 0 ){
            System.out.println("Q2");
        } else if ( x < 0 && y < 0){
            System.out.println("Q3");
        } else if ( x > 0 & y < 0){
            System.out.println("Q4");
        } else if ( x == 0 && y == 0) {
            System.out.println("Origem");
        } else if ( x == 0 && y != 0){
            System.out.println("Eixo y");
        } else if ( x != 0 && y == 0){
            System.out.println("Eixo x");
        }


            teclado.close();
    }
}
