package br.com.generation.exercicioheranca;

public class Animais { 
	
	private String Nome;
	private String Som;
	private int Idade;
	
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSom() {
		return Som;
	}
	public void setSom(String som) {
		Som = som;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	
	
	void Correr() {
		System.out.println("O cachorro está correndo.... ");
	}
	void Cavalgar() {
		System.out.println("O Cavalo esta calvangando...");
	}
	void Subir() {
		System.out.println("A preguiça está a subir em árvores....");
	}

}
