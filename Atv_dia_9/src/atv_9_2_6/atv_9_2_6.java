package atv_9_2_6;
import java.util.Scanner;

public class atv_9_2_6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome, nomeCargo;
		int cargo;
		float salario, novoSalario, reajuste;
		
		System.out.println("\nCódigo do cargo     Cargo");
		System.out.println("\t1          Gerente");
		System.out.println("\t2          Vendedor");
		System.out.println("\t3          Supervisor");
		System.out.println("\t4          Motorista");
		System.out.println("\t5          Estoquista");
		System.out.println("\t6          Técnico de TI");
		
		System.out.println("\nDigite seu nome: ");
		nome = ler.nextLine();
		System.out.println("Digite o código de seu cargo: ");
		cargo = ler.nextInt();
		System.out.println("Digite seu salário: ");
		salario = ler.nextFloat();
		
		switch(cargo) {
		case 1:
			nomeCargo = "Gerente";
			reajuste = (float) 0.1;
			novoSalario = salario + (salario*reajuste);
			System.out.println("\nNome do Colaborador: " + nome);
			System.out.println("Cargo: " + nomeCargo);
			System.out.println("Salário reajustado: R$" + novoSalario);
			break;
		case 2:
			nomeCargo = "Vendedor";
			reajuste = (float) 0.07;
			novoSalario = salario + (salario*reajuste);
			System.out.println("\nNome do Colaborador: " + nome);
			System.out.println("Cargo: " + nomeCargo);
			System.out.println("Salário reajustado: R$" + novoSalario);
			break;
		case 3:
			nomeCargo = "Supervisor";
			reajuste = (float) 0.09;
			novoSalario = salario + (salario*reajuste);
			System.out.println("\nNome do Colaborador: " + nome);
			System.out.println("Cargo: " + nomeCargo);
			System.out.println("Salário reajustado: R$" + novoSalario);
			break;
		case 4:
			nomeCargo = "Motorista";
			reajuste = (float) 0.06;
			novoSalario = salario + (salario*reajuste);
			System.out.println("\nNome do Colaborador: " + nome);
			System.out.println("Cargo: " + nomeCargo);
			System.out.println("Salário reajustado: R$" + novoSalario);
			break;
		case 5:
			nomeCargo = "Estoquista";
			reajuste = (float) 0.05;
			novoSalario = salario + (salario*reajuste);
			System.out.println("\nNome do Colaborador: " + nome);
			System.out.println("Cargo: " + nomeCargo);
			System.out.println("Salário reajustado: R$" + novoSalario);
			break;
		case 6:
			nomeCargo = "Técnico de TI";
			reajuste = (float) 0.08;
			novoSalario = salario + (salario*reajuste);
			System.out.println("\nNome do Colaborador: " + nome);
			System.out.println("Cargo: " + nomeCargo);
			System.out.println("Salário reajustado: R$" + novoSalario);
			break;
		default:
			System.out.println("ERRO 01: Digite um código de cargo válido!");
		}
	}
}
