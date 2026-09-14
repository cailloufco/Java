package Faculdade.EstudoPrimeiraProva.Q6;

public class Veiculo{
    private String marca;
    private String modelo;
    private int ano;

    // constructor

    public Veiculo(String marca , String modelo , int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // -----------

    // getter / setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    // ----------------

    // Métodos;

    public void exibirInformacoes(){
        System.out.println("MARCA: "+marca+"\nMODELO: "+modelo+"\nANO: "+ano);
    }

    // -----------


}
