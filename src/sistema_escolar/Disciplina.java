package sistema_escolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Disciplina {
	private String nome;
	private double cargaHoras;
	private Professor professor;

	public void cadastrar(ArrayList<Professor> prof ) {
		setNome(JOptionPane.showInputDialog("Informe o nome da disciplina: "));
		setCargaHoras(Double.parseDouble(JOptionPane.showInputDialog("infome a quantidade de carga horaria da materia: ")));
		
		String menuProf = "";
		int cont = 1;  
		for (Professor p : prof) {
		menuProf += cont + " - " + p.exibirDados()+"\n";
			cont ++;
		}
		int escolhaProf = Integer.parseInt(JOptionPane.showInputDialog(menuProf));
		setProfessor(prof.get(escolhaProf - 1));
	}
	
	public String exibirDados() {
		return getNome()+"("+getCargaHoras()+ ") - " + getProfessor().exibirDados();
	}
	
	public String exibirMat(){
	return getNome()  +";\n";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.equals("")) {
			setNome(JOptionPane.showInputDialog("voce precisa informa um nome. Digite aqui: "));

		}else {
			this.nome = nome;
		}
	}
	public double getCargaHoras() {
		return cargaHoras;
	}
	public void setCargaHoras(double cargaHoras) {
		if(cargaHoras > 0) {
			this.cargaHoras = cargaHoras;			
		}else {
			setCargaHoras(Double.parseDouble(JOptionPane.showInputDialog("voce deve informa a carga horaria maior que 0. Digite aqui: ")));
		}
	}
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	


}
