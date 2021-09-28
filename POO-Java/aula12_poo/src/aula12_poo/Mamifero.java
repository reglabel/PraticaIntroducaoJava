package aula12_poo;

public class Mamifero extends Animal{
	private String corPelo;
	
	public Mamifero(String corPelo, float peso, int idade, int membros) {
		super(peso, idade, membros);
		this.corPelo = corPelo;
	}

	public String toString(String especie) {
		return "\r\n\t--- " + especie + " ---\r\n-> CorPelo: " + corPelo +
				"\r\n-> Peso: " + peso +
				"\r\n-> Idade: " + idade +
				"\r\n-> Membros: " + membros + "\r\n";
	}
	
	@Override
	public String toString() {
		return "\r\n\t--- Mamifero ---\r\n-> CorPelo: " + corPelo +
				"\r\n-> Peso: " + peso +
				"\r\n-> Idade: " + idade +
				"\r\n-> Membros: " + membros + "\r\n";
	}

	@Override
	public void locomover() {
		System.out.println("\r\nR�pido como um jato, veloz como um foguete! Correndo...");
	}

	@Override
	public void alimentar() {
		System.out.println("\r\nMamando...isso � p�lemico...");
	}

	@Override
	public void emitirSom() {
		System.out.println("\r\nSons de mam�fero...d� pra pensar em v�rios...");		
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}
