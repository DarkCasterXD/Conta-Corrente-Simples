package Exercicio2POO;


public class contaCorrente {
  
   private int numeroConta; 
   public float saldo; 
   String nomeCorrentista;
   

    public contaCorrente(int numeroConta, float saldo, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nomeCorrentista = nomeCorrentista;
    System.out.println("Número da conta: " + getNumeroConta());
    System.out.println("Nome do correntista: " + getNomeCorrentista());
    System.out.println("Saldo atual da conta: " + getSaldo());

    }
    

    
    
    public float getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }
    
    
    
    
    
}
