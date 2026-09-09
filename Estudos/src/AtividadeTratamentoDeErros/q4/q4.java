package AtividadeTratamentoDeErros.q4;

import java.util.Scanner;

public class q4 {
    //Escreva um programa que leia dois textos do teclado, converta ambos para números inteiros e
    //exiba o resultado da divisão entre eles. Requisitos:
    //Use dois blocos catch distintos: um para erro de conversão (entrada não numérica) e
    //outro para divisão por zero. • Cada catch deve exibir uma mensagem específica para o problema correspondente.

    static void main() {
        Scanner ler = new Scanner(System.in);
        String num1String;
        String num2String;
        int num1Int;
        int num2Int;
        while (true){
            try {
                System.out.print("Digite o dividendo: ");
                num1String = ler.nextLine();
                System.out.print("Digite o divisor: ");
                num2String = ler.nextLine();

                num1Int = Integer.parseInt(num1String);
                num2Int = Integer.parseInt(num2String);

                System.out.println("RESULTADO DE " + num1Int + " / " + num2Int +" = "+ (num1Int / num2Int));

            }catch(NumberFormatException e){
                System.out.println("Entrada inválida ! Digite apenas numeros...");
            } catch (ArithmeticException e) {
                System.out.println("Impossivel realizar divisão por zero...");
            }
        }
    }
}
