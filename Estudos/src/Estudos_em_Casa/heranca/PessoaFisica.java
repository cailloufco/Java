package Estudos_em_Casa.heranca;

public class PessoaFisica extends Pessoa {

    private String cpf;



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                "} " + super.toString();
    }
}
