package sistema_bancario;

public class Conta {
	protected int nr;
	protected int agencia;
	protected String nome;
	protected double saldo;
	
	
	
	
	public Conta() {
		this(0,0,"",0);
	}
	
	public Conta(int nr, int agencia, String nome, double saldo) {
		this.nr = nr;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = 0;
	}
	
	public boolean depositar(double vl) {
		saldo += vl;
		return true;
	}
	
	public boolean sacar(double vl) {
		if(saldo < 0){
			saldo -= vl;
			return true;
		}return false;
	}
	
	public boolean transferir(Conta um, Conta destino, double vl) {
		if(sacar(vl)) {
			if(um.getSaldo()> vl) {
				um.depositar(-vl);
				destino.depositar(vl);
				return true;
			}else {
			um.depositar(vl);
			return true;
		
			}
		}return false;
	}
	
	@Override
	public String toString() {
		return "Conta [nr=" + getNr() + ", agencia=" + getAgencia() + ", nome=" + getNome() + ", saldo=" + getSaldo() + "]\n";
	}

	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
