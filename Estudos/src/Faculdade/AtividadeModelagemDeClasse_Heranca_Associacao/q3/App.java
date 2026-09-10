package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q3;

public class App {
    static void main() {

        Funcionario gerente = new Gerente("gerente1" , "cpfai ó" , 5000.0 , 20.0 , 2000);
        Funcionario vendedor1 = new Vendedor("vende1" , "cpfai ó" , 1670.0 , 20.0 , 550);
        Funcionario vendedor2 = new Vendedor("vende2" , "cpfai ó" , 2320.4 , 20.0 , 1450);


        System.out.println(gerente.calcularSalario());
        System.out.println(vendedor1.calcularSalario());
        System.out.println(vendedor2.calcularSalario());


    }
}
