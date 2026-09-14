package Faculdade.AtividadeModelagemDeClasse_Heranca_Associacao.q9;

public class Pedido {
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private boolean pago;

    // Constructor

    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.pago = false;
    }


    // ---------------



    // get setter

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }


    // ---------


    // metodos

    public void processarPagamento(double valorRecebido){
        double totalPagar = quantidade * produto.getPreco();
        if (valorRecebido < totalPagar){
            System.out.println("O valor recebido não paga o que você quer comprar");
        } else if (valorRecebido > totalPagar) {
            System.out.println("total a pagar: "+ totalPagar);
            System.out.println("seu troco: " + (valorRecebido - totalPagar));
            setPago(true);
        }else {
            System.out.println("total a pagar: "+ totalPagar);
            setPago(true);
        }
    }

    // ---------

}
