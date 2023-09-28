package medicacoes;

import javax.swing.JOptionPane;

public class Contraindicacao {
	private Medicamento medicamento;
	
	public void cadastrar() {
		setContraIndicacao(JOptionPane.showInputDialog(null,"Informe a CONTRAINDICAÇAO: "));
		
	}
	
	public Medicamento getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	public String getContraIndicacao() {
		return contraIndicacao;
	}
	public void setContraIndicacao(String contraIndicacao) {
		if(contraIndicacao!="") {
			this.contraIndicacao = contraIndicacao;
		}else {
			setContraIndicacao(JOptionPane.showInputDialog(null,"É nescessário informar a contraindicaçao: "));
		}
	}
	private String contraIndicacao;

}
