package atv_11_2_3;
import java.util.Scanner;

public class atv_11_2_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int [][]matriz = new int[3][3];
		int somaMatrizPrincipal, somaMatrizSecundaria;

		System.out.println("Digite os números de sua matriz 3x3: \n");
		for (int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
			matriz[i][j] = ler.nextInt();
				
			}
		}
		
		somaMatrizPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		somaMatrizSecundaria = matriz[0][2] + matriz[1][1] + matriz[2][0];
		
		System.out.println(" \nElementos da diagonal principal: " 
				+matriz[0][0]+" "+matriz[1][1]+" "+matriz[2][2] );
		System.out.println(" \nElementos da diagonal secundária: "
				+matriz[0][2]+ " " +matriz[1][1]+ " " +matriz[2][0]);
		System.out.println(" \nSoma dos elementos da diagonal principal: "
				+ somaMatrizPrincipal);
		System.out.println(" \nSoma dos elementos da diagonal secundária: "
				+ somaMatrizSecundaria);
	}
}
