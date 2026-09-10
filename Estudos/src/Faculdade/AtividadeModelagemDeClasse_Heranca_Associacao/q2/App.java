package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q2;

import java.util.Scanner;

public class App {
    static void main() {
        Termostato termostato = new Termostato();
        Scanner ler = new Scanner(System.in);

        System.out.print("DIGA A TEMPERATURA ATUAL: ");
        int tempAtual = ler.nextInt();

        System.out.print("DIGA A TEMPERATURA DESEJADA: ");
        int tempDesejada = ler.nextInt();

        termostato.setTempAtual(tempAtual);
        termostato.definirTemperatura(tempDesejada);
        System.out.println("ar-condicionado: "+termostato.getModo());

    }
}
