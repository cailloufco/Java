package Faculdade.EstudoPrimeiraProva.Q6;

public class Carro extends Veiculo{
    private int numPortas;

    public Carro(String marca , String modelo , int ano , int numPortas){
        super(marca , modelo , ano);
        this.numPortas = numPortas;
    }

    public void exibirInformacoes(){
        System.out.println("MARCA: "+getMarca() +"\nMODELO: "+getModelo()+"\nANO: "+getAno()+"\nNUM PORTAS:" + numPortas);
    }

}
