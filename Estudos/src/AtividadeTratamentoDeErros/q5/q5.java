package AtividadeTratamentoDeErros.q5;

import java.util.Scanner;

public class q5 {

    static void main() {
        Scanner ler = new Scanner(System.in);
        String numString;
        int numInt;
        try {
            System.out.println("Abrindo arquivo...");

            System.out.print("Forneça um número: ");
            numString = ler.nextLine();
            numInt = Integer.parseInt(numString);

        }catch (NumberFormatException e){
            System.out.println("Forneça apenas números!!!");
        }finally {
            System.out.println("Fechando arquivo...");
        }
    }
}
