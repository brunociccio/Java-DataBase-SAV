package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.CadastroBicicleta;

public class TesteVetorCadastroBicicleta {
	//static
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	static float racional(String j) {
		return Float.parseFloat(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		CadastroBicicleta[] vetorCadastroBicicleta = new CadastroBicicleta[10];
		int indice = 0;
		
		do {
			//instanciar
			//(String modelo, String marca, String cor, int ano, double valor, String notaFiscal,
			//Modalidade modalidade, ItensCostumizados itensCostumizados)
			vetorCadastroBicicleta[indice] = new CadastroBicicleta();
			vetorCadastroBicicleta[indice].setIdCadastroBicileta(inteiro("Id: "));
			vetorCadastroBicicleta[indice].setMarca(texto("Marca: "));
			vetorCadastroBicicleta[indice].setModelo(texto("Modelo: "));
			vetorCadastroBicicleta[indice].setAno(inteiro("Ano: "));
			vetorCadastroBicicleta[indice].setValor(decimal("Valor: "));
			vetorCadastroBicicleta[indice].setNotaFiscal(texto("NF: "));
			indice++;
		} while(JOptionPane.showConfirmDialog(null, "Realizar um novo cadastro", "Infomrações do novo cliente",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		for(int contador = 0; contador < indice; contador++) {
			System.out.println("Id: " + vetorCadastroBicicleta[contador].getIdCadastroBicileta() +
					"\nNome: " + vetorCadastroBicicleta[contador].getMarca() +
					"\nData Nascimento: " + vetorCadastroBicicleta[contador].getModelo() +
					"\nEstado civil: " + vetorCadastroBicicleta[contador].getAno() +
					"\nSexo: " + vetorCadastroBicicleta[contador].getValor() + 
					"\nRenda: " + vetorCadastroBicicleta[contador].getNotaFiscal());

	}

	}


	}

