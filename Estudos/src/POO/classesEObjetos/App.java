package POO.classesEObjetos;

public class App {
    static void main() {
        Pessoa pessoaA = new Pessoa("Caio" , "1.65" , 18);

        System.out.println("nome: " + pessoaA.nome + ", altura: "+ pessoaA.altura + ", idade: "+pessoaA.idade);


        Pessoa pessoaB = new Pessoa();
        pessoaB.nome = "Jose";
        pessoaB.idade = 22;
        pessoaB.altura = "1.81";

        System.out.println("nome: " + pessoaB.nome + ", altura: "+ pessoaB.altura + ", idade: "+pessoaB.idade);


    }

}
