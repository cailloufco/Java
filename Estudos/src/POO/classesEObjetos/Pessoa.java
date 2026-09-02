package POO.classesEObjetos;

public class Pessoa {
    String nome;
    int idade;
    String altura;

    public Pessoa(String nome, String altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public Pessoa() {
    }

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

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }



}
