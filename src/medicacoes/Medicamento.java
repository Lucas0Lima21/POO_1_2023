

package medicacoes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Medicamento {
	private String nome;
	private String aplicacao;
	private int nu;
	private ArrayList<Contraindicacao> contraI = new ArrayList<Contraindicacao>();

	public void cadastrar() {
		setNome(JOptionPane.showInputDialog("Informe nome do medicamento: "));
		setNu (Integer.parseInt(JOptionPane.showInputDialog(null,"Informe como é aplicado o medicamento: " + "\n\n1- Injetavel" +
		"\n2- Tópico" + "\n3- Oral")));
		
		if (nu == 1){
			setAplicacao("Injetavel");
		}else if (nu == 2){
			setAplicacao("Topico");
		}else if (nu == 3){
			setAplicacao("Oral");
		}
		
		String continua = "";
		do {
			Contraindicacao c = new Contraindicacao();
			c.cadastrar();
			contraI.add(c);
			continua = JOptionPane
					.showInputDialog("Deseja colocar mais CONTRAINDICAÇAO: Sim/Nao");
		}while(continua.equalsIgnoreCase("Sim"));
	}	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		if(nome!="") {
			this.nome = nome;
		}else {
			setNome(JOptionPane.showInputDialog(null,"É nescessário informar o nome!"));
		}
	}


	public String getAplicacao() {
		return aplicacao;
	}


	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}


	public int getNu() {
		return nu;
	}


	public void setNu(int nu) {
		if(nu >= 1 && nu <=3) {
			this.nu = nu;
		}else {
			setNu (Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um número correspondente! (1/2/3)")));
		}
	}


	
}
