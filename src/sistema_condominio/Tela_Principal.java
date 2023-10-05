package sistema_condominio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Tela_Principal {
	private static ArrayList<Apartamento> apartamento = new ArrayList<>();
    private static ArrayList<Despesa> despesa = new ArrayList<>();

    public static void main(String[] args) {
        int op = 0;
        do {
            op = escolheMenu();
            switch (op) {
                case 1:
                	cadastrarApartamento();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    sair();
                    break;
            }
        } while (op != 5);
    }

    private static int escolheMenu() {
        String menu = "1 - Cadastrar aparmento;\n"
                + "2 - Cadastrar conta;\n"
                + "3 - listar conta de cada apartamento;\n"
                + "4 - listar dos valores dos os apartamento;\n"
                + "5 - Sair.";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
    private static void cadastrarApartamento() {
    	apartamento.add(new Apartamento());
    }
    private static void sair() {
        JOptionPane.showMessageDialog(null, "Encerrando o programa.");
        System.exit(0);
    }
}
