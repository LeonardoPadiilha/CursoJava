package fundamentos.operadores;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		int a =1;
		int b =2;
		
		a++;// a = a -1
		a--;
		++b;
		--b;
		
		System.out.println(++a == b--); // ira dar true pqe primeiro compara depois decrementao B
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
