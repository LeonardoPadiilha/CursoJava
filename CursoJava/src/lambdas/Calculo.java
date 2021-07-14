package lambdas;

@FunctionalInterface
public interface Calculo {

	double executar( double a, double b);
	
	//Tem a possibilidade de criar um metodo default
	default String legal() {
		return "legal";
	}
	
	//Assim como tambem um estatico 
	static String muitoLegal() {
		return "Muito legal";
	}
	
}
