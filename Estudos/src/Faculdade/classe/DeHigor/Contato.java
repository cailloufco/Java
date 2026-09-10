package Faculdade.classe.DeHigor;

public class Contato {

    String email;
    String telefone ;

    @Override
    public String toString() {
        return "Informações de Contato" +
                "\nemail: " + email + '\n' +
                "Telefone: " + telefone
                ;
    }
}
