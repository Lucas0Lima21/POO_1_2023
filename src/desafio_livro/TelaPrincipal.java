package desafio_livro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TelaPrincipal {
	public static void main(String[] args) {
		ArrayList<Livro> livros = new ArrayList<Livro>();
		
		String menu = "1 - Cadastrar livro/autor;\n"
				+ "2 - Lista;\n"
				+ "3 - Lista por autor;\n"
				+ "4 - Lista por valor;\n"
				+ "5 - Lista por filho >=12;\n"
				+ "6 - Lista por genero;\n\n"
				+ "7 -sair.";

		
		int op = 0;
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog(menu));
		
			if(op == 1) {
				Livro l = new Livro();
				l.cadastralivro();
				livros.add(l);
				
			
			
			}
			if (op == 2) {
				String resultado = "Titulos:\n\n";
				for(Livro a : livros) {
					resultado +=a.exibir();
					
				}JOptionPane.showMessageDialog(null, resultado);
			}
			if (op == 3) {
				String result = "Informações do Autor\n";
				String nome = JOptionPane.showInputDialog(null, "Informe o nome do autor: ");
				for (Livro A : livros) {
			        for (Autor autor : A.getAutores()) {
			            if (nome.equalsIgnoreCase(autor.getNome())) {
			                result += autor.exibir() + "\nLivros associados:\n";

			                for (Livro livroAutor : livros) {
			                    for (Autor autorLivro : livroAutor.getAutores()) {
			                        if (nome.equalsIgnoreCase(autorLivro.getNome())) {
			                            result += livroAutor.getTitulo() + "\n";
			                        }
			                    }
			                }
			            }
			        }
			    }
			    JOptionPane.showMessageDialog(null, result);
			}
			if (op == 4) {
				double minValor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor minimo que deseja pesquisar: "));
				double maxValor = Double.parseDouble(JOptionPane.showInputDialog("informe o valor maximo que deseja pesquisar: "));
				for(Livro A : livros) {
					if(minValor <= A.getPreço() && maxValor >= A.getPreço()) {
						JOptionPane.showMessageDialog(null, A.exibir());
					}
				}
			}
			if (op == 5) {
				for (Livro A : livros) {
			        for (Autor autor : A.getAutores()) {
			        	if(autor.getIdade()>=12) {
			        		JOptionPane.showMessageDialog(null, A.exibir());
			        	}
			        }
				}
			}
			if (op == 6) {
				String nome = JOptionPane.showInputDialog(null, "Informe o genero do autor: ");

				for (Livro A : livros) {
			        for (Autor autor : A.getAutores()) {
			        	if(nome.equalsIgnoreCase(autor.getSexo()) ) {
			        		JOptionPane.showMessageDialog(null, A.exibir());
			        	}
			        }
				}
			}
		}while(op!=7);
	}
}
