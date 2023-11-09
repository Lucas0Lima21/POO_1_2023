package sistema_farmacia;

public class Cliente {
	protected String nome;
	protected  double saldoDevedor;
	
	public Cliente() {
		this(null, 0);
	}
	public Cliente(String nome, double saldoDevedor) {
		super();
		this.nome = nome;
		this.saldoDevedor = 0;
	}
	public boolean pagar(double vl) {
		saldoDevedor -= vl;
		return true;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldoDevedor() {
		return saldoDevedor;
	}
	public void setSaldoDevedor(double saldoDevedor) {
		this.saldoDevedor = saldoDevedor;
	}
		
	

}
