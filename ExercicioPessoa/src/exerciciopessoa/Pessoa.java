
package exerciciopessoa;


import java.util.Scanner;

public class Pessoa {
    
    String Nome;
    int Ano;
    int soma = 0;
    double peso;
    double altura;
    
    Scanner scan = new Scanner(System.in);
    
    
    public Pessoa(String Nome, int Ano, double peso,double altura){
        super();
        this.Nome = Nome;
        this.Ano = Ano;
        this.peso = peso;
        this.altura = altura;
            
    }
    public Pessoa(){}
    public void cadastraDados(){
        System.out.println("Digite seu nome : ");
        this.Nome = scan.next();
        
        System.out.println("Digite seu ano de nascimento : ");
        this.Ano = scan.nextInt();
        
        System.out.println("Digite seu peso : ");
        this.peso = scan.nextDouble();
        
        System.out.println("Digite sua altura : ");
        this.altura = scan.nextDouble();
    }
    public int calcularIdade(){
         return soma = Ano - 2022;
        
    }
    public void mostraDados(){
        System.out.println("Seu nome é : " + this.Nome);
        System.out.println("Seu ano de nascimento é :" + this.Ano);
        System.out.println("A soma da idade é : " + calcularIdade());
        System.out.println("Sua peso é : " + this.peso);
        System.out.println("Sua altura é : " + this.altura);
        
    }
            
    
}
