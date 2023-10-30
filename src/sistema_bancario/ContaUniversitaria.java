package sistema_bancario;

public class ContaUniversitaria extends Conta {

	public ContaUniversitaria() {
		super();
	}

	public ContaUniversitaria(int nr, int agencia, String nome, double saldo) {
		super(nr, agencia, nome, saldo);
	}

	@Override
	public boolean depositar(double vl) {
		if(saldo + vl < 2000) {
			saldo += vl;
			return true;
		}return false;
	}
	
	

}
