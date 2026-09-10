package Estudos_em_Casa.POO.getEsetter;

public class Carro {

    private double velocidadeMax;
    private double gasolina = 5;
    private String modeloDoCarro;

    public void abastecer(double quantidadeGasolina){
        if (quantidadeGasolina <= 0){
            System.out.println("Quantidade inválida , tente novamente!");
        }else{
            gasolina += quantidadeGasolina;
        }
    }

    public double exibirGasolina(){
        return gasolina;
    }

    public void setModeloDoCarro(String modeloDoCarro){
        this.modeloDoCarro = modeloDoCarro;
    }
    public String getModeloDoCarro(){
        return modeloDoCarro;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public void InspencionarCarro(){
        System.out.println("MODELO DO CARRO: "+getModeloDoCarro());
        System.out.println("VELOCIDADE MAX: "+getVelocidadeMax());
        System.out.println("QUANTIDADE DE GASOLINA: "+exibirGasolina());

    }


}
