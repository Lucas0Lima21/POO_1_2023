package sistema_escolar;

import javax.swing.JOptionPane;

public class Professor {
	private String nome;
	private String formaGradu;//graduação
	private String formaEspecia;//especialização
	private String formaPos;
	
	public void cadrastar() {
		setNome(JOptionPane.showInputDialog("Infome o nome do professor: ").toUpperCase());
		setFormaGradu(JOptionPane.showInputDialog("O professor possui graduacao, se sim, informe a seguir:"));
		String continuar;
		
		do {
			continuar= (JOptionPane.showInputDialog("O professor possui especialização: sim/nao"));
			if(continuar.equalsIgnoreCase("sim"));{
				setFormaEspecia(JOptionPane.showInputDialog("Qual é especializacao: "));
			}
			
			continuar= (JOptionPane.showInputDialog("O professor possui Pós graduacao: sim/nao"));
			if(continuar.equalsIgnoreCase("sim"));{
				setFormaEspecia(JOptionPane.showInputDialog("Qual é especializacao: "));
				
				continuar ="nao";
			}
			JOptionPane.showMessageDialog(null, "você precisa ''digitar'' nao para sair da pag de cadastro do professor.");
			
		}while(continuar.equalsIgnoreCase("nao"));
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome!="") {
			this.nome = nome;
		}else {
			setNome(JOptionPane.showInputDialog("voce precisa informa um nome.Digite aqui: "));
		}
	}

	public String getFormaGradu() {
		return formaGradu;
	}

	public void setFormaGradu(String formaGradu) {
		if(formaGradu!="") {
			this.formaGradu = formaGradu;
		}else {
			setFormaGradu(JOptionPane.showInputDialog("Deve infomar se o nome da graduação que possuir: "));
		}
	}

	public String getFormaEspecia() {
		return formaEspecia;
	}

	public void setFormaEspecia(String formaEspecia) {
		if(formaGradu!="") {
			this.formaEspecia = formaEspecia;		
		}else {
			setFormaEspecia(JOptionPane.showInputDialog("Deve infomar se o nome da especializacao que possuir: "));
		}
	}

	public String getFormaPos() {
		return formaPos;
	}

	public void setFormaPos(String formaPos) {
		if(formaGradu!="") {
			this.formaPos = formaPos;		
		}else {
			setFormaPos(JOptionPane.showInputDialog("Deve infomar se o nome da Pos graduacao que possuir: "));
		}
	}

}
