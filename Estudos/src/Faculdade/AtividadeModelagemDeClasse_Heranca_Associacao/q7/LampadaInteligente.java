package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q7;

public class LampadaInteligente {
    private String cor;
    private int intensidade;
    private boolean ligada;


    // métodos

    public void ligar(){
        this.ligada = true;
        System.out.println("Lâmpada Ligada");
    }
    public void desligar(){
        this.ligada = false;
    }

    public void ajustarIntensidade(int valorIntensidade){
        if ((valorIntensidade >= 0 && valorIntensidade <= 100) && this.ligada){
            this.intensidade = valorIntensidade;
            System.out.println("Intensidade da Lâmpada foi ajustada para: "+valorIntensidade);
        }else if(!this.ligada){
            System.out.println("Impossível definir intensidade da lâmpada com ela desligada. Ligue-a e tente novamente.");
        }else{
            System.out.println("Valor de intensidade inválido");
        }
    }
    public void mudarCor(String novaCor){
        if(this.ligada){
            this.cor = novaCor;
            System.out.println("Cor da Lâmpada foi alterada para: "+ novaCor);
        }else{
            System.out.println("Impossível definir cor da lâmpada com ela desligada. Ligue-a e tente novamente.");
        }
    }



    // ---------------


}
