package AtividadeTratamentoDeErros.q6;

import java.util.Scanner;

public class q6 {
    static void main() {
        String algoEscrito = null;
        Scanner ler = new Scanner(System.in);
        try {
            System.out.println(algoEscrito.length());
        }catch (NullPointerException e){
            System.out.println("A variavel está vazia...");
        }
    }


}
