
package aula05;


public class Aula05 {

   
    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
       p1.setNumeroConta(1111);
       p1.abrirConta("CC");
       p1.setDono("jubileu");
       p1.depositar(954);
       p1.estadoAtual();
       
       ContaBanco p2 = new ContaBanco();
       p2.setNumeroConta(55514);
       p2.abrirConta("CP");
       p2.setDono("Joaquem");   
       p2.depositar(3000);
       p2.sacar(150);
       p2.estadoAtual();
    }
    
}
