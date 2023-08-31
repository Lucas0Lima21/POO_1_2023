package desafio_livro;

import javax.swing.JOptionPane;

public class Autor {
	private String nome;
	private String sexo;
	private int idade;
	private String filho;
	private int idFilho =1000;
	
	public void cadastrar() {
		setNome(JOptionPane.showInputDialog("Informe nome e sobrenome do autor: "));
		setSexo(JOptionPane.showInputDialog("Informe sexo: masculino ou feminino "));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe idade: ")));
		
		String continua = "";
	
			do {
					
				setFilho(JOptionPane.showInputDialog("Possui filho: Sim/Nao"));
				continua = getFilho();
					if(getFilho().equalsIgnoreCase("sim")) {
						String filho = "";
						do {
							int iidade=Integer.parseInt(JOptionPane.showInputDialog("informe a idade do seu filho: "));								
							if(iidade<=idFilho && iidade>0 && iidade<=getIdade()) {
								idFilho = iidade;							
								}else {
									JOptionPane.showMessageDialog(null, "A idade é invalida, por ser numero negativo ou mais velho que o pai");
								}
								filho = JOptionPane.showInputDialog("Desejar cadrastar outro filho: sim/ nao");
						}while(filho.equalsIgnoreCase("sim"));
						continua = filho;
						}	
				
	    	}while(continua.equalsIgnoreCase("sim"));
		
	}String exibir(){
		return "autor " + getNome() + ", do sexo " + getSexo() +", que tem a idade de " + getIdade() + " anos, possui filho: "+ getFilho() +";\n";
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		String[] partesNome = nome.split(" ");
        if (partesNome.length == 2) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, "O nome deve conter duas palavras (nome e sobrenome).");
        }
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if (sexo.equalsIgnoreCase("Masculino") || sexo.equalsIgnoreCase("Feminino")) {
            this.sexo = sexo;
        } else {
            JOptionPane.showMessageDialog(null, "O sexo deve ser Masculino ou Feminino.");
        }
	}
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade>0 && idade<120) {
		this.idade = idade;
		
		}else {
			JOptionPane.showMessageDialog(null, "A idade esta invalida");

		}
	}

	public String getFilho() {
		return filho;
	}

	public void setFilho(String filho) {
		this.filho = filho;
		
	}

	public int getIdFilho() {
		
		return idFilho;
	}

	public void setIdFilho(int idFilho) {
		if(this.idFilho >=0 && this.idFilho <=100) {
		this.idFilho = idFilho;
		}else {
			JOptionPane.showMessageDialog(null, "A idade esta invalida");

		}
	}
	
}
