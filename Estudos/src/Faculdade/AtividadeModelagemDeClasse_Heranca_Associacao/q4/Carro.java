package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q4;

import java.util.Scanner;

public class Carro {
    private Motorista motorista;
    private String modelo;
    private String placa;
    private boolean ligado = false;

    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public void atribuirMotorista(Motorista motorista){
        String nome;
        String cnh;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do motorista : ");
        nome = ler.nextLine();
        System.out.print("Digite a CNH do motorista : ");
        cnh = ler.nextLine();


        motorista.setNome(nome);
        motorista.setCnh(cnh);


        this.motorista = motorista;
        ligado = true;
    }

    public void ligar(){
        if (ligado){
            System.out.println("Carro ligado pois há motorista atribuido ao veiculo");
        }else{
            System.out.println("não foi possivel ligar o carro pois não há motorista atribuido ao veiculo");
        }
    }


    @Override
    public String toString() {
        return "Carro{" +
                "motorista=" + motorista +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", ligado=" + ligado +
                '}';
    }
}
