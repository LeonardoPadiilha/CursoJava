package controle;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int numero = entrada.nextInt();
		int contadorDeDivisores = 0;
		
		for (int i = 2; i < numero; i++) {
			if (numero % i ==0) {
				contadorDeDivisores++;
			}
		}
		if (contadorDeDivisores ==0) {
			System.out.println("O numero "+numero + " é primo.");
		}else {
			System.out.println("O numero digitado "+numero+" não é primo");
		}
		
		entrada.close();
	}

}
