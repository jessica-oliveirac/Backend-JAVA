package desafios1;

import java.util.Scanner;

public class EquilibrandoSaldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
        saldoAtual += valorDeposito;
        saldoAtual -= valorRetirada;
     //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
        System.out.print("Saldo atualizado na conta: " + saldoAtual);
        scanner.close();
	}

}
