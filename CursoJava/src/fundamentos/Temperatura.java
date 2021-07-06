package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		double TempF = 75;
		final int const32 = 32;
		final double calc = 5/9.0;
		
		double conversao = (TempF - const32) * calc;
		
		System.out.println("Resultado é:" + conversao);
		
		
	}
}
