package desafio_contrato;

import javax.swing.*;

public class teste {
    public static void main(String[] args) {
        String menu = "1 - Contratar Funcionário\n"
                	+ "2 - Informações gerais\n"
                	+ "3 - Sair";
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (op == 1) {
                String nome = JOptionPane.showInputDialog(null, "Informe o nome do funcionário");
                int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do funcionário"));
                Funcionario.contratar(nome, idade);

            } else if (op == 2) {
                int totalFuncionarios = Funcionario.getTotalFuncionarios();
                int idadeMinima = Funcionario.getIdadeMinima();
                JOptionPane.showMessageDialog(null, "Total de Funcionários: " + totalFuncionarios + "\nIdade Mínima: " + idadeMinima);

            }
        } while (op != 3);
    }
}