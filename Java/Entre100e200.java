// Gabriel Pereira Alves - 2°DSN
package Exercicios;
import javax.swing.JOptionPane;

public class Entre100e200 {

	public static void main(String[] args) {
		int valor = 0;
		String input;
		int resto2, resto3;
		String resultado = "";
		
		input = JOptionPane.showInputDialog("Digite um numero entre 100 e 200:");
		valor = Integer.parseInt(input);
		
		resto2 = valor % 2;
		resto3 = valor % 3;
		
		if(resto2 == 0) 
		{
			resultado = valor + " é divisivel por 2.";
		}
		if(resto3 == 0) 
		{
			resultado = valor + " é divisivel por 3.";
		}
		if(resto2 != 0  && resto3 != 0) 
		{
			resultado = valor + " Não é divisivel por 2 nem por 3!";
		}
		JOptionPane.showMessageDialog(null, resultado);
	}

}
