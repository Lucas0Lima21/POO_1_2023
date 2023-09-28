package sistema_escolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {
	private String nome;
	private ArrayList<Disciplina> discMatriculadas = new ArrayList<Disciplina>();
	private ArrayList<Nota> notas = new ArrayList<Nota>();
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome do aluno"));
	}
	public double mediaNotas() {
		double media = 0;
		for (Nota n : notas) {
			
			media=((n.getN1() + n.getN2() + n.getN3())/3);
		}return media;
	}
	
	public String exibirMedia() {
		return getDiscMatriculadas()+": "+ mediaNotas()+";\n";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome!="") {
			this.nome = nome;
		}else {
			setNome(JOptionPane.showInputDialog("É nescessário informar o nome.\nInforme o nome do aluno: "));
		}	}
	public ArrayList<Disciplina> getDiscMatriculadas() {
		return discMatriculadas;
	}
	public void setDiscMatriculadas(ArrayList<Disciplina> discMatriculadas) {
		this.discMatriculadas = discMatriculadas;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

}