package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q1;

public class App {

    static void main() {
        contaCorrente c1 = new contaCorrente("Caio" , "a1b12" , 1000 , 501);
        c1.saque(500);

        System.out.println("\n\n\n\n");

        contaPoupanca c2 = new contaPoupanca("aasdada" , "a1b12" , 2000);
        c2.saque(100);
        c2.aplicarRendimento();
    }

}
