package sistema_escolar;

import javax.swing.JOptionPane;

public class Nota {
	private Disciplina disc;
	private double n1;
	private double n2;
	private double n3;
	private double mediaNotas;
	
	
	public double getMediaNotas() {
		return mediaNotas;
	}
	public void setMediaNotas(double mediaNotas) {
		if(mediaNotas == ( getN1() + getN2() + getN3() ) / 3) {
			this.mediaNotas = mediaNotas;			
		}
	}
	public Disciplina getDisc() {
		return disc;
	}
	public void setDisc(Disciplina disc) {
		this.disc = disc;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		if(n1<=0 && n1>=10) {	
		this.n1 = n1;
		}else {
			setN1(Integer.parseInt(JOptionPane.showInputDialog("voce deve informa uma nota de 0 a 10: ")));
		}
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		if(n2<=0 && n2>=10) {	
			this.n2 = n2;
			}else {
				setN2(Integer.parseInt(JOptionPane.showInputDialog("voce deve informa uma nota de 0 a 10: ")));
			}
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		if(n3<=0 && n3>=10) {	
			this.n3 = n3;
			}else {
				setN3(Integer.parseInt(JOptionPane.showInputDialog("voce deve informa uma nota de 0 a 10: ")));
			}
	}

}
