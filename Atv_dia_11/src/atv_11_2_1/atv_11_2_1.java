package atv_11_2_1;
import java.util.Scanner;

public class atv_11_2_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] array = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int num;
		

		System.out.println("Digite o número que você deseja encontrar: ");
		num = ler.nextInt();
		
		for(int i=0 ; i<10 ; i++) {
			if(array[i] == num) {
				System.out.println("O número " +num+ " está localizado na posição " +i);
			}
		}
		
	}

}
