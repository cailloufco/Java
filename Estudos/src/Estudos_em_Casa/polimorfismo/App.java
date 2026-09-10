package Estudos_em_Casa.polimorfismo;

public class App {
    static void main(){
        BixoPreguica bg = new BixoPreguica();
        bg.emitirSom();
        bg.comer();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
        Cachorro c = new Cachorro();
        c.emitirSom();
        c.comer();
    }

}
