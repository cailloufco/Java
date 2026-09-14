package Faculdade.EstudoPrimeiraProva.Q5;

public class Livro {
    String[] livros = new String[]{"python","java","solid","node" };

    public String procurarLivro(String livro) {
        for (String l : livros) {
            if (livro.equals(l)) {
                return livro;
            }
        }
        return null;
    }
}
