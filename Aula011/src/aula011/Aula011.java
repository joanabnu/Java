package aula011;

public class Aula011 {

    public static void main(String[] args) {

        // Pessoa p1 = new Pessoa();
        //  Visitante v1 = new Visitante();
        //v1.setNome("Joana");
        //v1.setIdade(22);
        //v1.setSexo("F");
        //System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome(" Camilla");
        a1.setMatricula(111);
        a1.setCurso("Informada");
        a1.setIdade(16);
        a1.setSexo("F");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(111111);
        b1.setNome("Raquel");
        b1.setBolsa(12.5f);
        b1.setSexo("F");
        b1.pagarMensalidade();
        
    }

}
