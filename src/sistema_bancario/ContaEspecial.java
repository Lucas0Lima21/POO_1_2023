package sistema_bancario;

public class ContaEspecial extends Conta {
	
	private double limite;
	public ContaEspecial() {
		super();
	}

	public ContaEspecial(int nr, int agencia, String nome, double saldo, double limite) {
		super(nr, agencia, nome, saldo);
		this.limite = 0;
	}
	@Override
	public boolean sacar(double vl) {
		if(saldo + limite > vl){
			saldo -= vl;
			return true;
		}return false;
	}

	@Override
	public boolean transferir(Conta um, Conta destino, double vl) {
		if(sacar(vl)) {
			if(um.getSaldo()+ limite > vl) {
				um.depositar(-vl);
				destino.depositar(vl);
				return true;
			}else {
			um.depositar(vl);
			return true;
		
			}
		}return false;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}