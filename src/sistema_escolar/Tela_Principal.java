package sistema_escolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Tela_Principal {
	
	private static ArrayList<Disciplina> disc = new ArrayList<Disciplina>();
	private static ArrayList<Aluno> aluno = new ArrayList<Aluno>();
	private static ArrayList<Professor> prof = new ArrayList<Professor>();
	private static ArrayList<Util> util = new ArrayList<Util>();
	private static ArrayList<Nota> notas = new ArrayList<Nota>();


	public static void main(String[] args) {
		 int op = 0;
			do {
				op = escolheMenu();
				switch (op) {
				case 1:
					cadastraProfessor();
					break;
				case 2:
					cadastraDisciplina();
					break;
				case 3:
					cadastraAluno();
					break;
				case 4:
					matricula();
					break;
				case 5:
					informarNota();
					break;
				case 6:
					mediaNota();			
					break;
				case 7:
					profcomPos();			
					break;
				}
			}while(op != 8);
		}

		
		private static int escolheMenu() {
			String menu = "1 - Cadastrar Professor;\n"
					+ "2 - Cadastrar Disciplina;\n"
					+ "3 - Cadastrar Aluno;\n"
					+ "4 - Matricula;\n"
					+ "5 - Informa nota do aluno;\n"
					+ "6 - A media do Aluno por materia;\n"
					+" 7 - materia com Professor com pos;\n"
					+ "8 - sair.";
			return Integer.parseInt(JOptionPane.showInputDialog(menu));
		}
		
		private static void cadastraProfessor() {
			prof.add(new Professor());
		
		}
		private static void cadastraDisciplina() {
			Disciplina d = new Disciplina();
			d.cadastrar(prof);
			disc.add(d);
		}
		private static void cadastraAluno() {
			Aluno a = new Aluno();
			a.cadastra();
			aluno.add(a);
		}
		public static void matricula() {
			Aluno a = Util.selecionaAluno(aluno);
			JOptionPane.showMessageDialog(null, "Escolha a materia: ");
			Disciplina d =  Util.selecionaDisciplina(disc);
			a.getDiscMatriculadas().add(d);
		}
		public static void informarNota() {
			Aluno a = Util.selecionaAluno(aluno);
			Disciplina d =  Util.disciplina(a.getDiscMatriculadas());
			Nota n = new Nota();
			n.setDisc(d);
			n.setN1(Double.parseDouble(JOptionPane.showInputDialog("Nota 1")));
			n.setN2(Double.parseDouble(JOptionPane.showInputDialog("Nota 2")));
			n.setN3(Double.parseDouble(JOptionPane.showInputDialog("Nota 3")));
			a.getNotas().add(n)
			;	
		}
		public static void mediaNota() {
			
			StringBuilder result = new StringBuilder("Média do Aluno nas Disciplinas:\n");
		    for (Aluno aluno : aluno) {
		        result.append("Aluno: ").append(aluno.getNome()).append("\n");
		        for (Disciplina disciplina : aluno.getDiscMatriculadas()) {
		            result.append("Disciplina: ").append(disciplina.getNome()).append("\n");
		            double media = aluno.mediaNotas();
		            result.append("Média: ").append(media).append("\n");
		        }
		        result.append("\n");
		    }
		    JOptionPane.showMessageDialog(null, result.toString());
		}
		public static void profcomPos() {
			  StringBuilder discPosGraduacao = new StringBuilder("Disciplinas com professores com Pós Graduação:\n");
			    for (Disciplina disciplina : disc) {
			        if (disciplina.getProfessor() != null && disciplina.getProfessor().getFormacao().equalsIgnoreCase("Pós Graduação")) {
			            discPosGraduacao.append(disciplina.getNome()).append("\n");
			        }
			    }
			    JOptionPane.showMessageDialog(null, discPosGraduacao.toString());
		}

}
