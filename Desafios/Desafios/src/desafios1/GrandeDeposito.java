package desafios1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GrandeDeposito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        DecimalFormat saida = new DecimalFormat("0.00");
        double saldoAtual = 0;
        double valor = scanner.nextDouble();

        if (valor > 0) {
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            saldoAtual+=valor;
            System.out.println("Deposito realizado com sucesso!");
            System.out.print("Saldo atual: R$ " + saida.format(saldoAtual));
        } else if (valor == 0) {
            //TODO: Imprimir a mensagem de valor inválido.
            System.out.print("Encerrando o programa...");
        } else {
             //TODO: Imprimir a mensagem de encerrar o programa.
             System.out.print("Valor invalido! Digite um valor maior que zero.");
        }
        scanner.close();cd Desafios
	}

}
