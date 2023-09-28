package medicacoes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Utill {
	public static Pessoa selecionaPessoa (ArrayList<Pessoa> lista) {
		String menuP = "";
		int cont = 1;
		for (Pessoa p : lista) {
			menuP += cont + " - " + p.getNome()+"\n";
			cont ++;
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuP));
		return lista.get(escolha-1);
	}
	public static Medicamento selecionarMedicamento (ArrayList<Medicamento> lista) {
		String menuM = "";
		int cont = 1;
		for (Medicamento m : lista) {
			menuM = cont + " - " + m.getNome()+"\n";
			cont ++;
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuM));
		return lista.get(escolha-1);
	}


}
