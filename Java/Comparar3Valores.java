// Gabriel Pereira Alves - 2°DSN
package Exercicios;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class Comparar3Valores {

	public static void main(String[] args) {
		int[] valores = {0,0,0};
		
		valores[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		valores[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		valores[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));
		
		Arrays.sort(valores);
		
		JOptionPane.showMessageDialog(null, "O maior valor digitado foi: " + valores[2]);
	}

}
