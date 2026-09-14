package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q6;

public class Encomenda {
    private Double pesoKg;
    private Double distanciaKm;
    private Double valorDeclarado;
    //Valor declado == valor do produto , talvez?


    public Encomenda(Double pesoKg, Double distanciaKm, Double valorDeclarado) {
        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
        this.valorDeclarado = valorDeclarado;
    }

    public double calcularFretePadrao(){
        return 5 * pesoKg + 0.50 * distanciaKm;
    }


    public double calcularFreteExpresso(){
        double valorFretePadrao = calcularFretePadrao();
        return valorFretePadrao + 30.0 + (valorFretePadrao * 0.01);
    }



}
