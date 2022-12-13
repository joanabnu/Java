package calDev;

import java.util.Scanner;

public class Calculadora {
	
	// v1 + v2
	Scanner scan = new Scanner(System.in);
	public void init() {
        Scanner entrada = new Scanner(System.in);
        String operacao = "";
        while (!operacao.equals("finalizar")) {
            System.out.println("Digite a operação: ");
            operacao = entrada.nextLine();
            if (operacao.equals("finalizar")) {
                System.out.println("Finalizando...");
            } else {
                String[] valores = operacao.split(" ");
                int valor1 = Integer.parseInt(valores[0]);
                int valor2 = Integer.parseInt(valores[2]);
                String operador = valores[1];
                if (operador.equals("+")) {
                    System.out.println("Resultado: " + (valor1 + valor2));
                } else if (operador.equals("-")) {
                    System.out.println("Resultado: " + (valor1 - valor2));
                } else if (operador.equals("*")) {
                    System.out.println("Resultado: " + (valor1 * valor2));
                } else if (operador.equals("/")) {
                    System.out.println("Resultado: " + (valor1 / valor2));
                } else {
                    System.out.println("Operação inválida");
                }
            }
        }
			
	}
	public float adicao(float v1,float v2) {
		return v1 + v2;
		
	}
	public float subtracao(float v1,float v2) {
		return v1 - v2;
		
	}
	public float multiplicacao(float v1,float v2) {
		return v1 * v2;
		
	}
	public float divisao(float v1,float v2) {
		return v1 / v2;
		
	}

}
