package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X", "Mundo");
		s = s.toUpperCase();
		s = s.concat(" Loco");
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Falando no bagui".replace("bagui", "Mike");
		System.out.println(y);
		
	}
}
