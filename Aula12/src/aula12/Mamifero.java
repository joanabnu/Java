
package aula12;


public class Mamifero extends Animal{
    private String corpele;

    public String getCorpele() {
        return corpele;
    }

    public void setCorpele(String corpele) {
        this.corpele = corpele;
    }


    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    
    
}
