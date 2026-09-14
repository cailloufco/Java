package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q8;

import java.util.Scanner;

public class App {
    public static void main(){
        Scanner ler = new Scanner(System.in);
        BombaCombustivel b1 = new BombaCombustivel("Disel" , 6.88 , 200.0);

        while (true){
            System.out.println("[ 1 ] Abastecer por Litros");
            System.out.println("[ 2 ] Abastecer por Valor");
            System.out.print("-> ");
            int op = ler.nextInt();
            if (op == 1){
                System.out.println("Quantos litros deseja abastecer? ");
                Double quantidadeDeLitros = ler.nextDouble();
                double valor = b1.abastecerPorLitro(quantidadeDeLitros);
                System.out.println("Valor a se pagar por  "+quantidadeDeLitros+"L : "+valor);
            } else if (op == 2) {
                System.out.println("Quantos reais de "+b1.getTipoCombustivel() +" deseja colocar?");
                Double valor = ler.nextDouble();
                double quantidadeCombustivel = b1.abastecerPorValor(valor);
                System.out.println("Quantidade de "+ b1.getTipoCombustivel() + " abastecida : "+ quantidadeCombustivel);
            }


        }
    }
}
