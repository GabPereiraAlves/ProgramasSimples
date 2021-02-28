//Gabriel Pereira Alves - 2°DSN
package teste;
import java.util.Scanner;
public class Calculadora 
{

	public static void main(String[] args) 
	{
		float num1, num2;
		int selecao;
		float resultado = 0;
		Scanner input;
		
		System.out.println("Digite o primeiro valor: ");
		input = new Scanner(System.in);
		num1 = input.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		input = new Scanner(System.in);
		num2 = input.nextFloat();
		
		System.out.println("Escolha:\n1-Soma\n2-SUbtração\n3-Multiplicação\n4-Divisão");
		input = new Scanner(System.in);
		selecao = input.nextInt();
		
		switch(selecao) 
		{
			case 1:
				resultado = num1 + num2;
				break;
			case 2:
				resultado = num1 - num2;
				break;
			case 3:
				resultado = num1 * num2;
				break;
			case 4:
				resultado = num1 / num2;
				break;
			default:
				System.out.println("Seleção Inválida!");
				break;
		}
		System.out.println("Resultado: " + resultado);
	}
}
