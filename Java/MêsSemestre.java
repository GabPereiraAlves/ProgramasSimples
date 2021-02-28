// Gabriel Pereira Alves - 2°DSN
package Exercicios;
import javax.swing.JOptionPane;

public class MêsSemestre {

	public static void main(String[] args) {
		int mes = 0;
		String input = JOptionPane.showInputDialog("Digite o número do mês");
		
		mes = Integer.parseInt(input);
		
		if(mes < 7 && mes > 0) 
		{
			JOptionPane.showMessageDialog(null, mes + " faz parte do primeiro semestre.");
		}
		else if(mes >= 7 && mes < 13) 
		{
			JOptionPane.showMessageDialog(null, mes + " faz parte do segundo semestre.");
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "O mês digitado é inválido!");
		}

	}

}
