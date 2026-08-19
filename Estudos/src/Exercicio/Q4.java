package Exercicio;

import java.util.Scanner;

public class Q4 {

    static void main(){

        Scanner recebe = new Scanner(System.in);

        System.out.println("Digite seu altura: ");
        float altura = recebe.nextFloat();
        System.out.println("Digite sua peso: ");
        float peso = recebe.nextFloat();
        float IMC = peso / (altura*altura);

        if (IMC < 18.5){

            System.out.println("Seu IMC é de: " + IMC + ".");
            System.out.println("Você está abaixo do peso");

        }
        else if (IMC >= 18.5 && IMC < 25) {

            System.out.println("Seu IMC é de: " + IMC + ".");
            System.out.println("Você está na faixa de peso normal.");

        }
        else if (IMC >= 25 && IMC < 30){

            System.out.println("Seu IMC é de: " + IMC + ".");
            System.out.println("Você está com Sobrepeso.");

        }
        else if (IMC >= 30){

            System.out.println("Seu IMC é de: " + IMC + ".");
            System.out.println("Você está com Obeso.");

        }
        else {
            System.out.println("Números inválidos.");
        }

    }

}
