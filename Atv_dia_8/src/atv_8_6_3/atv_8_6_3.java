package atv_8_6_3;
import java.util.Scanner;

public class atv_8_6_3 {

	public static void main(String[] args) {
		float salarioBruto, adicionalNoturno, 
		horaExtra, desconto, salarioLiquido;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite seu salário bruto: ");
		salarioBruto = ler.nextFloat();
		System.out.println("\nDigite seu adicional noturno: ");
		adicionalNoturno = ler.nextFloat();
		System.out.println("\nDigite a soma de suas horas extras: ");
		horaExtra = ler.nextFloat();
		System.out.println("\nDigite a soma dos seus descontos: ");
		desconto = ler.nextFloat();
		
		salarioLiquido = salarioBruto+adicionalNoturno+(horaExtra*5)-desconto;
		String resultado = String.format("%.2f", salarioLiquido);
		
		System.out.println("\nSalário Líquido: R$"+resultado);
	}

}
