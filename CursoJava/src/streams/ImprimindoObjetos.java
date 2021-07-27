package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		//Forma tradicional for
		System.out.println("Forma tradicional do for...");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		//Usando foreach
		System.out.println("\nUsando foreach...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		//Usando Iterator (interface)
		System.out.println("\nUsando Iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Usando Stream
		System.out.println("\nUsando Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}
}
