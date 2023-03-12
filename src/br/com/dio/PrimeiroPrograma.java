package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		System.out.println(a+b);
	}

}

class Livros{
	private String nome;
	private String npag;
}