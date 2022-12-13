
package aula12;


public class Peixe extends Animal {
    private String corEscamap;

    public String getCorEscamap() {
        return corEscamap;
    }

    public void setCorEscamap(String corEscamap) {
        this.corEscamap = corEscamap;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
        
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
       
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
       
    }
    public  void soltarBolha() {
        System.out.println("Soltando Bolha");
        
    }
    
    
}
