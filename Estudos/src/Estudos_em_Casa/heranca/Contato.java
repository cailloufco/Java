package Estudos_em_Casa.heranca;

public class Contato {
    private String Telefone;
    private String Email;

    public Contato(String telefone, String email) {
        Telefone = telefone;
        Email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "Telefone='" + Telefone + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
