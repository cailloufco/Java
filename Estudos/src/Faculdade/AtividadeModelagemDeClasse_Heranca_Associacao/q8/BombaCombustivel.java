package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q8;

public class BombaCombustivel {
    private String tipoCombustivel;
    private Double valorLitro;
    private Double quantidadeCombustivelNaBomba;

    // constructor

    public BombaCombustivel(String tipoCombustivel, Double valorLitro, Double quantidadeCombustivelNaBomba) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivelNaBomba = quantidadeCombustivelNaBomba;
    }

    // ---------------

    //get e setter

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }


    // ---------------

    // métodos

    public Double abastecerPorLitro(Double quatidadeLitros){
        this.quantidadeCombustivelNaBomba -= quatidadeLitros;
        return quatidadeLitros * valorLitro;
    }
    public Double abastecerPorValor(Double valor){
        this.quantidadeCombustivelNaBomba -= valor / valorLitro;
        return valor / valorLitro;
    }

    // -----------------

}
