//Gabriel Pereira Alves - 1°DSN

using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace ListagemFuncionarios
{
	public partial class MainForm : Form
	{
		public MainForm()
		{
			InitializeComponent();
		}
		
		void Button1Click(object sender, EventArgs e)
		{
			richTextBox1.LoadFile("listaFuncionarios.txt", RichTextBoxStreamType.PlainText);
			button2.Enabled = true;
		}
		
		void Button2Click(object sender, EventArgs e)
		{
			listBox1.Items.Clear();
			string dept = "";
			dept = textBox1.Text;
			if(textBox1.Text == "")
			{
				int total = 0;
				string depart = "";
				for(int i = 0; i < 19; i++)
				{
					string linha = richTextBox1.Lines[i];
					string[] dados = linha.Split(',');
					total = total + int.Parse(dados[2]);
					switch(dados[1])
					{
						case "1":
							depart = "Gerênca";
							break;
						case "2":
							depart = "Vendas";
							break;
						case "3":
							depart = "RH";
							break;
						case "4":
							depart = "Estoque";
							break;
						case "5":
							depart = "Contabil";
							break;
					}
					listBox1.Items.Add(dados[0] + " \t " + depart + " \t Salario: R$" + dados[2]);
					if(i == 18)
					{
						listBox1.Items.Add("Salario total: R$" + total);
					}
				}
			}
			else
			{
				int salario = 0;
				switch(dept)
				{
					case "1":
						for(int i = 0; i < 19; i++)
						{
							string linha = richTextBox1.Lines[i];
							string[] dados = linha.Split(',');
							if(dados[1] == "1")
							{
								salario = salario + int.Parse(dados[2]);
								listBox1.Items.Add(dados[0] + "\tGerência\tR$" + dados[2]);
							}
							if(i == 18)
							{
								listBox1.Items.Add("Salario total: R$" + salario);
							}
						}
						break;
					case "2":
						for(int i = 0; i < 19; i++)
						{
							string linha = richTextBox1.Lines[i];
							string[] dados = linha.Split(',');
							if(dados[1] == "2")
							{
								salario = salario + int.Parse(dados[2]);
								listBox1.Items.Add(dados[0] + "\tVendas\tR$" + dados[2]);
							}
							if(i == 18)
							{
								listBox1.Items.Add("Salario total: R$" + salario);
							}
						}
						break;
					case "3":
						for(int i = 0; i < 19; i++)
						{
							string linha = richTextBox1.Lines[i];
							string[] dados = linha.Split(',');
							if(dados[1] == "3")
							{
								salario = salario + int.Parse(dados[2]);
								listBox1.Items.Add(dados[0] + "\tRecursos Humanos\tR$" + dados[2]);
							}
							if(i == 18)
							{
								listBox1.Items.Add("Salario total: R$" + salario);
							}
						}
						break;
					case "4":
						for(int i = 0; i < 19; i++)
						{
							string linha = richTextBox1.Lines[i];
							string[] dados = linha.Split(',');
							if(dados[1] == "4")
							{
								salario = salario + int.Parse(dados[2]);
								listBox1.Items.Add(dados[0] + "\tEstoque\tR$" + dados[2]);
							}
							if(i == 18)
							{
								listBox1.Items.Add("Salario total: R$" + salario);
							}
						}
						break;
					case "5":
						for(int i = 0; i < 19; i++)
						{
							string linha = richTextBox1.Lines[i];
							string[] dados = linha.Split(',');
							if(dados[1] == "5")
							{
								salario = salario + int.Parse(dados[2]);
								listBox1.Items.Add(dados[0] + "\tContabilidade\tR$" + dados[2]);
							}
							if(i == 18)
							{
								listBox1.Items.Add("Salario total: R$" + salario);
							}
						}
						break;
				}
			}
		}
	}
}
