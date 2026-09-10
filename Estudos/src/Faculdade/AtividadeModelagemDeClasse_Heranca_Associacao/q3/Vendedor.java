package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q3;

public class Vendedor extends Funcionario{

    public Vendedor(String nome, String cpf, Double salarioBase, Double aliquotaBonus, int totalVendas) {
        super(nome, cpf, salarioBase, aliquotaBonus, totalVendas);
    }


    @Override
    public Double calcularSalario() {
        return super.getSalarioBase() + ((double) super.getTotalVendas() * 0.01);
    }
}
