package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q6;

public class App {
    static void main() {
        Encomenda e1 = new Encomenda(6.0 , 300.0 , 5000.0);

        System.out.println("VALOR DO FRETE EXPRESSO : " + e1.calcularFreteExpresso());
        System.out.println("VALOR DO FRETE PADRAO : " + e1.calcularFretePadrao());





    }



}