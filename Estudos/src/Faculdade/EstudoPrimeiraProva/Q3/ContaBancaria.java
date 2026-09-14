package Faculdade.EstudoPrimeiraProva.Q3;

public class ContaBancaria {
    private String titular;
    private Double saldo;
    private int numeroDaConta;

    //constructor;

    public ContaBancaria(int numeroDaConta, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = 100.0;
    }

    // -----------

    // metodo;

    public void depositar(Double valorDep){
        if (valorDep > 0) {
            this.saldo += valorDep;
            System.out.println("valor depositado: " + valorDep);
        }else{
            System.out.println("impossivel depositar o valor de: " + valorDep);
        }
        System.out.println("saldo atual:" + this.saldo);
    }
    public void sacar(Double valorSaque){
        if(valorSaque > this.saldo || valorSaque <= 0){
            System.out.println("impossivel sacar o valor de: " + valorSaque);
        }else{
            this.saldo -= valorSaque;
            System.out.println("valor sacado: "+valorSaque);
        }
        System.out.println("saldo atual: "+this.saldo);
    }


    // -----------




}
