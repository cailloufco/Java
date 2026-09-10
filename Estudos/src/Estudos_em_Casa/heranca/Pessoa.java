package Estudos_em_Casa.heranca;

public class Pessoa {
    private String Nome;
    private Endereco endereco;
    private Contato contato;

    public Pessoa() {
    }

    public Pessoa(String nome, Endereco endereco, Contato contato) {
        Nome = nome;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + Nome + '\'' +
                ", endereco=" + endereco +
                ", contato=" + contato +
                '}';
    }
}
