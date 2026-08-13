package ExercicioFaculdade;



import java.util.Scanner;

public class calculadoraSimples {
    static void main(){
        Scanner ler = new Scanner(System.in);

        System.out.println("==== CALCULADORA SIMPLES ====");
        System.out.println("DIGITE DOIS NUMEROS: ");
        float num1 = ler.nextFloat();
        float num2 = ler.nextFloat();

        System.out.print("""
                QUAL OPERAÇÃO MATEMATICA DESEJA REALIZAR?
                [1] + 
                [2] -
                [3] /
                [4] *
                """);
        int op = ler.nextInt();

        switch (op){
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " : " + num2 + " = " + (num1 / num2));
                break;
            case 4:
                System.out.println(num1 + " X " + num2 + " = " + (num1 * num2));
                break;
        }


    }







}
