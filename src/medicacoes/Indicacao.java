package medicacoes;

import javax.swing.JOptionPane;

public class Indicacao {
	private Medicamento medicamento;
	private String indicacao;
	
	public void cadastrarInd() {
		setIndicacao(JOptionPane.showInputDialog("Informe as indicações: "));
	}
	
	public Medicamento getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	public String getIndicacao() {
		return indicacao;
	}
	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}
	

}
