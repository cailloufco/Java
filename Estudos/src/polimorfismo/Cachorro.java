package polimorfismo;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au Au , Caralho");
    }

    @Override
    public void comer() {
        System.out.println("Me da comida de cachorro");
    }
}
