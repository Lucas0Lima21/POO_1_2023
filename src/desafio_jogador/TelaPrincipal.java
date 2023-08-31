package desafio_jogador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TelaPrincipal {
	public static void main(String[] args) {
		ArrayList<Time> times = new ArrayList<Time>();
		
		String menu = "1 - Cadastrar time && jogadores ;\n"
				+"2 - Lista de times;\n"
				+"3 - Artilheiro do campeonato;\n"
				+"4 - Time com mais gols;\n\n"
				+"5 - sair.";
		
		int op = 0;
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if(op == 1) {
				Time t = new Time();
				t.cadastrar();
				times.add(t);
				
			}
			if (op == 2) {
				String resultado = "Times cadastrados e seus jogadores: \n\n";
				for(Time t : times) {
					resultado +=t.exibir();
					
				}JOptionPane.showMessageDialog(null, resultado);
			}
			if(op == 3) {
				Jogador art = new Jogador();
                for (Time t: times) {
                    t.artilheiroTime();
                    if (t.artilheiroTime().getGols() > art.getGols()) {
                        art = t.artilheiroTime();
                    }
                }
                JOptionPane.showMessageDialog(null, "Artilheiro do campeonato: "+art.getNome());
			}
			if(op == 4) {
				Time ti = new Time();
                for (Time t: times) {
                    if (t.totalGols() > ti.totalGols()) {
                        ti = t;
                    }
                    
                }
                JOptionPane.showMessageDialog(null, "Time que fez mais gols: "+ti.getNome());
			}
		}while(op !=5); 
		
	}

}


