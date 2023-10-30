package sistema_bancario;

public class Caixa {
	public static boolean depositar(Conta c, double vl){
		return c.depositar(vl);
	}
	public static boolean sacar(Conta c, double vl) {
		return c.sacar(vl);
	}
	public static boolean transferir(Conta um, Conta destino, double vl) {
		return um.transferir(um, destino, vl);
	}
}
