// Gabriel Pereira Alves - 2°DSN
package Exercicios;
import javax.swing.JOptionPane;
public class MesPorExtenso {

	public static void main(String[] args) {
		int input;
		String mes = "";
		
		input = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de um mês:"));
		
		switch(input) 
		{
		case 1:
			mes = "Janeiro";
			break;
		case 2:
			mes = "Fevereiro";
			break;
		case 3:
			mes = "Março";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Maio";
			break;
		case 6:
			mes = "Junho";
			break;
		case 7:
			mes = "Julho";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Setembro";
			break;
		case 10:
			mes = "Outubro";
			break;
		case 11:
			mes = "Novembro";
			break;
		case 12:
			mes = "Dezembro";
			break;
		}
		if(input > 0 && input < 13) 
		{
			JOptionPane.showMessageDialog(null, "O " + input + "° mês do ano é " + mes);
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "O mês digitado é inválido!");
		}
	}

}
