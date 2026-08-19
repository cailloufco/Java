package Exercicio;

import java.util.Scanner;

public class Q8 {
    static void main(){
        Scanner ler = new Scanner(System.in);

        System.out.print("Quanto você ganha por HORA?: ");
        double valorHora = ler.nextDouble();
        System.out.print("Quantas horas por MES você trabalha?: ");
        double horasPMes = ler.nextInt();

        double salarioBruto = horasPMes * valorHora;
        double INSS = salarioBruto * ((double) 8 /100);
        double IR = salarioBruto * ((double) 11 /100);
        double SI = salarioBruto * ((double) 5 /100);
        double salarioLiquido = salarioBruto - INSS - IR - SI;


        System.out.println("+ Salário Bruto: R$"+ salarioBruto +
                "\n- IR (11%) : R$" + IR +
                "\n- INSS (8%) : R$" + INSS +
                "\n- Sindicato ( 5%) : R$ " + SI +
                "\n= Salário Líquido: R$"+ salarioLiquido);






    }
}
