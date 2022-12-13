
package p001;
import java.util.Scanner;

public class P001 {

   
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     pessoa pessoa1 = new pessoa();
     
     pessoa1.altura=10;
     
     System.out.println(pessoa1.altura);
     
        System.out.println("Qual é o seu nome : ");
        pessoa1.nome = scan.next();
        
        System.out.println(pessoa1.nome);
                
                
        
     
    }
    
}
