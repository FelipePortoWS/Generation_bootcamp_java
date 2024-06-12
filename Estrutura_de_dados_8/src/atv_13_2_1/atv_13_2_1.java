package atv_13_2_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class atv_13_2_1 {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		Scanner scanner  = new Scanner(System.in);
		String op = "0";
		
		do{
			System.out.println("\n\n(1) - Adicionar cliente na fila");
			System.out.println("(2) - Listar todos os clientes");
			System.out.println("(3) - Retirar cliente da fila");
			System.out.println("(0) - Sair");
			
			op = scanner.nextLine();
			
			switch(op) {
			case "1":
				System.out.println("\nDigite o nome do cliente");
				String cliente = scanner.nextLine();
				fila.add(cliente);
				break;
			
			case "2":
				if (fila.isEmpty() == false){
					System.out.println("\nLista de clientes: \n" +fila);
					}else {
					System.out.println("\nA lista está vazia");
					}
				break;
				
			case "3":
				fila.remove();
				if (fila.isEmpty() == false){
				System.out.println("\nLista de clientes: \n" +fila);
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
