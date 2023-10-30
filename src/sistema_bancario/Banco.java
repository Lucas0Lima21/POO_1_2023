package sistema_bancario;

import java.util.ArrayList;

public class Banco {
	public static void main(String[] args) {
		
	ArrayList<Conta> contas = new ArrayList<Conta>();
	contas.add(new Conta(1, 1, "CORRENTE", 0));
	contas.add(new ContaEspecial(2, 2, "ESPECIAL", 0, 1000));
	contas.add(new ContaUniversitaria(3, 3, "UNIVERSITÁRIA", 0));
	
	Caixa.depositar(contas.get(1), 100);
	Caixa.depositar(contas.get(2), 1000);
	Caixa.sacar(contas.get(2), 560);
	
	Caixa.transferir(contas.get(0), contas.get(1), 1200);
	Caixa.transferir(contas.get(2), contas.get(1), 1200);
	Caixa.transferir(contas.get(1), contas.get(2), 1200);
	
	System.out.println(contas.get(0));
	System.out.println(contas.get(1));
	System.out.println(contas.get(2));
	}
}

