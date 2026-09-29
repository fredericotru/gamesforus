package projeto.modelo;

public class Guerreiro extends Personagem {

    private int armadura;

    public Guerreiro(String nome, int vida, int armadura) {
        super(nome, vida);
        this.armadura = armadura;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com a sua espada!");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Armadura: " + armadura);
    }
}