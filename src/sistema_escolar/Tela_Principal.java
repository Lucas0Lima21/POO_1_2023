package sistema_escolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Tela_Principal {
	public static void main(String[] args) {
		 ArrayList<Disciplina> disc = new ArrayList<Disciplina>();
		 ArrayList<Aluno> aluno = new ArrayList<Aluno>();

		 
		 String menu = "1 - Cadastrar Disciplina;\n"
					+ "2 - Cadastrar aluno;\n"
					+ "3 - Lista ;\n"
					+ "4 - Lista por media do aluno;\n"
					+ "5 - Lista por prof com Pos graduacao;;\n"
					+ "6 -sair.";

			
			int op = 0;
			do {
				op=Integer.parseInt(JOptionPane.showInputDialog(menu));
				
			}while(op == 6);
			
	}

}
