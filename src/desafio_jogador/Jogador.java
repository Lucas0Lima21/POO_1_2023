package desafio_jogador;

import javax.swing.JOptionPane;

public class Jogador {
	private String nome;
	private int camisa;
	private int gols;

	public void cadastrar() {
		setNome(JOptionPane.showInputDialog("Nome do Jogador: "));
		setCamisa(Integer.parseInt(JOptionPane.showInputDialog("Camisa: ")));
		setGols(Integer.parseInt(JOptionPane.showInputDialog("Gols: ")));
	}

	public String exibir() {
		return getNome()+", camisa "+getCamisa()+", com um total "+getGols()+" Gols;\n";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCamisa() {
		return camisa;
	}
	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}
	public int getGols() {
		return gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}

}