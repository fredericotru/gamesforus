package projeto;

import java.util.ArrayList;
import java.util.List;

import projeto.modelo.Personagem;
import projeto.modelo.Guerreiro;
import projeto.modelo.Mago;

public class Main {

    public static void main(String[] args) {

        Personagem heMan = new Guerreiro("He-Man", 100, 50);
        Personagem gorpo = new Mago("Gorpo", 80, 100);

        List<Personagem> personagens = new ArrayList<>();

        personagens.add(heMan);
        personagens.add(gorpo);

        for (Personagem personagem : personagens) {
            personagem.exibirInformacoes();
            personagem.atacar();
            System.out.println();
        }
    }
}