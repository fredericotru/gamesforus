package projeto;

import projeto.modelo.Personagem;

public class Main {

    public static void main(String[] args) {

        Personagem personagem = new Personagem("Herói", 100);

        personagem.exibirInformacoes();
        personagem.atacar();
    }
}