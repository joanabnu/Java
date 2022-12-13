
package bhaskara;


public class Bhaskara {


    public static void main(String[] args) {
        int a = 3;
        int b = -15;
        int c = 12;
        double delta = Math.pow(b, 2)-(4*a*c);
        double denominador = 2*a;
        double numeradorx1 = -b+Math.sqrt(delta);
        double numeradorx2 = -b-Math.sqrt(delta);
        double x1 = numeradorx1/denominador;
        double x2 = numeradorx2/denominador;
        
        if(delta > 0){
            if(x1==x2){
                System.out.println("x1 = x2 =" + x2);
            }else{
                System.out.println("x1 = "+ x1);
                System.out.println("x2 = "+ x2);
            }
            
    }else{
            System.out.println("Não existe raizes reais ");
        }
    }
    
}
