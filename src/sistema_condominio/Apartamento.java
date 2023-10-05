package sistema_condominio;

import javax.swing.JOptionPane;

public class Apartamento {
	private int unidade;
	private String bloco;
	private double tamanhoMQuadrado;
	private String nome;
	private final double valor = 5.00;
	
	public Apartamento() {
		cadastrar_Apa();
	}
	
	public void cadastrar_Apa() {
		setUnidade(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o nome do apartamento: ")));
		setBloco(JOptionPane.showInputDialog(null, "Informe o bloco: "));
		setNome(JOptionPane.showInputDialog(null, "Informe o nome do dono do apartamento: "));
		setTamanhoMQuadrado(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o tamanho do apartamento"
				+ " por metro quadrado: " )));
	}
	public int getUnidade() {
		return unidade;
	}
	public void setUnidade(int unidade) {
		if (unidade <= 0) {
			setUnidade(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero maior que zero.\nAqui: ")));
	    }
		this.unidade = unidade;
	}
	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		if(bloco != null && !bloco.isEmpty()) {
			this.bloco = bloco;
		} else {
			setBloco(JOptionPane.showInputDialog("Informe um bloco: "));
		}

	}
	public double getTamanhoMQuadrado() {
		return tamanhoMQuadrado;
	}
	public void setTamanhoMQuadrado(double tamanhoMQuadrado) {
		if (tamanhoMQuadrado <= 0) {
			setTamanhoMQuadrado(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero maior que zero")));
	    }
		this.tamanhoMQuadrado = tamanhoMQuadrado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			setBloco(JOptionPane.showInputDialog("Informe um nome: "));
		}
	}
	public double getValor() {
		return valor;
	}

}
