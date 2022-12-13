package aula12;

public class Aula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara ar = new Arara();

        System.out.println("--Mamifero--");

        m.setPeso(35.3f);
        m.setCorpele("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        System.out.println("--Reptil--");

        r.setPeso(35.3f);
        r.setIdade(21);
        r.alimentar();
        r.locomover();
        r.emitirSom();

        System.out.println("--Peixe--");

        p.setPeso(1.3f);
        p.setIdade(2);
        p.alimentar();
        p.locomover();
        p.emitirSom();

        System.out.println("--Locomoção--");

        c.locomover();
        ca.locomover();
        co.locomover();
        t.locomover();
        g.locomover();
        ar.locomover();

        System.out.println("--Som--");

        c.emitirSom();
        ca.emitirSom();
        co.emitirSom();
        t.emitirSom();
        g.emitirSom();
        ar.emitirSom();
    }

}
