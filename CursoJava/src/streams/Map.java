package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		System.out.println();
		marcas.stream().map(m -> m.charAt(0) + "").forEach(print);
		System.out.println();
		marcas.stream().map(m -> m + "!!! ").forEach(print);
		
		//Unary Operators
//		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
//		UnaryOperator<String> grito = n -> n + "!!!";
		
		//Usando composicao
		System.out.println("\nUsando Composicao...");
		marcas.stream().map(Utilitarios.maiuscula).map(primeiraLetra).map(Utilitarios::grito).forEach(print);
	}
}
