package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double - conversão para todos os primitivos
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é: " +conjunto.size());
		
		System.out.println(conjunto.remove('x')); //Tenta remover o objeto, se puder, retorna true senão false
		System.out.println("Tamanho é: " +conjunto.size()); //resultado será 4
		
		System.out.println(conjunto.contains("Teste"));//serve para verificar se um elemento está contido no conjunto
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		//conjunto.addAll(nums);//união entre dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		conjunto.clear();
		System.out.println(conjunto);
	}
}
