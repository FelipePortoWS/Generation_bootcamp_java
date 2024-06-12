package atv_13_2_2;

import java.util.Scanner;
import java.util.Stack;

public class atv_13_2_2 {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		Scanner scanner = new Scanner(System.in);
		String op = "0";
		
		do{
			System.out.println("\n\n(1) - Adicionar um livro na pilha");
			System.out.println("(2) - Listar todos os livros");
			System.out.println("(3) - Retirar livro da pilha");
			System.out.println("(0) - Sair");
			
			op = scanner.nextLine();
			
			switch(op) {
			case "1":
				System.out.println("\nDigite o nome do livro");
				String livro = scanner.nextLine();
				pilha.push(livro);
				break;
			
			case "2":
				if (pilha.isEmpty() == false){
					System.out.println("\nLista de clientes: \n" +pilha);
					}else {
					System.out.println("\nA lista está vazia");
					}
				break;
				
			case "3":
				if (pilha.isEmpty() == false){
					pilha.pop();
					System.out.println("\nLista de livros: \n" +pilha);
					}else {
					System.out.println("\nA lista está vazia");
					}
				break;
				
			case "0":
				System.out.println("\nSaindo do sistema");
				break;
				
			default:
				System.out.println("\nDigite uma opção válida");
				break;
			}
			
		}while(!op.equals("0"));
		
	}

}
