package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q5;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro se moveu");
    }
}
