package classe.DeHigor;

public class ContaBancaria {

    String agencia;
    String numeroDaConta;
    Double saldo;
    String tipoDeConta;
    Cliente cliente;

    public void depositar(Double valorDeposito){

        saldo += valorDeposito;

    }


//    public void exibirDetalhes(){
//
//        System.out.println("Agência: " + agencia);
//        System.out.println("Número da conta: " + numeroDaConta);
//        System.out.println("Titular: " + cliente.titular);
//        System.out.println("CPF: " + cliente.cpf);
//        System.out.println("RG: " + cliente.rg);
//        System.out.println("Rua: " + cliente.endereco.rua);
//        System.out.println("Número: " + cliente.endereco.numeroDaCasa);
//        System.out.println("Bairro: " + cliente.endereco.bairro);
//        System.out.println("Cidade: " + cliente.endereco.cidade);
//        System.out.println("Estado: " + cliente.endereco.estado);
//        System.out.println("CEP: " + cliente.endereco.cep);
//        System.out.println("Telefone: " + cliente.contato.telefone);
//        System.out.println("Email:" + cliente.contato.email);
//        System.out.printf("Saldo: R$ %.2f\n", saldo);
//        System.out.println("Tipo de conta: " + tipoDeConta);
//
//    }


    @Override
    public String toString() {
        return "Dados Bancarios" +
                "\nAgencia: " + agencia + '\n' +
                "Numero Da Conta: " + numeroDaConta + '\n' +
                "Saldo: " + saldo +'\n' +
                "Tipo De Conta: " + tipoDeConta + '\n' +
                cliente + '\n'
                ;
    }
}
