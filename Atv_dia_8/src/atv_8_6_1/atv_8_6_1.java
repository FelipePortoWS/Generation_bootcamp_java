package atv_8_6_1;
import java.util.Scanner;

public class atv_8_6_1 {

	public static void main(String[] args) {
		float salario, abono, salarioMaisAbono;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário:\n");
		salario = ler.nextFloat();
		System.out.println("Digite o valor do abono:\n");
		abono = ler.nextFloat();
		salarioMaisAbono = salario + abono;
		
		String resultado = String.format("%.2f", salarioMaisAbono);
		System.out.println("Seu novo salário é: " + resultado + " reais");
	}

}
