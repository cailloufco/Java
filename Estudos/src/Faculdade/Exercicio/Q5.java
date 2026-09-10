package Faculdade.Exercicio;

import java.util.Scanner;

public class Q5 {

    static void main(){

        Scanner recebe = new Scanner(System.in);

        System.out.println("Digite seu login: ");
        String login = recebe.next();
        System.out.println("Digite sua Senha: ");
        String senha = recebe.next();

        if(login.equals("admin") && senha.equals("1234")){

            System.out.println("Login bem-sucedido!!!!");

        }
        else {
            System.out.println("Usuario ou senha incorretos!!!!");
        }

    }

}
