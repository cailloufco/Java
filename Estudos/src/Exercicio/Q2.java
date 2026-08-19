
package Exercicio;

import java.util.Scanner;

public class Q2 {

    static void main(){

        Scanner recebe = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = recebe.nextInt();
        if(num % 2 == 0){

            System.out.println("O " + num + " é par." );

        }
        else {

            System.out.println("O " + num + " é impar.");
        }

    }

}
