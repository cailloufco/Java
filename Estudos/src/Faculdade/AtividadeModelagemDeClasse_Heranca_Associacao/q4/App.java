package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q4;

public class App {
    static void main() {
        Carro carro = new Carro("fiat uno" , "12312312");

        carro.ligar();


        Motorista motorista = new Motorista();
        Carro carro1 = new Carro("voyage" , "313213");
        carro1.atribuirMotorista(motorista);

        carro1.ligar();

        System.out.println(carro1);




    }


}
