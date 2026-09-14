package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q5;

public class Gato extends Animal{
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void mover() {
        System.out.println("O gato andou no teclado");
    }
}
