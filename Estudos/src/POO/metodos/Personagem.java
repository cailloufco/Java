package POO.metodos;

public class Personagem {
    String nome;
    int level;
    String classe;
    Atributos atributo;

    public Personagem(String nome, int level, String classe, Atributos atributo) {
        this.nome = nome;
        this.level = level;
        this.classe = classe;
        this.atributo = atributo;
    }

    public void exibirPersonagem(){
        System.out.printf("Nome: %s ; lvl: %d ; Classe: %s ; ", nome , level , classe);
    }




    public void atacar(String alvo) {
        if (atributo.magia > atributo.forca) {
            System.out.print(nome + " ATACOU O " + alvo + " !!!\nCAUSOU : " + (atributo.magia * 1.3) + " DANO !");
        }else {
            System.out.print(nome + " ATACOU O " + alvo + " !!!\nCAUSOU : " + (atributo.forca * 1.1) + " DANO !");
        }
    }
}
