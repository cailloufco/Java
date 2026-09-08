package POO.constructor;

import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Personagem p1 = new Personagem("Orsted" , "Guerreiro");
        Personagem p2 = new Personagem("Laplace", "Mago");

        while (true){
            System.out.println("QUAL PERSONAGEM DESEJA ACESSAR? : ");
            System.out.println("[ 1 ] " + p1.getNome() + "   LVL: "+ p1.getLvl());
            System.out.println("[ 2 ] " + p2.getNome() + "   LVL: "+ p2.getLvl());

            int op = ler.nextInt();

            if (op == 1) {
                while (true){
                    System.out.println("QUAL AÇÃO DESEJA TOMAR?: ");
                    System.out.println("[ 1 ] EXIBIR STATUS \n[ 2 ] SUBIR LVL \n [ 0 ] SAIR DO PERSONAGEM");
                    int op1 = ler.nextInt();
                    if (op1 == 0){
                        op = 0;
                        break;

                    } else if (op1 == 1) {
                        p1.exibirStatus();
                    } else if (op1 == 2) {
                        p1.subirlvl();
                    }

                }
            }
            if (op == 2) {
                while (true){
                    System.out.println("QUAL AÇÃO DESEJA TOMAR?: ");
                    System.out.println("[ 1 ] EXIBIR STATUS \n[ 2 ] SUBIR LVL \n[ 0 ] SAIR DO PERSONAGEM");
                    int op1 = ler.nextInt();
                    if (op1 == 0){
                        op = 0;
                        break;

                    } else if (op1 == 1) {
                        p2.exibirStatus();
                    } else if (op1 == 2) {
                        p2.subirlvl();
                    }

                }
            }
        }
    }



}
