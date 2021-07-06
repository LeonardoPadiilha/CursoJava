package fundamentos;

public class ConversaoTiposPrimitivosNumerico {

	public static void main(String[] args) {
		double a = 1; //Conversão implícita.
		System.out.println(a);
		
		float b = (float) 1.0801225;// Conversão explicita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; //conversão explícita 
		System.out.println(d);
		
		
		
	}
}
