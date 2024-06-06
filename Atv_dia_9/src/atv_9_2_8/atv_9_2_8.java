package atv_9_2_8;
import java.util.Scanner;

public class atv_9_2_8 {

	public static float Interagir(float saldoAtual) {
		Scanner lerInteragir = new Scanner(System.in);
		int operacao;
		float novoSaldo, saque;
		
		System.out.println("Código da Operação \t Operação");
		System.out.println(" \t 1 \t\t  Saldo");
		System.out.println(" \t 2 \t\t  Saque");
		System.out.println(" \t 3 \t\t  Depósito");
		
		System.out.println("\nInsira a operação desejada: ");
		operacao = lerInteragir.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println(saldoAtual);
			break;
		case 2:
			System.out.println("Digite o quanto deseja sacar: ");
			saque = lerInteragir.nextFloat();
			if(saque <= saldoAtual) {
				saldoAtual = saldoAtual - saque;
				
			}
			
		}
		
		return (float) 5.7;
	}
	
	public static void main(String[] args) {
		Scanner lerMain = new Scanner(System.in);
		float saldo = 1000;
		String realizarOperacao;
		
		System.out.println("Você deseja realizar uma operação? (Digite sim/não)");
		realizarOperacao = lerMain.nextLine();
		while(realizarOperacao == "sim") {
			Interagir(saldo);
		}
		
	}

}
