
package Exercicio2POO;
import java.util.Scanner;


public class Exercicio2POO {

    public static void main(String[] args) {
        //Chamando o objeto
        contaCorrente conta = new contaCorrente(1224, 1548, "David");{
            

            int opcao = 0;
            
            while (opcao != 4){
                
             //Menu
             System.out.println("Olá " + conta.getNomeCorrentista() 
                     + "! O que deseja fazer hoje:");
             System.out.println("1 - Realizar saque");
             System.out.println("2 - Realizar depósito");
             System.out.println("3 - Alterar nome");
             System.out.println("4 - Sair do menu");
             
             Scanner leitor = new Scanner(System.in);
             int resposta = leitor.nextInt();   
             
             
             
             if(resposta == 4){
                opcao = 4;
             }else{
                 if(resposta ==1){ //Saque
                    System.out.println("Qual o valor do saque?");
                 
                    float valorSaque = leitor.nextFloat();
                    float saque = conta.getSaldo() - valorSaque;
                    if(saque < 0){
                    System.out.println("Valor abaixo do limite permitido");
                 }else{
                    conta.setSaldo(saque);
                    System.out.println("Seu novo saldo é: " + conta.getSaldo());
                 }
                 }if(resposta == 2){ //Depósito
                    System.out.println("Qual o valor do depósito?");
                    float valorSaque = leitor.nextFloat();
                     
                    float saque = conta.getSaldo() + valorSaque;
                    if(valorSaque < 0){
                        System.out.println("Valor abaixo do limite permitido");
                    }else{
                        conta.setSaldo(saque);
                        System.out.println("Seu novo saldo é: " + conta.getSaldo());
                    }
                 
                 }if(resposta == 3){ //Alterar o nome
                    System.out.println("Novo nome: ");
                    String nomeNovo = leitor.next();
                    conta.setNomeCorrentista(nomeNovo);
                    
                    System.out.println("Nome alterado! Bem vindo, " 
                            + conta.getNomeCorrentista());
                 }  
                 
             }
             
             
             
             
            }
            
        }
        
        
    }
}
