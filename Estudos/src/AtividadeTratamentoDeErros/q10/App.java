package AtividadeTratamentoDeErros.q10;

import java.util.Scanner;

public class App {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            try {
                System.out.println("===== CALCULADORA =====");
                System.out.println("1 - Somar");
                System.out.println("2 - Subtrair");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");
                System.out.println("5 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = Integer.parseInt(sc.nextLine());

                if (opcao == 5) {
                    System.out.println("Encerrando...");
                    break;
                }

                if (opcao < 1 || opcao > 5) {
                    System.out.println("OPÇÃO INVÁLIDA! Escolha entre 1 e 5.");
                    System.out.println();
                    continue;
                }

                System.out.print("Digite o primeiro número: ");
                double a = Double.parseDouble(sc.nextLine());

                System.out.print("Digite o segundo número: ");
                double b = Double.parseDouble(sc.nextLine());

                double resultado = 0;

                switch (opcao) {
                    case 1:
                        resultado = a + b;
                        System.out.println("RESULTADO: " + resultado);
                        break;
                    case 2:
                        resultado = a - b;
                        System.out.println("RESULTADO: " + resultado);
                        break;
                    case 3:
                        resultado = a * b;
                        System.out.println("RESULTADO: " + resultado);
                        break;
                    case 4:
                        if (b == 0) {
                            throw new DivisaoPorZeroException("NÃO É POSSÍVEL DIVIDIR POR ZERO");
                        }
                        resultado = a / b;
                        System.out.println("RESULTADO: " + resultado);
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("ENTRADA INVÁLIDA! Digite apenas números.");
            } catch (DivisaoPorZeroException e) {
                System.out.println("ERRO: " + e.getMessage());
            } finally {
                System.out.println("Operação concluída.");
                System.out.println();
            }
        }
    }
}
