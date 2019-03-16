package edu.curso;

public class DonaMaria implements Faxineira {

	@Override
	public void varrer() {
		System.out.println("Dona Maria está Verrendo");

	}

	@Override
	public void passePano() {
		System.out.println("Dona Maria está Passando Pano");

	}

	@Override
	public void encerar() {
		System.out.println("Dona Maria está Encerando");

	}

	@Override
	public void baterPonto() {
		System.out.println("Dona Maria Bater Ponto");

	}

}
