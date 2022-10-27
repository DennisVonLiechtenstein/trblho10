package round10;

import java.util.Scanner;

public class Abracadabra {

	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		int linha=3;
		int coluna=3;
		int par=0;
		int impar=0;
		int M[][]=new int[linha][coluna];
		for(int linh=0;linh<linha;linh++) {
			for(int col=0;col<coluna;col++) {
				System.out.println("informe os numeros inteiros:");
				M[linh][col]=scanf.nextInt();
				
				
			}
		}
		for(int linh=0;linh<linha;linh++) {
			for(int col=0;col<coluna;col++) {
				if(M[linh][col]%2==0) {
					par++;
				}else {
					impar++;
				}
			}
		}
		for(int linh=0;linh<linha;linh++) {
			for(int col=0;col<coluna;col++) {
				System.out.println("["+M[linh][col]+"]");
				
			}
		}
		System.out.println("pares:"+par+"\n impares:"+impar);

	}

}
