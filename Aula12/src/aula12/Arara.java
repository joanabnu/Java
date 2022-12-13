package aula12;

public class Arara extends Ave {

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Canto da Arara");
    }
}
