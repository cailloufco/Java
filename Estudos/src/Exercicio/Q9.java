package Exercicio;

import java.util.Scanner;

public class Q9 {

    static void main(){

        Scanner ler = new Scanner(System.in);

        int numAnimaisCadastrados = 0;
        double menorPeso = 0;
        double maiorPeso = 0;


        int op = 1;
        while (op == 1){
            System.out.println("1. Cadastrar Peso \n2. Finalizar");
            System.out.print("---> ");
            op = ler.nextInt();

            if (op == 1){
                numAnimaisCadastrados ++;

                System.out.print("Digite o peso do animal [KG]: ");
                double peso = ler.nextDouble();
                if (menorPeso == 0 && maiorPeso == 0){
                    maiorPeso= peso;
                    menorPeso= peso;
                } else if (peso > maiorPeso) {
                    maiorPeso = peso;
                } else if (peso < menorPeso) {
                    menorPeso = peso;
                }
            }else {

                System.out.println("QUANTIDADE DE ANIMAIS CADASTRADOS: "+ numAnimaisCadastrados);
                System.out.println("ANIMAL COM MAIOR PESO: "+ maiorPeso);
                System.out.println("ANIMAL COM MENOR PESO: "+ menorPeso);
            }
        }

    }

}
