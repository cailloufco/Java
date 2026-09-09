package AtividadeTratamentoDeErros.q3;

import java.util.Scanner;

public class q3 {
    static void main() {
        Scanner ler = new Scanner(System.in);
        String idadeString;
        int idadeInt;
        try {
            System.out.print("Digite sua idade: ");
            idadeString = ler.nextLine();

            idadeInt = Integer.parseInt(idadeString);
            System.out.println("Idade cadastrada: "+ idadeInt);
        }catch(NumberFormatException e){
            System.out.println("Entrada inválida ! Digite apenas numeros.");
        }

    }

}
