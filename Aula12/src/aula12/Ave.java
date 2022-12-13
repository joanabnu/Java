package aula12;

public class Ave extends Animal {

    private String corPenha;

    @Override
    public void locomover() {
        System.out.println("Voando");

    }

    @Override
    public void alimentar() {
        System.out.println("Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");

    }

    public void fazerNinho() {
        System.out.println("Construido ninho");
    }

    public String getCorPenha() {
        return corPenha;
    }

    public void setCorPenha(String corPenha) {
        this.corPenha = corPenha;
    }

}
