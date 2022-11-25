package PraticaUm;

public class Motocicleta extends Veiculo {
	
	// Método definido em motocicleta, objetos de carro e caminhão não teram acesso a este método
	// Métodos definidos nas subclasses não são visiveis na superclasse, são específicos das subclasses
	public void empinar() {
		System.out.println("UHU!");
	}
}
