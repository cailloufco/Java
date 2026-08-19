package Exercicio;

import java.util.Scanner;

public class Q3 {

    static void main(){

        Scanner recebe = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num = recebe.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = recebe.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = recebe.nextInt();

        if (num>num2 && num>num3){

            System.out.println("O " + num + "é o maior entre eles.");

        }
        else if (num2>num && num2>num3) {

            System.out.println("O " + num2 + "é o maior entre eles.");

        }
        else if (num3>num && num3>num2){

            System.out.println("O " + num3 + "é o maior entre eles.");

        }
        else {
            System.out.println("Números inválidos.");
        }

    }
}
