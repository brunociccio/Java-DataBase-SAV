package br.com.fiap.main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.fiap.beans.CadastroBicicleta;

public class TesteArraylistCadastroBicicleta {
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
		// TODO Auto-generated method stub	
		 
		ArrayList<CadastroBicicleta> listaCadastroBicicleta = new ArrayList<CadastroBicicleta>();
		
		CadastroBicicleta objCadastroBicicleta = new CadastroBicicleta();
		
		do {
			//entrada
			//String modelo, String marca, String cor, int ano, double valor, String notaFiscal,
			//Modalidade modalidade, ItensCostumizados itensCostumizados)
			objCadastroBicicleta = new CadastroBicicleta();
			objCadastroBicicleta.setIdCadastroBicileta(inteiro("Id: "));
			objCadastroBicicleta.setModelo(texto("Modelo: "));
			objCadastroBicicleta.setMarca(texto("Marca: "));
			objCadastroBicicleta.setCor(texto("Cor: "));
			objCadastroBicicleta.setAno(inteiro("Ano: "));
			objCadastroBicicleta.setValor(decimal("Valor: "));
			objCadastroBicicleta.setNotaFiscal(texto("Nota Fiscal: "));
			
			listaCadastroBicicleta.add(objCadastroBicicleta);
			
		} while(JOptionPane.showConfirmDialog(null, "Realizar um novo Cadastro?", "Cadastro nova bicicleta",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		for(CadastroBicicleta c: listaCadastroBicicleta) {
			System.out.println("Id: " + c.getIdCadastroBicileta() +
					"\nModelo: " + c.getModelo() +
					"\nMarca: " + c.getMarca() + 
					"\nCor: " + c.getCor() +
					"\nAno: " + c.getAno() + 
					"\nValor: " + c.getValor() + 
					"\nNF: " + c.getNotaFiscal());
		}
		

	}

}
