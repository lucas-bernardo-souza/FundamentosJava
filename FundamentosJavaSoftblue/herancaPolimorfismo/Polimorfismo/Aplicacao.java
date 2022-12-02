package Polimorfismo;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		/*
		 * Qual método nesse caso será chamado o da super classe ou da subclasse? Sempre
		 * será chamado o método do objeto que está referenciado na memória Nesse caso
		 * caso o objeto que está referenciado na memoria é cachorro, apesar dele ser do
		 * tipo animal
		 */
		
		Animal c = new Cachorro();
		
		c.falar();
		
		// Da erro porque o tipo animal não enxerga metodos prórios do tipo cachorro
		//c.morder();
		
		// Sempre que for fazer um casting explicito é preciso verificar na memória se o objeto está de fato apontando para o tipo do casting
		// Por exemplo para fazer o casting de animal para cachorro precisamos ver se la na memória temos de fato um objeto do tipo cachorro
		
		if(c instanceof Cachorro) {
			// Para resolver esse problema é necessário realizar um casting explicito
			Cachorro h = (Cachorro) c;
			h.morder();
		}
		
		
		
	}

}
