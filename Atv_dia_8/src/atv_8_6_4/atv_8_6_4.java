package atv_8_6_4;
import java.util.Scanner;

public class atv_8_6_4 {

	public static void main(String[] args) {
		float n1, n2, n3, n4, diferenca;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		n1 = ler.nextFloat();
		System.out.println("\nDigite o segundo número:");
		n2 = ler.nextFloat();
		System.out.println("\nDigite o terceiro número:");
		n3 = ler.nextFloat();
		System.out.println("\nDigite o quarto número:");
		n4 = ler.nextFloat();
		
		diferenca = (n1*n2)-(n3*n4);
		String diferencaAprox = String.format("%.2f",diferenca); 
		
		System.out.println("\nA diferença exata é de: "+diferenca);
		System.out.println("\nA diferença aproximada é de: "+diferencaAprox);
	}
}
