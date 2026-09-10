package Estudos_em_Casa.polimorfismo;

public class BixoPreguica extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("preguiça....");
    }

    @Override
    public void comer() {
        System.out.println("pregui....");
    }
}
