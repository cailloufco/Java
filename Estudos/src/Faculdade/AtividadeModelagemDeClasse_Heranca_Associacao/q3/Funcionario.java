package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q3;

public class Funcionario {


    // Atributos
    private String nome;
    private String cpf;
    private Double salarioBase;
    private Double aliquotaBonus;
    private int totalVendas;
    // ---------

    //Constructor

    public Funcionario(String nome, String cpf, Double salarioBase, Double aliquotaBonus, int totalVendas) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.aliquotaBonus = aliquotaBonus;
        this.totalVendas = totalVendas;
    }
    //-----------



    //Get e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getAliquotaBonus() {
        return aliquotaBonus;
    }

    public void setAliquotaBonus(Double aliquotaBonus) {
        this.aliquotaBonus = aliquotaBonus;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }
    //----------



    // Metodos
    public Double calcularSalario(){
        return salarioBase + aliquotaBonus;
    }


}
