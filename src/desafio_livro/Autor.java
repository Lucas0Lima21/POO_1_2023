package desafio_livro;

import javax.swing.JOptionPane;

public class Autor {
	private String nome;
	private String sexo;
	private int idade;
	private String filho;
	/*private int idFilho;*/
	
	public void cadastrar() {
		setNome(JOptionPane.showInputDialog("Informe nome e sobrenome do autor: "));
		setSexo(JOptionPane.showInputDialog("Informe sexo: "));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe idade: ")));
		setFilho(JOptionPane.showInputDialog("Possui filho: Sim/Não"));
		/*setIdFilho(Integer.parseInt(JOptionPane.showInputDialog("informe a idade do seu filho: ")));*/
		/**String continua = "";
		do {
			
	    	setFilho(JOptionPane.showInputDialog("Possui filho: Sim/Não"));
	    	if(setFilho("sim")) {
	    		idFilho = Integer.parseInt(JOptionPane.showInputDialog("informe a idade do seu filho: "));
	    		continua = JOptionPane.showInputDialog("Desejar cadastrar outro filho: sim/nao ");
	    	}else {
	    		continua += filho;
	    	}
	    	
	    }while(continua.equalsIgnoreCase("sim"));
		**/
		
	}public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if(this.sexo =="masculino" || this.sexo == "feminino") {
		this.sexo = sexo;
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(this.idade<0 && this.idade>120) {
		this.idade = idade;
		}
	}

	public String getFilho() {
		return filho;
	}

	public void setFilho(String filho) {
		this.filho = filho;
	}

	/**public int getIdFilho() {
		
		return idFilho;
	}

	public void setIdFilho(int idFilho) {
		if(this.idFilho >=0 && this.idFilho <=100) {
		this.idFilho = idFilho;
		}
	}**/
	
}
