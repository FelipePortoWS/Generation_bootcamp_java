package atv_10_2_3;
import java.util.Scanner;

public class atv_10_2_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade = 0, menor21 = 0, maior50 = 0;
		
		while(idade >= 0){
			System.out.println("\nDigite uma idade: ");
			idade = ler.nextInt();
			if(idade < 21 && idade >= 0) {
				menor21++;
			}
			if(idade > 50) {
				maior50++;
			}
		}	
		
		System.out.println("\nTotal de pessoas menor de 21 anos: " + menor21);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + maior50);
		
	}

}
