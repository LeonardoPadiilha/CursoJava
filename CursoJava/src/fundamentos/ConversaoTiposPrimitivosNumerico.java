package fundamentos;

public class ConversaoTiposPrimitivosNumerico {

	public static void main(String[] args) {
		double a = 1; //Convers�o impl�cita.
		System.out.println(a);
		
		float b = (float) 1.0801225;// Convers�o explicita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; //convers�o expl�cita 
		System.out.println(d);
		
		
		
	}
}
