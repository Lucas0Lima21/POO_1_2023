package b_carros_objetos;

import javax.swing.JOptionPane;

public class CarroInicio {
	
	String marca, marcaVista, cor, corVista;
	int anoFabricacao, anoInicial, anoFinal;
	
	void cadastro() {
		marca = JOptionPane.showInputDialog("olá, informe a marca do seu veiculo: ").toUpperCase();
		anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabricação do carro: "));
		cor = JOptionPane.showInputDialog("informe a cor que era do veiculo que possuia: ").toUpperCase();
	
	}
	
	String listaFabricacao() {
		anoInicial = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano inicial que deseja pesquisar sobre os carros: "));
		anoFinal = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano final que deseja pesquisar sobre os carros: "));
	
		return listaFabricacao();
		
	}
	void listaMarca() {
		marcaVista = JOptionPane.showInputDialog("Informe a marca que deseja ver: ");
	
		
	}
	String listaCor() {
		corVista = JOptionPane.showInputDialog("informe a cor que deseja ver: ");
		
		return listaCor();
	}
	
	String exibirDado() {
		return marca + ", o ano " + anoFabricacao + " e a cor " + cor +".\n";
	}
}
