package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();
	 void testeAcessos() {
		 //System.out.println(sogra.segredo); //somente ana consegue visualizar
		// System.out.println(sogra.facoDentroDeCasa); //somente dentro do pacote
//		 System.out.println(sogra.formaDeFalar); //transmitido por heranca sem instanciar a Ana
		 System.out.println(sogra.todosSabem);
	 }
}
