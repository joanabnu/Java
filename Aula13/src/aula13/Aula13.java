package aula13;

public class Aula13 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        m.emitirSom();
        l.emitirSom();
        c.emitirSom();
        
        System.out.println("\nPolimorfismo SobreCarga\n");
        
        c.reagir("Princesa");
        c.reagir(11, 45);
        c.reagir(19,00);
        c.reagir(true);
        c.reagir(false);
    }

}
