package atv_10_2_5;
import java.util.Scanner;

public class atv_10_2_5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, npositivo = 0;
		
		do {
			System.out.println("Digite um número: ");
			n = ler.nextInt();
			if(n > 0) npositivo = npositivo + n;
		}
		while(n != 0);
		
		System.out.println("A soma dos números positivos é: "+npositivo);
	}
}
