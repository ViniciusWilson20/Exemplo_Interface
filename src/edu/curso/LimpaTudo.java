package edu.curso;

public class LimpaTudo implements Faxineira, Lavador {

	@Override
	public void varrer() {
		System.out.println("Limpa Tudo Varrendo");
	}

	@Override
	public void passePano() {
		System.out.println("Limpa tudo Passando Pano");
	}

	@Override
	public void encerar() {
		System.out.println("Limpa Tudo encerando");
	}

	@Override
	public void enxaguar() {

		System.out.println("Limpa Tudo est� Enxaguando");
	}

	@Override
	public void passarEspuma() {

		System.out.println("Limpa Tudo Est� Passando Espuma");

	}

	@Override
	public void aspirar() {

		System.out.println("Limpa Tudo Est� Aspirando");

	}

	@Override
	public void baterPonto() {
		
		System.out.println("Limpa Tudo bater ponto");
		
	}

}
