package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q7;

import java.util.Scanner;

public class App {
    public static void main(){
        LampadaInteligente lampada = new LampadaInteligente();
        Scanner ler = new Scanner(System.in);
        while(true){
            System.out.println("[ 1 ] Ligar Lâmpada");
            System.out.println("[ 2 ] Desligar Lâmpada");
            System.out.println("[ 3 ] Alterer Intensidade da Lâmpada");
            System.out.println("[ 4 ] Alterer Cor da Lâmpada");
            System.out.println("[ 0 ] Encerrar sistema");
            System.out.print("-> ");
            int op = ler.nextInt();


            if (op == 1){
                lampada.ligar();
            } else if (op == 2) {
                lampada.desligar();
            } else if (op == 3) {
                System.out.println("Digite a intensidade da Lâmpada [ 0 - 100 ]");
                System.out.print("-> ");
                int intensidade = ler.nextInt();
                lampada.ajustarIntensidade(intensidade);
            } else if (op == 4) {
                System.out.println("Digite nova cor da Lâmpada");
                System.out.print("-> ");
                String novaCor = ler.next();
                System.out.print("");
                lampada.mudarCor(novaCor);
            } else if (op == 0) {
                break;
            }


        }
    }
}
