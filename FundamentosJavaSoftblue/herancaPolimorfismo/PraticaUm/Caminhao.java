package PraticaUm;

public class Caminhao extends Veiculo {
	
	// Sobrescrita de métodos
	// É quando redefinimos um método já declarado na superclasse
	
	@Override
	public void buzinar() {
		System.out.println("FOM FOM");
	}
}
