//Gabriel Pereira Alves - 1°DSN
using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace Listagem_Carros
{
	public partial class MainForm : Form
	{
		public MainForm()
		{
			InitializeComponent();
		}
		
		void MainFormLoad(object sender, EventArgs e)
		{
			richTextBox1.LoadFile("veiculosIn.txt", RichTextBoxStreamType.PlainText);
		}
		
		void Button1Click(object sender, EventArgs e)
		{
			float[] consumoMedio = new float[richTextBox1.Lines.Length - 1];
			float consumoMedioTotal = 0;
			for(int i = 0; i < richTextBox1.Lines.Length - 1; i++)
			{
				string linha = richTextBox1.Lines[i];
				string[] dados = linha.Split('@');
				consumoMedio[i] = (float.Parse(dados[1]) / float.Parse(dados[2]));
			}
			for(int i = 0; i < consumoMedio.Length;i++)
			{
				consumoMedioTotal = consumoMedioTotal + consumoMedio[i];
			}
			consumoMedioTotal = consumoMedioTotal / consumoMedio.Length;
			for(int i = 0; i < richTextBox1.Lines.Length - 1; i++)
			{
				string linha = richTextBox1.Lines[i];
				string[] dados = linha.Split('@');
				if(consumoMedio[i] > consumoMedioTotal)
				{
					richTextBox2.AppendText(dados[0] + "\n");
				}
			}
			richTextBox2.SaveFile("veiculosOut.txt", RichTextBoxStreamType.PlainText);
		}
	}
}
