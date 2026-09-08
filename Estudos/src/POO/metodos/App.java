package POO.metodos;

public class App {

    static void main() {
        Atributos p1Atributos = new Atributos(2600 , 256 , 734 , 360);
        Personagem p1 = new Personagem("FenixAlq" , 256 , "Alquimista" , p1Atributos);


        Atributos p2Atributos = new Atributos(10730 , 1200 , 529, 2366);
        Personagem p2 = new Personagem("Evokee" , 529 , "Guerreiro" , p2Atributos);

        p1.exibirPersonagem();
        System.out.println();
        p1Atributos.exibitStatus();

        p1.atacar("Banshee");
        System.out.println("\n\n");

        p2.exibirPersonagem();
        System.out.println();
        p2Atributos.exibitStatus();


        p2.atacar("Dragão Dourado");




    }
}
