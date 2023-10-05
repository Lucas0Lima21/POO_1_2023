package sistema_biblioteca;

import javax.swing.JOptionPane;

public class Bibliotecario {
	private String nome;
	private Livro livro;
	
	public void cadastrarBiblio(){
		setNome(JOptionPane.showInputDialog("Informe o nome do bibliotecario: "));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	

}
