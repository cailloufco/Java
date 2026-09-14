package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q9;

public class App {
    public static void main(){
        Cliente cliente = new Cliente("Caio" , "caio@gmail.com");
        Produto produto = new Produto("Caderno" , 4.99);
        Pedido pedido = new Pedido(cliente , produto , 2);


        pedido.processarPagamento(20.0);
    }
}
