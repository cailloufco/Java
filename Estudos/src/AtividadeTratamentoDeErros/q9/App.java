package AtividadeTratamentoDeErros.q9;

public class App {
    static void main() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();


        try {
            carrinho.adicionarItem("Notebook", 2, 3500.0);
        } catch (QuantidadeInvalidaException e) {
            System.out.println("ERRO DE QUANTIDADE: " + e.getMessage());
        } catch (PrecoInvalidoException e) {
            System.out.println("ERRO DE PREÇO: " + e.getMessage());
        }

        System.out.println();


        try {
            carrinho.adicionarItem("Mouse", 0, 150.0);
        } catch (QuantidadeInvalidaException e) {
            System.out.println("ERRO DE QUANTIDADE: " + e.getMessage());
        } catch (PrecoInvalidoException e) {
            System.out.println("ERRO DE PREÇO: " + e.getMessage());
        }

        System.out.println();


        try {
            carrinho.adicionarItem("Teclado", 1, -50.0);
        } catch (QuantidadeInvalidaException e) {
            System.out.println("ERRO DE QUANTIDADE: " + e.getMessage());
        } catch (PrecoInvalidoException e) {
            System.out.println("ERRO DE PREÇO: " + e.getMessage());
        }
    }
}
