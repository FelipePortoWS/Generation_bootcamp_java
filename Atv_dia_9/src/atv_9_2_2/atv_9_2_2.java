package atv_9_2_2;
import java.util.Scanner;

public class atv_9_2_2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		String parImpar = null;
		
		System.out.println("Digite um número:");
		n = ler.nextInt();
		if(n % 2 == 0) {
			parImpar = "par";
		}else{
			parImpar = "ímpar";
		}
		if(n > 0) System.out.println("\nO número "+n+" é "+ parImpar +" e positivo.");
		if(n < 0) System.out.println("\nO número "+n+" é "+ parImpar +" e negativo.");
		if(n == 0) System.out.println("\nO número "+n+" é igual a 0.");
	
	}
}
