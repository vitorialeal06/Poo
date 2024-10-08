package POO;

public class Carro extends Veiculo {

	public void ligar() {
		confereCombustivel();
		confereCambio();
		System.out.println("carro ligado");
	}
	private void confereCombustivel() {
		System.out.println("conferindo combustivel");
	}
	private void confereCambio() {
		System.out.println("cambio em p ok");
	}
	
}
