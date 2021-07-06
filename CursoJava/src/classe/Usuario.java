package classe;

public class Usuario {

	String nome;
	String email;
	
	@Override
	public boolean equals(Object objeto) {
//		if(objeto instanceof Usuario) {
//			Usuario outro = (Usuario) objeto;
//			return super.equals(obj);
//		}else {
//			return false;
//		}
		Usuario outro = (Usuario) objeto;
		
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual; 
			
	}
	//O HashCode e o Equals pode ser gerado pelo Eclipse!!
	//O hashcode será abordado em outra aula!
}
