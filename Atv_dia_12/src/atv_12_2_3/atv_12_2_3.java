package atv_12_2_3;
import java.util.*;

//Código incompleto, desconsidere.

public class atv_12_2_3 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Set<Integer> x = new HashSet<>();

		        System.out.println("Digite 10 valores inteiros não repetidos:");

		        for (int i = 0; i < 10; i++) {
		            int value;
		            do {
		                System.out.print("Digite o " + (i + 1) + "º valor: ");
		                value = scanner.nextInt();
		                if (x.contains(value)) {
		                    System.out.println("Valor já existe. Tente novamente.");
		                }
		            } while (x.contains(value));
		            x.add(value);
		        }

		        System.out.println("\nElementos da Collection Set:");
		        Iterator<Integer> iterator = x.iterator();
		        while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		        
		}

	}

}
