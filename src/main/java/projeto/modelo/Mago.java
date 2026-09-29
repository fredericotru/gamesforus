package projeto.modelo; 

 

public class Mago extends Personagem { 

 

    private int mana; 

 

    public Mago(String nome, int vida, int mana) { 

        super(nome, vida); 

        this.mana = mana; 

    } 

 

    public int getMana() { 

        return mana; 

    } 

 

    public void setMana(int mana) { 

        this.mana = mana; 

    } 

}
 