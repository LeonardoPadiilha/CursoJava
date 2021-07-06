package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		double val1 = entrada.nextDouble();
		
		System.out.print("Informe o segundo numero: ");
		double val2 = entrada.nextDouble();
		
		System.out.print("Informe a operação: ");
		String op = entrada.next();
		
		
		//Lógica
		double resultado = "+".equals(op)? val1 + val2 :0;
		resultado = "-".equals(op) ? val1 - val2: resultado;		
		resultado = "*".equals(op) ? val1 * val2: resultado;		
		resultado = "/".equals(op) ? val1 / val2: resultado;		
		resultado = "%".equals(op) ? val1 % val2: resultado;		
		System.out.printf("%.2f %s %.2f = %.2f", val1,op,val2, resultado);
		entrada.close();
	}
}
