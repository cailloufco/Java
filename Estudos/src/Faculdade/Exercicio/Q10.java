package Faculdade.Exercicio;

import java.util.Scanner;

public class Q10 {
    static void main(){
        Scanner ler = new Scanner(System.in);

        boolean temMaiuscula = false;
        boolean temNumero = false;

        System.out.println("VALIDADOR DE SENHAS");
        String senha = ler.next();

        System.out.println(senha.length());
        if (senha.length() >= 8) {
            for (char letra : senha.toCharArray()) {
                if (Character.isUpperCase(letra)) {
                    temMaiuscula = true;
                    break;
                }
            }
            for (char numero : senha.toCharArray()){
                if (Character.isDigit(numero)){
                    temNumero = true;
                    break;
                }
            }
            if (temMaiuscula == true && temNumero == true){
                System.out.println("A SENHA: "+ senha + " É VÁLIDA! ");
            } else if (temMaiuscula== true && temNumero == false) {
                System.out.println("SENHA NAO CONTEM AO MENOS UM NUMERO");
            } else if (temMaiuscula == false && temNumero == true) {
                System.out.println("SENHA NAO CONTEM AO MENOS UMA LETRA MAIUSCULA");
            } else {
                System.out.println("SENHA INVÁLIDA");
            }
        }else {
            System.out.println("SENHA COM TAMANHO MENOR QUE 8 CARACTERES");
        }
    }
}
