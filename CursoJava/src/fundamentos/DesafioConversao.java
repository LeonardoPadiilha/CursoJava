package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Olá Por favor, informe seus últimos 3 rendimentos! \n");
		System.out.print("Salário 1:");
		String salario1 = entrada.next().replace(",", ".");
		
		System.out.print("Salário 2:");
		String salario2 = entrada.next().replace(",", ".");
		
		System.out.print("Salário 3:");
		String salario3 = entrada.next().replace(",", ".");
		
		Double sal1 = Double.parseDouble(salario1);
		Double sal2 = Double.parseDouble(salario2);
		Double sal3 = Double.parseDouble(salario3);
		
		Double soma = sal1 + sal2 + sal3;
		System.out.print("Seu salário é: " + soma);
		System.out.printf("A media do seu salário é:  "+ soma /3);
		
		entrada.close();
        
	}

}
