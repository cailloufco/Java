package AtividadeTratamentoDeErros.q1;

import java.util.Scanner;

public class Q1 {
    static void main() {
        Scanner ler = new Scanner(System.in);
        int op;
        int num1;
        int num2;
        while (true){

            try {

                System.out.print("Digite o dividendo : ");
                num1 = ler.nextInt();
                System.out.print("Digite o divisor : ");
                num2 = ler.nextInt();

                System.out.println("RESULTADO DE " + num1 + " / " + num2 +" = "+ (num1 / num2));


            }catch(ArithmeticException e){
                System.out.println("Não é possivel dividir por ZERO...");
            }



        }

    }


}
