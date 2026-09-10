package Faculdade.AtividadeTratamentoDeErros.q9;

public class CarrinhoDeCompras {

    public void adicionarItem(String nome, int quantidade, double preco) {
        if (quantidade <= 0) {
            throw new QuantidadeInvalidaException("QUANTIDADE INVÁLIDA\n QUANTIDADE INFORMADA: " + quantidade);
        }
        if (preco < 0) {
            throw new PrecoInvalidoException("PREÇO INVÁLIDO\n PREÇO INFORMADO: " + preco);
        }
        System.out.println("ITEM ADICIONADO COM SUCESSO");
        System.out.println(" NOME: " + nome);
        System.out.println(" QUANTIDADE: " + quantidade);
        System.out.println(" PREÇO: R$" + preco);
    }
}
