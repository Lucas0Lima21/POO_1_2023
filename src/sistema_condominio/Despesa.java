package sistema_condominio;

import javax.swing.JOptionPane;

public class Despesa {
	private String descricao;
	private int ano;
	private int mes;
	private double valor;
	private Apartamento apartamento;
	
	public void cadastrar() {
		setDescricao(JOptionPane.showInputDialog(null, "Informe uma descricao sobre a conta: "));
		setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano da conta: ")));
		setMes(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o mes da conta: ")));
		setValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da conta: ")));
	}	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if (descricao !=null && !descricao.isEmpty()) {
			this.descricao = descricao;
		} else {
		setDescricao (JOptionPane.showInputDialog(null, "Informe uma descrição: "));
		}
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if (ano <= 1970) {
			setAno (Integer.parseInt(JOptionPane.showInputDialog(null, "informe um ano maior ou igual a 1970.\nAqui: ")));
		}
		this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if (mes < 0 && mes >12) {
			setAno (Integer.parseInt(JOptionPane.showInputDialog(null, "informe um mes( 1 à 12 ).\nAqui: ")));
		}

		this.mes = mes;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if (valor < 0 ) {
			setAno (Integer.parseInt(JOptionPane.showInputDialog(null, "informe o valor maior que zero.\nAqui: ")));
		}

		this.valor = valor;
	}

}
