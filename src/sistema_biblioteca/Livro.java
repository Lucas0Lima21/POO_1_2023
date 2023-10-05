package sistema_biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Livro {
	private String titulo;
	private Autor autor;
	private Bibliotecario bibliotecario;
	
	public void cadastrarLivro(ArrayList<Autor> autores ) {
		setTitulo(JOptionPane.showInputDialog("Informe o nome do livro: "));
		
		String menuAutor = "";
		int cont = 1;  
		for (Autor a : autores) {
		menuAutor += cont + " - " + a.getNome()+"\n";
			cont ++;
		}
		int escolhaAutor = Integer.parseInt(JOptionPane.showInputDialog(menuAutor));
		setAutor(autores.get(escolhaAutor - 1));
	}
		/*String menuBibliotecario = "";
		int conta = 1;  
		for (Bibliotecario b : biblio) {
		menuBibliotecario += conta + " - " + b.getNome()+"\n";
			conta ++;
		}
		int escolhaBibliotecario = Integer.parseInt(JOptionPane.showInputDialog(menuBibliotecario));
		setBibliotecario(biblio.get(escolhaBibliotecario - 1));
		}*/
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}
	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	} 

}
