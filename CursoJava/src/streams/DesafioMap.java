package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		/*
		 * 1. Numero para string binaria... 6 => "110"
		 * 2. Inverter a string... "110" => "011" 
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Consumer<String> print = System.out::println;
		UnaryOperator<String> inverter = n -> new StringBuilder(n).reverse().toString();
		Function<String, Integer> binarioParaInt = n -> Integer.parseInt(n, 2);
		
		nums.stream().map(n -> n.toBinaryString(n) + "").forEach(print);//meu jeito, a primeira parte deu certo
		
		nums.stream().map(Integer::toBinaryString).map(inverter).map(binarioParaInt).forEach(System.out::println);//feito pelo professor
		
		
	}
}
