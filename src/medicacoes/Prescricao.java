package medicacoes;

public class Prescricao {
    private Pessoa pessoa;
    private Medicamento medicamento;

    public Prescricao(Pessoa pessoa, Medicamento medicamento) {
        this.pessoa = pessoa;
        this.medicamento = medicamento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }
}