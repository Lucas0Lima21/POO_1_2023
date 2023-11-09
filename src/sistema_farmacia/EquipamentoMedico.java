package sistema_farmacia;

public class EquipamentoMedico extends Produto {

	public EquipamentoMedico() {
		super();
	}

	public EquipamentoMedico(String nome, int estoque, double valor) {
		super(nome, estoque, valor);
	}
	
	public boolean vender(Cliente cliente, int qt) {
			cliente.setSaldoDevedor(cliente.getSaldoDevedor() - (valor * qt));
			estoque -= qt;
			return true;
		}
	

}
