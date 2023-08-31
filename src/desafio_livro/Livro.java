package desafio_livro;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Livro {
	private String titulo;
	private double preço;
	private ArrayList<Autor> autores = new ArrayList<Autor>();
	
	public void cadastralivro() {
		setTitulo (JOptionPane.showInputDialog(null, "Informe o título do livro: ").toLowerCase());
		setPreço (Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço: ")));
		int total = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de autores: "));
		if (total <= 4) {
			for (int i=1; i <= total; i++)	 {
				Autor a = new Autor();
				a.cadastrar();
				autores.add(a);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Não pode ter mais que 4 autores ou menor que 1");
		}
	}
	
	public String exibir() {
		String dados = getTitulo() + "\n" + "R$ " + getPreço() + "\nAutores:\n"; 
				for(Autor a: autores) {
					dados += a.exibir();}
					return dados;
	}
	
	public String getNome() {
		return getNome();
	}
	
	public String getSexo() {
		return getSexo();
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		if (preço > 0) {
            this.preço = preço;
        } else {
            JOptionPane.showMessageDialog(null, "O preço deve ser maior que zero.");
        }
	}

	public ArrayList<Autor> getAutores() {
		return autores;
	}

	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}public void cadastraautor() {
		Autor a = new Autor();
		a.cadastrar();
		autores.add(a);
	}
}