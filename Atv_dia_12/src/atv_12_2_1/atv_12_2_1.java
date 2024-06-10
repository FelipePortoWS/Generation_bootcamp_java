package atv_12_2_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atv_12_2_1 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
		Scanner element = new Scanner(System.in);
		
		System.out.println("Escreva o nome de cinco cores: ");
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("Digite a cor número "+i);
			lista.add(element.nextLine());
		}
		
		System.out.println("\nLista : ");
		System.out.println(lista);
		
		System.out.println("\nLista ordenada por ordem alfabética: ");
		Collections.sort(lista);
		System.out.println(lista);
	}
}
