package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q1;

public class contaPoupanca extends ContaBancaria{
    private double taxaDeRendimento = 1.5;

    public contaPoupanca(String cliente, String agencia, double saldo) {
        super(cliente, agencia, saldo);

    }

    public void aplicarRendimento(){
        double valor = getSaldo();
        valor += valor * (taxaDeRendimento / 100);

        setSaldo(valor);
        System.out.println("VALOR APOS TAXA DE RENDIMENTO DE 1,5% : "+ getSaldo());
    }
}
