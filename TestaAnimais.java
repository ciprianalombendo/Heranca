package br.com.generation.exercicioheranca;

public class TestaAnimais {

	public static void main(String[] args) {

        Cachorro ca1 = new Cachorro();
        Cavalo cav = new Cavalo();
        Preguica pr1 = new Preguica();

        
		
		ca1.setNome("Ruby");
		ca1.setSom("au au au");
		ca1.setIdade(2);
		
		
		cav.setNome("Pocotó");
		cav.setSom("iiirrrrí, rilinchin");
		cav.setIdade(1);
		
		pr1.setNome("Miuque");
		pr1.setSom("ZZZZZzzzzz");
		pr1.setIdade(3);
		
		
		
		
		
		System.out.println("O caChorro tem o nome de: " + ca1.getNome());
		System.out.println("O som que ele emite é: " + ca1.getSom());
		System.out.println("Está com a seguinte Idade: " + ca1.getIdade());
		System.out.println();
		ca1.Correr();
		
		
		System.out.println("O Cavalo tem o nome de: " + cav.getNome());
		System.out.println("O Som que o Cavalo emite é: " + cav.getSom());
		System.out.println("Está com a seguinte Idade: " + cav.getIdade());
		System.out.println();
		cav.Cavalgar();
		
		
		System.out.println("A preguiça tem o nome de: " + pr1.getNome());
		System.out.println("O som que a preguiça emite é: " + pr1.getSom());
		System.out.println("A preguiça Tem a seguinte idade: " + pr1.getIdade());
		System.out.println();
		pr1.Subir();
	}

}
