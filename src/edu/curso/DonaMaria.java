package edu.curso;

public class DonaMaria implements Faxineira {

	@Override
	public void varrer() {
		System.out.println("Dona Maria est� Verrendo");

	}

	@Override
	public void passePano() {
		System.out.println("Dona Maria est� Passando Pano");

	}

	@Override
	public void encerar() {
		System.out.println("Dona Maria est� Encerando");

	}

	@Override
	public void baterPonto() {
		System.out.println("Dona Maria Bater Ponto");

	}

}
