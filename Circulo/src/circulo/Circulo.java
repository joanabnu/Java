
package circulo;


public class Circulo {

  
    public static void main(String[] args) {
       Raio r = new Raio(5,3.1415,2,0);
       r.soma = r.area * r.pi * r.raio;
       
        System.out.println("area é : " + r.soma);
    }
    
}
