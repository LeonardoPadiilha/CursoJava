package arrays;


import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas voc� deseja inserir ?");
		int qtdNotas = entrada.nextInt();
		double[] notas = new double[qtdNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("informe a nota " + (i + 1) + ":");
			double nota = entrada.nextDouble();
			notas[i] = nota;
		}
		double total = 0;
		for(double nota: notas) {
			
			total+=nota;
		}
		double media = total / notas.length;
		System.out.println("A m�dia final �: " + media);
		entrada.close();
	}
}
