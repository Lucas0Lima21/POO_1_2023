package sistema_farmacia;

public class Produto {
	protected String nome;
	protected int estoque;
	protected double valor;
	
	public Produto() {
		this(null,0,0);
	}
	
	public Produto(String nome, int estoque, double valor) {
		super();
		this.nome = nome;
		this.estoque = estoque;
		this.valor = 0;
	}
	
	public String toString() {
		return "Produto:\n"+getNome()+"- valor -"+getValor() +"- estoque -"+getEstoque()+"";
	}
	public boolean vender(Cliente cliente, int qt) {
		if(estoque > 0 && qt < estoque) {
			double valorTotal = qt * valor;
			cliente.setSaldoDevedor(cliente.getSaldoDevedor()- valorTotal);
			return true;
		}else {
			return false;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
		

}
