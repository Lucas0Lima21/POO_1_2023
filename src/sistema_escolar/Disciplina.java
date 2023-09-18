package sistema_escolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Disciplina {
	private String nome;
	private double horas;//carga horaria
	private ArrayList<Professor> prof = new ArrayList<Professor>();
	//*private ArrayList<Aluno> aluno = new ArrayList<Aluno>();

	public void cadastrar() {
		setNome(JOptionPane.showInputDialog("Informe o nome da disciplina: "));
		setHoras(Double.parseDouble(JOptionPane.showInputDialog("infome a quantidade de carga horaria da materia: ")));
		Professor p = new Professor();
		p.cadrastar();
		prof.add(p);
	}
	/*public Aluno AdicionarAluno() {
		Aluno a = new Aluno();
		if(a.getDisciplina()== getNome() ) {
		aluno.add(a);
		}return a;*/
	
	String exibirMat(){
	return "materia " + getNome()  +";\n";
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
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		if(horas < 0) {
			this.horas = horas;			
		}else {
			setHoras(Double.parseDouble(JOptionPane.showInputDialog("voce deve informa a carga horaria maior que 0. Digite aqui: ")));
		}
	}
	public ArrayList<Professor> getProf() {
		return prof;
	}
	public void setProf(ArrayList<Professor> prof) {
		this.prof = prof;
	}
	


}
