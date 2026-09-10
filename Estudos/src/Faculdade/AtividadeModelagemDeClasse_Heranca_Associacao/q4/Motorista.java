package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q4;

public class Motorista{
    private String nome;
    private String cnh;

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Motorista{" +
                "nome='" + nome + '\'' +
                ", cnh='" + cnh + '\'' +
                '}';
    }


}
