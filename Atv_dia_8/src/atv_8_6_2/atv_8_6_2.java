package atv_8_6_2;

import java.util.Scanner;

public class atv_8_6_2 {

	public static void main(String[] args) {
		float n1, n2, n3, n4, media;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota:");
		n1 = ler.nextFloat();
		System.out.println("\nDigite sua segunda nota:");
		n2 = ler.nextFloat();
		System.out.println("\nDigite sua terceira nota:");
		n3 = ler.nextFloat();
		System.out.println("\nDigite sua quarta nota:");
		n4 = ler.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		String resultado = String.format("%.1f", media);
		
		System.out.println("Média final: " + resultado);
		
	}

}
