package atv_9_2_3;
import java.util.Scanner;

public class atv_9_2_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome = null;
		int idade;
		boolean primeiraDoacao;
		boolean apto = false;
		
		System.out.println("Digite o nome do doador de sangue:");
		nome = ler.nextLine();
		System.out.println("Digite a idade do doador:");
		idade = ler.nextInt();
		System.out.println("É sua primeira doação de sangue?(responda com \"true\" ou \"false\"):");
		primeiraDoacao = ler.nextBoolean();
		
		if(idade >= 18 && idade <= 59) {
			apto = true;}
		
		if(!primeiraDoacao && idade > 60 && idade <= 69 ) {
			apto = true;}
		
		if (apto == true) {
			System.out.println(nome + " está apto(a) á doar sangue!");
		} else {
			System.out.println(nome + " não está apto(a) á doar sangue!");
		}
	}
}

