package medicacoes;

import javax.swing.JOptionPane;

public class Pessoa {
	private String nome;
	private String sintoma;
	
	public Pessoa() {
		cadastrar();
	}

	public void cadastrar() {
		setNome(JOptionPane.showInputDialog(null,"informe o nome do panciente: "));
		setSintoma(JOptionPane.showInputDialog(null, "informe o Sintoma: "));
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
