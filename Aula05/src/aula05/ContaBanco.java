package aula05;

public class ContaBanco {

    // Atributos
    public int numeroConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private int setSaldo;
    private boolean setStatus;
    public void estadoAtual(){
        System.out.println("**********************");
        System.out.println("Conta : " + this.getNumeroConta());
        System.out.println("Tipo : " + this.tipo);
        System.out.println("Dono : " + this.getDono());
        System.out.println("Saldo : " + this.getSaldo());
        System.out.println("Status : " + this.getStatus());
    }

    // Métodos Personalizados
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);

        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }

    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechado porque ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem debito");

        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }

    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta " + this.getDono());

        } else {
            System.out.println("Impossivel depositar em uma conta fechada!");
        }

    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo((this.getSaldo() - v));
                System.out.println("Saque realizado na conta de " + this.getDono());
             
            }   else{
                  System.out.println("Saldo insufienciente para saque");
              }

        } else {
            System.out.println("Impossivel depositar em uma conta fechada!");
        }

    }

    public void pagarMensal() {
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
            
        }else if (this.getTipo() == "CP"){
            v = 20;
        } if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade pagar com sucessor");
        }else{
            System.out.println("Impossivel pagar em uma conta fechada");
        }

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Métados Especiais
    public void ContaBanco() {
        this.setSaldo = (0);
        this.setStatus = (false);
    }

}
