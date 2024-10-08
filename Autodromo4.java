package POO;

public class Autodromo {
	public static void main(String[] agrs) {
		Carro carro = new Carro();
		carro.ligar();
		carro.setChassi("desq");
		
		Moto moto = new Moto();
		moto.setChassi("qualquercoisa");
		
		Veiculo coringa = carro;
		coringa.ligar();
	}
}
