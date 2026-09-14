package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q5;

public class App {
    static void main() {
        Animal dog = new Cachorro("Radhan" , 4);
        dog.emitirSom();
        dog.mover();

        System.out.println("\n\n");

        Animal gatin = new Gato("Milicent" , 2);
        gatin.emitirSom();
        gatin.mover();
    }
}
