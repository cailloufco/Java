package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q5;

public class Animal {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public void emitirSom(){
        System.out.println("som qualquer");
    }
    public void mover(){
        System.out.println("se moveu");
    }
}
