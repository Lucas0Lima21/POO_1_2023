package b_carros_objetos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**if(anoInicial <= anoFabricacao &&  anoFinal >= anoFabricacao) {
}
	JOptionPane.showMessageDialog(null, anoFabricacao+", ");**/


public class PrincipalCarro {
	public static void main(String[] args) {
		ArrayList<CarroInicio>carro = new ArrayList<CarroInicio>();
		
		String menu = "1 - Cadastrar\n"
				+"2 - Listar\n"
				+"3 - Listar por fabricação"
				+"4 - sair!";
		
		int op= 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if( op == 1) {
				CarroInicio c = new CarroInicio();
				c.cadastro();
				carro.add(c);
			}
			
			if( op == 2) {
				String result = "Lista de cadastro\n\n";
				for(CarroInicio c: carro) {
					result += c.exibirDado();

				}
				JOptionPane.showMessageDialog(null, result);
			}
			if( op == 3) {
				String reesult = "Lista por cor\n\n";
				for(CarroInicio c: carro) {
					c.listaCor();
					carro.add(c);
					if(c.cor == c.corVista) {
						reesult += c.exibirDado();
				}
				JOptionPane.showMessageDialog(null, reesult);
			}
			}
		}while(op != 4);
	
	}
}
