package AtividadeTratamentoDeErros.q2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class q2 {

    static void main() {
        String[] nomes = new String[]{"Caio" , "Higor" , "Eric" , "Rodrigo" , "Jose"};
        Scanner ler = new Scanner(System.in);
        int pos;
        while (true) {
            try {
                System.out.println("Digite a posição desejada ( 0 a " + (nomes.length - 1) + " )");
                pos = ler.nextInt();

                System.out.println("ITEM DA POSIÇÃO DIGITADA : " + nomes[pos]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição inválida o array possui " + nomes.length + " posições ( 0 a " + (nomes.length - 1) + " )");
            }
        }
    }

}
