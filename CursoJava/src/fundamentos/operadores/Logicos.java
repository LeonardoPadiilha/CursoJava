package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = 3>7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!!condicao1);
		
		System.out.println("-------------------");
		System.out.println("Tabela verdade E (and)");
		
		System.out.println( true && true);//true
		System.out.println(true && false);//false
//		System.out.println(false && true);//false -> dead code
//		System.out.println(false && false);//false ->dead code
		
		System.out.println("-------------------");
		System.out.println("Tabela verdade OU (or)");
//		System.out.println(true || true); //true
//		System.out.println(true || false);//true
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		
		System.out.println("-------------------");
		System.out.println("Tabela verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true); //true
		System.out.println(true ^ false);//true
		System.out.println(false ^ true);//true
		System.out.println(false ^ false);//false
		
		System.out.println("-------------------");
		System.out.println("Tabela verdade NOT");
		System.out.println(!false); //true
		System.out.println(!true);//true
	}

}
