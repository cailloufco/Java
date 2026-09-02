package classe.DeHigor;

public class App {

    static void main() {

        ContaBancaria contaDeChiquinho = new ContaBancaria();
        contaDeChiquinho.cliente = new Cliente();
        contaDeChiquinho.cliente.endereco = new Endereco();
        contaDeChiquinho.cliente.contato = new Contato();
        contaDeChiquinho.cliente.titular = "Caio";
        contaDeChiquinho.cliente.cpf = "146.658.774-15";
        contaDeChiquinho.cliente.rg = "5.123.000";
        contaDeChiquinho.cliente.contato.email = "Caio_ta_rezando@gmail.com";
        contaDeChiquinho.cliente.endereco.rua = "Rua Metade paraíba";
        contaDeChiquinho.cliente.endereco.numeroDaCasa = "616";
        contaDeChiquinho.cliente.endereco.bairro = "Metade Ceara";
        contaDeChiquinho.cliente.endereco.cidade = "Good Gsuis";
        contaDeChiquinho.cliente.endereco.estado = "PB/CE";
        contaDeChiquinho.cliente.endereco.cep = "58.930.000";
        contaDeChiquinho.cliente.contato.telefone = "+55(88) 99953-1343";
        contaDeChiquinho.tipoDeConta = "Poupança";
        contaDeChiquinho.saldo = 1500.50;
        contaDeChiquinho.agencia = "234-X";
        contaDeChiquinho.numeroDaConta = "1234-6";

        ContaBancaria contaDeRisadinha = new ContaBancaria();
        contaDeRisadinha.cliente = new Cliente();
        contaDeRisadinha.cliente.endereco = new Endereco();
        contaDeRisadinha.cliente.contato = new Contato();
        contaDeRisadinha.cliente.titular = "Rodrigo";
        contaDeRisadinha.cliente.cpf = "189.327.814-21";
        contaDeRisadinha.cliente.rg = "2.987.000";
        contaDeRisadinha.cliente.contato.email = "Risadinhaxoxo@gmail.com";
        contaDeRisadinha.cliente.endereco.rua = "Rua Lilia Cajazeirense";
        contaDeRisadinha.cliente.endereco.numeroDaCasa = "69";
        contaDeRisadinha.cliente.endereco.bairro = "Da Alegria";
        contaDeRisadinha.cliente.endereco.cidade = "Saint john of the river of the fish";
        contaDeRisadinha.cliente.endereco.estado = "PB";
        contaDeRisadinha.cliente.endereco.cep = "58.910.000";
        contaDeRisadinha.cliente.contato.telefone = "+55(83) 99120-9921";
        contaDeRisadinha.tipoDeConta = "Corrente";
        contaDeRisadinha.saldo = 5500.50;
        contaDeRisadinha.agencia = "234-X";
        contaDeRisadinha.numeroDaConta ="4321-9";

        System.out.println("Saldo inicial conta de Chiquinho: " + contaDeChiquinho.saldo);
        System.out.println("Saldo inicial conta de Risadinha: " + contaDeRisadinha.saldo);

        contaDeChiquinho.depositar(500.0);
        contaDeRisadinha.depositar(150.0);

        System.out.println(contaDeChiquinho);
        System.out.println("___________________________________");
        System.out.println(contaDeRisadinha);
        System.out.println("___________________________________");


    }

}
