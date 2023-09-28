package medicacoes;

import javax.swing.JOptionPane;

public class Indicacao {
	private Pessoa pessoa;
	private String indicacao;
	
	public void cadastrarInd() {
		setIndicacao(JOptionPane.showInputDialog("Informe as indicações: "));
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getIndicacao() {
		return indicacao;
	}
	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}
	

}
