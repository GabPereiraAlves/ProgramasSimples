using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace NumeroPorExtenso
{
	public partial class MainForm : Form
	{
		public MainForm()
		{
			InitializeComponent();
		}
		
		void Button1Click(object sender, EventArgs e)
		{
			string tamanho, num1, num2;
			int varSwitch;
			tamanho = textBox1.Text;
			if(tamanho.Length == 1){
				varSwitch = int.Parse(tamanho);
				switch(varSwitch){
					case 0:
						label2.Text = "Zero";
						break;
					case 1:
						label2.Text = "Um";
						break;
					case 2:
						label2.Text = "Dois";
						break;
					case 3:
						label2.Text = "Três";
						break;
					case 4:
						label2.Text = "Quatro";
						break;
					case 5:
						label2.Text = "Cinco";
						break;
					case 6:
						label2.Text = "Seis";
						break;
					case 7:
						label2.Text = "Sete";
						break;
					case 8:
						label2.Text = "Oito";
						break;
					case 9:
						label2.Text = "Nove";
						break;
				}
			}
			else{
				num1 = tamanho[0].ToString();
				num2 = tamanho[1].ToString();
				//Exceções: 10,11,12,13,14,15,16,17,18,19;
				if(num1 == "1" && num2 == "0"){
					label2.Text = "Dez";
				}
				if(num1 == "1" && num2 == "1"){
					label2.Text = "Onze";
				}
				if(num1 == "1" && num2 == "2"){
					label2.Text = "Doze";
				}
				if(num1 == "1" && num2 == "3"){
					label2.Text = "Treze";
				}
				if(num1 == "1" && num2 == "4"){
					label2.Text = "Catorze";
				}
				if(num1 == "1" && num2 == "5"){
					label2.Text = "Quinze";
				}
				if(num1 == "1" && num2 == "6"){
					label2.Text = "Dezesseis";
				}
				if(num1 == "1" && num2 == "7"){
					label2.Text = "Dezessete";
				}
				if(num1 == "1" && num2 == "8"){
					label2.Text = "Dezoito";
				}
				if(num1 == "1" && num2 == "9"){
					label2.Text = "Dezenove";
				}
				//Fim das Exceções
				//Primeiro Digito
				if(num1 == "2"){
					label2.Text = "Vinte";
				}
				if(num1 == "3"){
					label2.Text = "Trinta";
				}
				if(num1 == "4"){
					label2.Text = "Quarenta";
				}
				if(num1 == "5"){
					label2.Text = "Cinquenta";
				}
				if(num1 == "6"){
					label2.Text = "Sessenta";
				}
				if(num1 == "7"){
					label2.Text = "Setenta";
				}
				if(num1 == "8"){
					label2.Text = "Oitenta";
				}
				if(num1 == "9"){
					label2.Text = "Noventa";
				}
				//Segundo Dígito
				if(num1 != "1"){
					if(num2 == "1"){
					label2.Text = label2.Text + " e Um";
					}
					if(num2 == "2"){
					label2.Text = label2.Text + " e Dois";
					}
					if(num2 == "3"){
					label2.Text = label2.Text + " e Três";
					}
					if(num2 == "4"){
					label2.Text = label2.Text + " e Quatro";
					}
					if(num2 == "5"){
					label2.Text = label2.Text + " e Cinco";
					}
					if(num2 == "6"){
					label2.Text = label2.Text + " e Seis";
					}
					if(num2 == "7"){
					label2.Text = label2.Text + " e Sete";
					}
					if(num2 == "8"){
					label2.Text = label2.Text + " e Oito";
					}
					if(num2 == "9"){
					label2.Text = label2.Text + " e Nove";
					}
				}
			}
		}
	}
}
