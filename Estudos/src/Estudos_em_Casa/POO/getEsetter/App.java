package Estudos_em_Casa.POO.getEsetter;

import java.util.Scanner;

public class App {

    static void main() {
        Scanner ler = new Scanner(System.in);


        Carro carro = new Carro();
        carro.setModeloDoCarro("FIAT UNO");
        carro.setVelocidadeMax(120);

        System.out.println("Você deseja abastecer seu carro? ( GASOLINA ATUAL: " + carro.exibirGasolina() + " L )");
        System.out.println("[ S / N ]");
        String op = ler.next();
        if (op.equals("S")){
            System.out.println("Quantos litros deseja abastecer?");
            double quantidadeLitros = ler.nextDouble();

            carro.abastecer(quantidadeLitros);
        }


        carro.InspencionarCarro();





    }



}
