package Faculdade.AtividadeTratamentoDeErros.q8;

public class ContaBancaria {
    private double saldo;


    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double valorDoSaque){
        if (valorDoSaque <= 0 || valorDoSaque > saldo){
            throw new erroBancoException("VALOR DE SAQUE INVÁLIDO\n VALOR DE SAQUE INFORMADO : "+ valorDoSaque +"\n SALDO DISPONÍVEL : "+ saldo);
        }else{
            saldo -= valorDoSaque;
            System.out.println("SAQUE REALIZADO COM SUCESSO\n SALDO ATUAL: " + saldo +"$");
        }
    }

}
