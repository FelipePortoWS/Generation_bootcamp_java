package JavaBasico;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		String nome = "Luana Souza";
		int idade = 29;
		float altura = 1.5f,nota1,nota2,nota3,media;
		
		System.out.println("\n Seu nome é: "+nome);
		System.out.println("\n Você viveu: "+idade+" anos de vida");
		System.out.println("\n Sua altura é: "+altura);
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\n Entre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\n Entre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\n Entre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
//System.out.println("sua média é de: "+media);
		System.out.printf("sua média é de: %.2f", media);
		
		//		char resp = 's';
		
	}

}
