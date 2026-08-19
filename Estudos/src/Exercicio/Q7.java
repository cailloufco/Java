package Exercicio;

import java.util.Scanner;

public class Q7 {

    static void main(){

        Scanner recebe = new Scanner(System.in);

        System.out.println("Qual tabuada deseja conferir: ");
        int num = recebe.nextInt();

        for (int i = 1; i < 10; i++ ){

            System.out.println(num + " X " + i + " = " + (num*i));

        }

    }

}
