package sistema_escolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {
	private String nome;
	private double notas;
	private ArrayList<Disciplina> disc = new ArrayList<Disciplina>();

	public void cadastrar() {
		setNome(JOptionPane.showInputDialog("Informe o Nome do aluno: "));
		String continuar;

		do {
			continuar= (JOptionPane.showInputDialog("Deseja cadrastar o aluno em uma disciplina: sim/nao"));
			if(continuar.equalsIgnoreCase("sim"));{
				Disciplina d = new Disciplina();
				String materia= JOptionPane.showInputDialog("Disciplina cadrastada:\n " + d.exibirMat() + "\nInforme a materia"
						+ " que deseja se cadrastar: ");
				if(d.getNome().equalsIgnoreCase(materia)) {
				disc.add(d);
				
				}
			}
			JOptionPane.showMessageDialog(null, "você precisa digitar ''nao'' para sair da pag de cadastro do aluno.");
			
		}while(continuar.equalsIgnoreCase("nao"));
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome!="") {
			this.nome = nome;
		}else {
			setNome(JOptionPane.showInputDialog("voce precisa informa um nome.Digite aqui: "));
		}
	}
	public double getNotas() {
		return notas;
	}
	public void setNotas(double notas) {
		this.notas = notas;
	}
	

}
