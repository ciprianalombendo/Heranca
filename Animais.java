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
		System.out.println("O cachorro est� correndo.... ");
	}
	void Cavalgar() {
		System.out.println("O Cavalo esta calvangando...");
	}
	void Subir() {
		System.out.println("A pregui�a est� a subir em �rvores....");
	}

}
