
package aula12;


public class Reptil extends Animal {
    private String corEscamaR;

    public String getCorEscamaR() {
        return corEscamaR;
    }

    public void setCorEscamaR(String corEscamaR) {
        this.corEscamaR = corEscamaR;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
       
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de reptil");
        
    }
 
    
    
}
