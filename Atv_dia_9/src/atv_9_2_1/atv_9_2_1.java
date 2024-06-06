package atv_9_2_1;
import java.util.Scanner;
public class atv_9_2_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int A, B, C, X;
		
		System.out.println("Digite o número A: ");
		A = ler.nextInt();
		System.out.println("\nDigite o número B: ");
		B = ler.nextInt();
		System.out.println("\nDigite o número C: ");
		C = ler.nextInt();
		
		X = A+B;
		
		if(X>C) System.out.println("\nA soma de A + B é maior que C");
		if(X==C) System.out.println("\nA soma de A + B é igual a C");
		if(X<C) System.out.println("\nA soma de A + B é menor que C");
		
	}

}
