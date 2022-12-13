package aula03;

public class Aula03 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Big cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5; acesso privado
        c1.carga = 80; // acesso protegido
        c1.tampada = true; // acesso protegido 
        c1.status();
        c1.rabiscar();
    }

}
