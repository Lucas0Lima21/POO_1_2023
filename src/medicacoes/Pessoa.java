package medicacoes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pessoa {
	private String nome;
	private String sintoma;
	private ArrayList<Indicacao> indicacao = new ArrayList<Indicacao>();

	public void cadastrar() {
		setNome(JOptionPane.showInputDialog(null,"informe o nome do panciente: "));
		setSintoma(JOptionPane.showInputDialog(null, "informe o Sintoma: "));
		
		String continua = "";
		do {
			Indicacao i = new Indicacao();
			i.cadastrarInd();
			indicacao.add(i);
			continua = JOptionPane
					.showInputDialog("Deseja colocar mais INDICAÇAO: Sim/Nao");
		}while(continua.equalsIgnoreCase("Sim"));
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome!="") {
			this.nome = nome;
		}else {
			setNome(JOptionPane.showInputDialog("É nescessário informar o nome!"));
		}
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		if(sintoma != "") {
			this.sintoma = sintoma;
		}else {
			setSintoma(JOptionPane.showInputDialog("É nescessário informar o sintoma do paciente: "));
		}
	}
}
