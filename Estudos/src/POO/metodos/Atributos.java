package POO.metodos;

public class Atributos {
    int vida;
    int forca;
    int magia;
    int defesa;

    public Atributos(int vida, int forca, int magia, int defesa) {
        this.vida = vida;
        this.forca = forca;
        this.magia = magia;
        this.defesa = defesa;
    }

    public void exibitStatus(){
        System.out.println("HP: "+vida);
        System.out.println("DEF: "+defesa);
        System.out.println("FORÇA: "+forca);
        System.out.println("MAGIA: "+ magia);
    };

}
