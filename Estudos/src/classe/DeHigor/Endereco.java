package classe.DeHigor;

public class Endereco {

    String rua;
    String bairro;
    String numeroDaCasa;
    String cidade;
    String estado;
    String cep;

    @Override
    public String toString() {
        return "Dados de endereço do Cliente" +
                "\nRua: " + rua + '\n' +
                "Bairro: " + bairro + '\n' +
                "Numero da Residencia: " + numeroDaCasa + '\n' +
                "Cidade: " + cidade + '\n' +
                "Estado: " + estado + '\n' +
                "CEP: " + cep
                ;
    }
}
