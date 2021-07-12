package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{

	Ana mae = new Ana();
	 void testeAcessos() {
		 //System.out.println(mae.segredo); //somente ana consegue visualizar
		// System.out.println(mae.facoDentroDeCasa); //somente dentro do pacote
		 System.out.println(formaDeFalar); //transmitido por heranca sem instanciar a Ana
		 System.out.println(todosSabem);
	 }
}
