package Projeto;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Atividadeavaliativa {

	
	class Livro{
	private String titulo;
	private String Autor;
	private String genero;
	private int anoPublicacao;
	
	public Livro(String titulo, String autor, String genero, int anoPunlicacao) {
		super();
		this.titulo = titulo;
		Autor = autor;
		this.genero = genero;
		this.anoPublicacao = anoPublicacao;
		
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", Autor=" + Autor + ", genero=" + genero + ", anoPublicacao="
				+ anoPublicacao + "]";
	}
	
	class Biblioteca {
		
		private List<Livro>listaDeLivros;
		
		public Biblioteca() {
			listaDeLivros = new ArrayList<>();
		}
		
		
		public void adicionarLivro (Livro Livro) {
			listaDeLivros.add(livro);
		}
		
		public void listarLivros() {//VE COM O PATRICK
			System.out.println("Lista de Livros: ");
			for (Livro Livro : listaDeLivros) {
				System.out.println(Livro);
			}
		}
		
		public void buscarLivroPorTitulo (String titulo) {
			 List<Livro> verificados = new ArrayList<>();
			 
			 for (Livro Livro : listaDeLivros) {
				 if (Livro.getTitulo().equals(titulo)) {
					 verificados.add(Livro);
				 }
		}
			 if(verificados.isEmpty()) {
				 System.out.println("Não foi encontrado nenhum livro com o título: " + titulo); 
			 }else { System.out.println("Livros encontrados:");
		        for (Livro livro : verificados) {
		        	System.out.println(livro);
		        }
				 
			 }
	}
		
	  public void removerLivroPorTitulo(String titulo) {
		  List<Livro> Remover = new ArrayList<>();
		  for(Livro livro : listaDeLivros) {
			  if (livro.getTitulo().equals(titulo)) {
				  Remover.add(livro);
			  }
		  }
		  if(Remover.isEmpty()) {
			  System.out.println("Nenhum livro encontrado com esse titulo :" +titulo);
		  }else {
			  listaDeLivros.removeAll(Remover);
			  System.out.println("livro removido");
		  }
	  }
	  
	  
		
	}
	
	
}
