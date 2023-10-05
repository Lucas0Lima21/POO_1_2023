package sistema_biblioteca;

import javax.swing.JOptionPane;

public class Autor {
	private String nome;
	private Livro livro;
	
	public void cadastrarAutor() {
		setNome(JOptionPane.showInputDialog("informe o nome do autor: "));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome!="") {
			this.nome = nome;
		}else {
			setNome(JOptionPane.showInputDialog("É nescessário informar o nome do Autor: "));
		}
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	
	

}
