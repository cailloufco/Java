package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q9;

public class Produto {
    private String nome;
    private Double preco;



    // constructor

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    // -------------

    // get e sett

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


    // -----------


}
