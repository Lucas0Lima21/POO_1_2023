package medicacoes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tela_Principal {
    private static ArrayList<Medicamento> medicamentos = new ArrayList<>();
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();
    private static ArrayList<Prescricao> prescricoes = new ArrayList<>(); // Lista para armazenar as prescrições

    public static void main(String[] args) {
        int op = 0;
        do {
            op = escolheMenu();
            switch (op) {
                case 1:
                    cadastraMedicamento();
                    break;
                case 2:
                    cadastraPessoa();
                    break;
                case 3:
                    fazerPrescricao();
                    break;
                case 4:
                    listarTodasPessoasComMedicamentos();
                    break;
                case 5:
                    sair();
                    break;
            }
        } while (op != 5);
    }

    private static int escolheMenu() {
        String menu = "1 - Cadastrar Medicamento;\n"
                + "2 - Cadastrar Pessoa;\n"
                + "3 - Fazer Prescrição;\n"
                + "4 - Listar todas as pessoas com medicamentos;\n"
                + "5 - Sair.";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    private static void cadastraMedicamento() {
        medicamentos.add(new Medicamento());
    }

    private static void cadastraPessoa() {
        pessoas.add(new Pessoa());
    }

    private static void fazerPrescricao() {
        Pessoa pessoa = Utill.selecionaPessoa(pessoas);
        Medicamento medicamento = Utill.selecionarMedicamento(medicamentos);

        boolean isIndicated = verificarIndicacao(pessoa, medicamento);
        boolean hasContraindications = verificarContraindicacoes(pessoa, medicamento);

        if (!isIndicated) {
            JOptionPane.showMessageDialog(null, "O sintoma da pessoa não faz parte das indicações do medicamento.");
        } else if (hasContraindications) {
            JOptionPane.showMessageDialog(null, "A pessoa possui contraindicações para este medicamento.");
        } else {
            // If both conditions are met, create a prescription
            Prescricao prescricao = new Prescricao(pessoa, medicamento);
            prescricoes.add(prescricao);
            JOptionPane.showMessageDialog(null, "Prescrição criada com sucesso!");

            // Optional: Display prescription details here if needed.
        }
    }

    private static boolean verificarIndicacao(Pessoa pessoa, Medicamento medicamento) {
        // Implement logic to check if the person's symptom is indicated by the medication.
        // Return true if indicated, false otherwise.
        return true; // Example: Always return true for demonstration.
    }

    private static boolean verificarContraindicacoes(Pessoa pessoa, Medicamento medicamento) {
        // Implement logic to check if the person has any contraindications for the medication.
        // Return true if there are contraindications, false otherwise.
        return false; // Example: Always return false for demonstration.
    }

    private static void listarTodasPessoasComMedicamentos() {
        StringBuilder listaPessoasComMedicamentos = new StringBuilder("Lista de todas as pessoas com medicamentos cadastrados:\n");

        for (Pessoa pessoa : pessoas) {
            listaPessoasComMedicamentos.append("Nome da Pessoa: ").append(pessoa.getNome()).append("\n");

            // Verificar se a pessoa tem algum medicamento associado
            boolean possuiMedicamento = false;
            for (Prescricao prescricao : prescricoes) {
                if (prescricao.getPessoa() == pessoa) {
                    Medicamento medicamento = prescricao.getMedicamento();
                    listaPessoasComMedicamentos.append(" - Medicamento Prescrito: ").append(medicamento.getNome()).append("\n");
                    possuiMedicamento = true;
                }
            }

            if (!possuiMedicamento) {
                listaPessoasComMedicamentos.append(" - Nenhum medicamento cadastrado\n");
            }

            listaPessoasComMedicamentos.append("-----------------------------------\n");
        }

        JOptionPane.showMessageDialog(null, listaPessoasComMedicamentos.toString());
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Encerrando o programa.");
        System.exit(0);
    }
}