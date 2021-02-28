using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace Calculo_IMC
{
	public partial class MainForm : Form
	{
		public MainForm()
		{
			InitializeComponent();
		}
		
		void Button1Click(object sender, EventArgs e)
		{
			float altura, peso, imc;
			peso = float.Parse(textBox1.Text);
			altura = float.Parse(textBox2.Text);
			imc = (altura * altura) / peso;
			label4.Text = imc.ToString();
			if(imc < 18.5){
				label5.Text = "Abaixo do Peso!";
			}
			if((imc >= 18.5) && (imc <= 24.9)){
				label5.Text = "Peso Ideal!";
			}
			if((imc >= 25) && (imc <= 29.9)){
				label5.Text = "Acima do Peso!";
			}
			if((imc >= 30) && (imc <= 34.9)){
				label5.Text = "Obesidade!";
			}
			if(imc > 35){
				label5.Text = "Obesidade Mórbida!";
			}
		}
	}
}
