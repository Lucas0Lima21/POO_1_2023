package medicacoes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import sistema_escolar.Aluno;
import sistema_escolar.Disciplina;
import sistema_escolar.Professor;
import sistema_escolar.Util;


public class Tela_Principal {
	private static ArrayList<Medicamento> medicamento = new ArrayList<Medicamento>();
	private static ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();

 
	public static void main(String[] args) {
		 int op = 0;
			do {
				op = escolheMenu();
				switch (op) {
				case 1:
					cadastraMedicamento();
					break;
				case 2:
					cadastraPessoa();
					break;
				case 3:
					prescricao();
					break;
				}
			}while(op != 8);
		}

		
		private static int escolheMenu() {
			String menu = "1 - Cadastrar Medicamento;\n"
					+ "2 - Cadastrar Pessoa;\n"
					+ "3 - Prescrição;\n"
					+ "4 - Todos pessoas com os medicamento;\n"
					+ "5 - sair.";
			return Integer.parseInt(JOptionPane.showInputDialog(menu));
		}
		private static void cadastraMedicamento() {
			Medicamento m = new Medicamento();
			m.cadastrar();
			medicamento.add(m);		
		}
		private static void cadastraPessoa() {
			Pessoa p = new Pessoa();
			p.cadastrar();
			pessoa.add(p);	
		}
		private static void prescricao() {
			Pessoa p = Utill.selecionaPessoa(pessoa);
			Medicamento m =  Utill.selecionarMedicamento(medicamento);
		}
		private static void todos() {
			
		}

}
