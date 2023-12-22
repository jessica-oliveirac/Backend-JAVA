package desafios1;

import java.util.Scanner;

public class CondicionalmenteRico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Entrada de dados
	    Scanner scanner = new Scanner(System.in);
	    int saldoTotal = scanner.nextInt();
	    int valorSaque = scanner.nextInt();

	    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos
	    int valorDisponivel = saldoTotal;
	    if(valorSaque<= valorDisponivel) {
	      int saldo = valorDisponivel - valorSaque;
	      System.out.print("Saque realizado com sucesso. Novo saldo: "+ saldo);
	    } else {
	      System.out.print("Saldo insuficiente. Saque nao realizado!");
	    }
	    scanner.close();
	}

}
