
import java.util.Scanner;

public class SalarioBaser {

    public static void main(String[] args) {
        float horas;
        float valor;
        int tempo;
        float pagamento;
        float soma;

        Scanner dado;
        dado = new Scanner(System.in);

        System.out.println("Informe o seu tempo de serviço : ");
        tempo = dado.nextInt();

        System.out.println("Informe seu valor hora : ");
        valor = dado.nextFloat();

        System.out.println("Informe sua horas trabalhada : ");
        horas = dado.nextFloat();
        pagamento = valor * horas;

        switch (tempo) {
            case 1:
                soma = pagamento + 1500;
                System.out.println("O seu valor hora é : " + valor + "Suas horas trabalhada são : " + horas
                        + "Tempo de serviço : " + tempo + "a soma é : ");
                break;

            case 2:
                soma = pagamento + 2000;
                System.out.println("O seu valor hora é : " + valor + "Suas horas trabalhada são : " + horas
                        + "Tempo de serviço : " + tempo + "A soma total do seu salario é :" + soma);
                break;

            case 3:
                soma = pagamento + 3000;
                System.out.println("O seu valor hora é : " + valor + "Suas horas trabalhada são : " + horas
                        + "Tempo de serviço : " + tempo + "A soma total do seu salario é :" + soma);
                break;
        }

    }
}