package POO.constructor;

public class Personagem {
    private String nome;
    private String classe;
    private int lvl;
    private double hp;
    private double mp;
    private double forca;
    private double inteligencia;

    public Personagem(String nome, String classe) {
        System.out.println("Criando personagem....");

        this.nome = nome;
        this.classe = classe;
        lvl = 1;
        if (classe.equals("Guerreiro")){
            hp = 100 + (lvl * 2);
            mp = 50 + ((double) lvl / 2);
            forca = lvl * 1.5;
            inteligencia = lvl;
        } else if (classe.equals("Mago")) {
            hp = 100 + ((double) lvl / 2);
            mp = 50 + (lvl * 2);
            forca = lvl;
            inteligencia = lvl * 1.7;
        }
    }


    public void subirlvl (){
        lvl += 1;
        System.out.println("SUBIU DE LVL !!! LVL " + lvl);
        if (classe.equals("Guerreiro")){
            hp = 100 + (lvl * 2);
            mp = 50 + ((double) lvl / 2);
            forca = lvl * 1.5;
            inteligencia = lvl;
        } else if (classe.equals("Mago")) {
            hp = 100 + ((double) lvl / 2);
            mp = 50 + (lvl * 2);
            forca = lvl;
            inteligencia = lvl * 1.7;
        }
    }

    public void exibirStatus(){
        System.out.println("NOME: "+ nome);
        System.out.println("LVL: "+ lvl);
        System.out.println("CLASSE: "+ classe);
        System.out.println("HP: "+ hp);
        System.out.println("MP: "+ mp);
        System.out.println("FORÇA: "+ forca);
        System.out.println("INTELIGENCIA: "+ inteligencia);
    }


    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getLvl() {
        return lvl;
    }

    public double getHp() {
        return hp;
    }

    public double getMp() {
        return mp;
    }

    public double getForca() {
        return forca;
    }

    public double getInteligencia() {
        return inteligencia;
    }
}
