package Faculdade.Exercicio;

import java.util.Scanner;

public class Q1 {

    static void main(){

        Scanner recebe = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = recebe.next();
        System.out.println("Digite sua idade: ");
        int idade = recebe.nextInt();
        System.out.println("Seja bem vindo "+ nome +"! Você tem "+ idade+ " anos.");

    }

}
