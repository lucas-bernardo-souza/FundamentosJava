package ConstrutoresEHeranca;

public class Carro extends Veiculo{
	
	public Carro() {
		super();
		System.out.println("Carro()");
	}
	
	public Carro(String marca) {
		super(marca);
		System.out.println("Carro(String)");
	}

}
