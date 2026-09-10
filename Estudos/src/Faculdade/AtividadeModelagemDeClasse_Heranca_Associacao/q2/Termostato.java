package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q2;

public class Termostato {
    private int tempDesejada;
    private int tempAtual;
    private String modo; //Resfriar , Aquecer ou Desligado.

    public int getTempDesejada() {
        return tempDesejada;
    }

    public void setTempDesejada(int tempDesejada) {
        this.tempDesejada = tempDesejada;
    }

    public int getTempAtual() {
        return tempAtual;
    }

    public void setTempAtual(int tempAtual) {
        this.tempAtual = tempAtual;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public void definirTemperatura(int temperaturaDesejada) {
        if (temperaturaDesejada >= 16 && temperaturaDesejada <= 30) {
            this.tempDesejada = temperaturaDesejada;
            System.out.println("Temperatura Atual: " + tempAtual);

            while (true) {
                if (tempAtual >= 16 && tempAtual <= 30) {
                    alterarModo("Desligado");
                    executarCiclo();
                    break;
                } else if (tempAtual > 30) {
                    while (tempAtual != temperaturaDesejada) {
                        tempAtual--;
                        System.out.println("RESFRIANDO: " + tempAtual + "°C");
                    }
                    executarCiclo();
                    break;
                } else if (tempAtual < 16) {
                    while (tempAtual != temperaturaDesejada) {
                        tempAtual++;
                        System.out.println("AQUECENDO: " + tempAtual + "°C");
                    }
                    executarCiclo();
                    break;
                }
            }
        } else {
            System.out.println("A Temperatura Desejada precisa estar em um intervalo seguro de 16°C e 30°C");
        }
    }

    private void alterarModo(String novoModo) {
        setModo(novoModo);
    }

    private void executarCiclo() {
        if (tempAtual >= 16 && tempAtual <= 30) {
            alterarModo("Desligado");
            System.out.println("A temperatura esta dentro do intervalo seguro de 16°C e 30°C");
        } else if (tempAtual > 30) {
            alterarModo("Resfriar");

        } else if (tempAtual < 16) {
            alterarModo("Aquecer");

        }
    }


    @Override
    public String toString() {
        return "Termostato{" +
                "tempDesejada=" + tempDesejada +
                ", tempAtual=" + tempAtual +
                ", modo='" + modo + '\'' +
                '}';
    }
}