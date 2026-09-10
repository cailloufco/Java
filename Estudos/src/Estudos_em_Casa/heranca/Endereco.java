package Estudos_em_Casa.heranca;

public class Endereco {
    private String Cidade;
    private String Rua;


    public Endereco(String cidade, String rua) {
        Cidade = cidade;
        Rua = rua;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String rua) {
        Rua = rua;
    }


    @Override
    public String toString() {
        return "Endereco{" +
                "Cidade='" + Cidade + '\'' +
                ", Rua='" + Rua + '\'' +
                '}';
    }
}
