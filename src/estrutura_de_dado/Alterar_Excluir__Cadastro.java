package estrutura_de_dado;

import javax.swing.JOptionPane;


public class Alterar_Excluir__Cadastro {
	private static String[] aluno = new String[100];
    private static int proximoAluno = 0;

    public static void main(String[] args) {
    	
        String menu = "1 - Cadastro de Aluno\n"
                + "2 - Alterar nome de um Aluno\n"
                + "3 - Excluir Cadastro de um Aluno\n"
                + "4 - Lista de Alunos\n"
                + "5 - Sair";
        
        int op = 0;
        do {
        	
        	
        	
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (op == 1) {
            	cadastrarAluno();
            }

            if (op == 2) {
            	alterarnome();
            }

            if (op == 3) {
            	exluirNome();
            }
            
            if (op == 4) {
            	listaAluno();
            }
            
            if (op == 5) {
            	sair();
            	}

        } while (op != 5);
    }
    public static void cadastrarAluno() {
    	String continua= "";
    	do {
    		
    	if (proximoAluno < aluno.length) {
             String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
             aluno[proximoAluno] = nome;
             proximoAluno++;
             JOptionPane.showMessageDialog(null, "Aluno foi cadastrado com sucesso.");
         } else {
             JOptionPane.showMessageDialog(null, "você conseguiu cadastrar o maximo de alunos.");
         }
    	continua = JOptionPane.showInputDialog(null, "você deseja cadastrar mais aluno : sim/ não");
    	}while(continua.equalsIgnoreCase("sim"));
    }
    public static void alterarnome() {
    	listaAluno();
    	int nr = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o numero do aluno que deseja alterar: "));
    	
    	if(nr >0 && nr<= proximoAluno) {
    		String nome =JOptionPane.showInputDialog(null, "Informe  a alteração do nome: ");
    		aluno[nr -1] = nome;
    		JOptionPane.showMessageDialog(null, "Concluido com sucesso a alteração do nome.");
    	}else {
    		JOptionPane.showMessageDialog(null, "Numero informado invalido.");
    	}
    }
    public static void exluirNome() {
    	listaAluno();
    	int nr = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o numero do aluno que deseja excluir: "));
    	
    	if(nr >0 && nr<= proximoAluno) {
    		aluno[nr - 1] = null;
            proximoAluno--;
            for (int i = nr; i < proximoAluno; i++) {
                aluno[i] = aluno[i + 1];
            }

    		JOptionPane.showMessageDialog(null, "O nome foi excluido com sucesso.");
    	}else {
    		JOptionPane.showMessageDialog(null, "Numero informado invalido.");
    	}
    }
    public static void listaAluno() {
    	StringBuilder todos = new StringBuilder("Todos os alunos:\n");
        for (int i = 0; i < proximoAluno; i++) {
        	todos.append(i + 1).append(" - ").append(aluno[i]).append(";\n");
        }
        JOptionPane.showMessageDialog(null, todos.toString());
    }
    private static void sair() {
        JOptionPane.showMessageDialog(null, "Encerrando o programa.");
        System.exit(0);
    }
}
