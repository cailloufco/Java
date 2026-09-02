package classe.DeHigor;

public class Cliente {


        
        String titular;
        String rg;
        String cpf;
        Contato contato;
        Endereco endereco;

        @Override
        public String toString() {
                return "Dados do cliente" +
                        "\nTitular: " + titular + '\n' +
                        "RG: " + rg + '\n' +
                        "CPF: " + cpf + '\n' +
                        contato + '\n' +
                        endereco +'\n'
                        ;
        }
}
