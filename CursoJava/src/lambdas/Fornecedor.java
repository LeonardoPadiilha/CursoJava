package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		//interface funcional que nao recebe nenhum parametro
		Supplier<List<String>> umLista = () -> Arrays.asList("Ana", "bia", "Lia", "Gui");
		System.out.println(umLista.get());
	}
}
