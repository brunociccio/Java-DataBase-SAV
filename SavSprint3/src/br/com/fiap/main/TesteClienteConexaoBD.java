package br.com.fiap.main;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.conexoes.ConexaoSav;

public class TesteClienteConexaoBD {
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

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// instanciar objetos
		Connection c = new ConexaoSav().conexao();
		System.out.println("Conectado com o Banco de Dados");
		c.close();
	}

}