package PraticaUm;

public class Aplicacao {
	public static void main(String[] args) {
		
		Veiculo v = new Veiculo();
		v.buzinar();
		
		Carro c = new Carro();
		c.buzinar();
		
		Motocicleta m = new Motocicleta();
		m.buzinar();
		
		Caminhao cam = new Caminhao();
		cam.buzinar();
	}
}
