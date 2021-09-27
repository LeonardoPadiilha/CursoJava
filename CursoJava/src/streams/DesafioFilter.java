package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Lapis", 1.99, 0.12, 30);
		Produto p2 = new Produto("NoteBook", 4899, 0.32, 0);
		Produto p3 = new Produto("Caderno", 30, 0.45, 0);
		Produto p4 = new Produto("Impressora", 1200, 0.40, 0);
		Produto p5 = new Produto("Ipad", 3100, 0.29, 0);
		Produto p6 = new Produto("Relogio", 1900, 0.12, 0);
		Produto p7 = new Produto("Monitor", 800, 0.31, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		//Filter, filter e map
		Predicate<Produto> superPromocao = p -> p.desconto >=0.3;
		Predicate<Produto> freteGratis = p -> p.valorFrete ==0;
		Predicate<Produto> precoRelevante = p -> p.preco >= 500;
		
		Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por R$" + p.preco + " com " + p.desconto *100 + "% de desconto!";
		
		produtos.stream().filter(superPromocao).filter(freteGratis).filter(precoRelevante).map(chamadaPromocional).forEach(System.out::println);
		
	}
}
