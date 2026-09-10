package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q1;

public class contaCorrente extends ContaBancaria{
    private double chequeEspecial;

    public contaCorrente(String cliente, String agencia, double saldo, double chequeEspecial) {
        super(cliente, agencia, saldo);
        this.chequeEspecial = chequeEspecial;

        setSaldo(getSaldo() + chequeEspecial);
        System.out.println("SALDO ATUAL COM O CHEQUE ESPECIAL DE " + "$" + chequeEspecial + "\nSALDO ATUAL: " + getSaldo());

    }

}
