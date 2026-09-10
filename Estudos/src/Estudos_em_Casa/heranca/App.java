package Estudos_em_Casa.heranca;

public class App {

    static void main() {
        PessoaJuridica pj = new PessoaJuridica();


        pj.setEndereco(new Endereco("Bom Jesus" , "Rua Firmino Tomas"));
        pj.setNome("Caio");
        pj.setCnpj("123456789123");
        pj.setContato(new Contato("83999660933" , "caioextreme000@gmail.com"));

        PessoaFisica pf = new PessoaFisica();

        pf.setEndereco(new Endereco("Good Jesus" , "Firmino Tomás Road's"));
        pf.setNome("Joseph");
        pf.setCpf("144.753.123-12");
        pf.setContato(new Contato("+1 2233445566" , "cailloufco@gmail.com"));

        System.out.println(pf);
        System.out.println(pj);


    }



}
