package desafios1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        taxaJuros++;
        //TODO:Período em anos, para calculo do valorFinal com os juros.
        for(int i=1; i<=periodo; i++) {
          valorFinal *= taxaJuros;
        }
        
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
	}

}
