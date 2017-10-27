import java.math.BigInteger;
import java.util.Scanner;


public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		float num = 0;
		int qtdPositivos = 0;
		float media = 0;
		
		for(int i = 0; i < 6; i++) {
			num = leia.nextFloat();
			if(num > 0) {
				qtdPositivos++;
				media += num;
			}
		}
		
		System.out.println(qtdPositivos+" valores positivos");
		System.out.println(media / (float)qtdPositivos);
	}

}
