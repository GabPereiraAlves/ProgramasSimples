// Gabriel Pereira Alves - 2°DSN
package Exercicios;
import javax.swing.JOptionPane;
public class IMC {

	public static void main(String[] args) {
		double altura, peso;
		double imc;
		
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura (em metros)"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso (em quilos)"));
		
		imc = peso / (altura * altura);
		
		if(imc < 17) 
		{
			JOptionPane.showMessageDialog(null, imc + " Muito abaixo do peso!");
		}
		else if(imc >= 17 && imc <= 18.9) 
		{
			JOptionPane.showMessageDialog(null, imc +" Abaixo do peso!");
		}
		else if(imc >= 19 && imc <= 26.9) 
		{
			JOptionPane.showMessageDialog(null, imc +" Normal!");
		}
		else if(imc >= 27 && imc <= 31.9) 
		{
			JOptionPane.showMessageDialog(null, imc +" Acima do peso!");
		}
		else if(imc >= 32) 
		{
			JOptionPane.showMessageDialog(null, imc +" Obesidade!");
		}
	}

}
