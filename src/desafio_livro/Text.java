package desafio_livro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Text {
	public static void main(String[] args) {
		ArrayList<Autor> autores = new ArrayList<Autor>();
		
		String menu = "1 - Cadastrar autor ;\n"
				+"2 - Ver autor;\n"
				+"3 sair.";
	
		int op = 0;
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog(menu));
		
			if(op == 1) {
				Autor a = new Autor();
				a.cadastrar();
				autores.add(a);
				
			
			
			}
			if (op == 2) {
				String resultado = "Times cadastrados e seus jogadores:\n\n";
				for(Autor a : autores) {
			/**	resultado +=a.exibir();**/
					
				}JOptionPane.showMessageDialog(null, resultado);
			}
		}while(op!=3);
	}
}
