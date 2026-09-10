package Faculdade.Exercicio;

import java.util.Scanner;

public class Q6 {

    static void main(){

        Scanner recebe = new Scanner(System.in);

        System.out.println("Digite o tipo de combustivel(A-Alcool / G-Gasolina): ");
        String tipo = recebe.next();
        System.out.println("Digite a quantidade de litros: ");
        double quant = recebe.nextDouble();

        if (tipo.equals("A")){

            double preco = 4 * quant;
            System.out.println("O preço a ser pago pelos " + quant + " litros de Álcool é: R$" + preco + ".");

        } else if (tipo.equals("G")) {

            double preco = 5.5 * quant;
            System.out.println("O preço a ser pago pelos " + quant + " litros de Gasolina é: R$" + preco + ".");

        }
        else {
            System.out.println("Números inválidos!!!");
        }

    }

}
