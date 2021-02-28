//Gabriel Pereira Alves - 2°DSN
package teste;
import java.util.Scanner;
public class MaiorOuMenor 
{

	public static void main(String[] args) 
	{
		int num1, num2;
		Scanner in;
		
		System.out.println("Digite um número: ");
		in = new Scanner(System.in);
		num1 = in.nextInt();
		
		System.out.println("Digite outro número: ");
		in = new Scanner(System.in);
		num2 = in.nextInt();
		
		if(num1 > num2) 
		{
			System.out.println(num1 + " é maior que " + num2);
		}
		if(num2 > num1) 
		{
			System.out.println(num2 + " é maior que " + num1);
		}
		if(num1 == num2) 
		{
			System.out.println(num1 + " é igual a " + num2);
		}
	}

}
