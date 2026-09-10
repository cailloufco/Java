package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q1;

public class ContaBancaria {
    private String cliente;
    private String agencia;
    private double saldo;


    public ContaBancaria(String cliente, String agencia, double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.saldo = saldo;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }





    public void saque(double valorSaque){
        if (valorSaque <= 0 || valorSaque > saldo){
            System.out.println("VALOR DE SAQUE INVÁLIDO , VALOR INFORMADO: "+ valorSaque+"\nSALDO DISPONIVEL: "+ saldo);
        }else{
            setSaldo( getSaldo() - valorSaque);
            System.out.println("SAQUE REALIZADO COM SUCESSO, VALOR: " +valorSaque + "\nSALDO ATUAL : "+ getSaldo());
        }
    }

    public void deposito(double valorDepositado){
        if(valorDepositado <= 0){
            System.out.println("VALOR DE DEPOSITO INVÁLIDO , VALOR INFORMADO: " + valorDepositado);
        }else {
            setSaldo(getSaldo() + valorDepositado);
            System.out.println("DEPOSITO REALIZADO COM SUCESSO \nSALDO ATUAL : "+ getSaldo());
        }
    }
}

