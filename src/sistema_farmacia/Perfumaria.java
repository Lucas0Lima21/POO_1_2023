package sistema_farmacia;

public class Perfumaria extends Produto {

	public Perfumaria() {
		super();
	}

	public Perfumaria(String nome, int estoque, double valor) {
		super(nome, estoque, valor);
	}
	 
	@Override
	public boolean vender(Cliente cliente, int qt) {
		if (getEstoque() > qt && cliente.getSaldoDevedor() > -100) {
			cliente.setSaldoDevedor(cliente.getSaldoDevedor() - (valor * qt));
			estoque -= qt;
			return true;
		} else {
			System.out.println("Sua divida está acima 100, à compra não sera efetuada.");
			return false;
		}
	}

}
