package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteVetorCliente {
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
		Cliente[] vetorCliente = new Cliente[10];
		int indice = 0;
		
		do {
			//instanciar
			//(String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
			//String profissao, CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta,
			//ClientePorto clientePorto, Pagamento pagamento, Seguro seguro, Vistoria vistoria)
			vetorCliente[indice] = new Cliente();
			vetorCliente[indice].setIdCliente(inteiro("Informe o seu ID: "));
			vetorCliente[indice].setNome(texto("Informe seu nome: "));
			vetorCliente[indice].setDataDeNascimento(texto("Informe sua data de nascimento: "));
			vetorCliente[indice].setEstadoCivil(texto("Informe seu estado civil: "));
			vetorCliente[indice].setSexo(texto("Informe seu sexo: "));
			vetorCliente[indice].setRenda(decimal("Informe a sua renda: "));
			vetorCliente[indice].setProfissao(texto("Informe a sua profissão: "));
			indice++;
		} while(JOptionPane.showConfirmDialog(null, "Realizar um novo cadastro", "Infomrações do novo cliente",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		for(int contador = 0; contador < indice; contador++) {
			System.out.println("Id: " + vetorCliente[contador].getIdCliente() +
					"\nNome: " + vetorCliente[contador].getNome() +
					"\nData Nascimento: " + vetorCliente[contador].getDataDeNascimento() +
					"\nEstado civil: " + vetorCliente[contador].getEstadoCivil() +
					"\nSexo: " + vetorCliente[contador].getSexo() + 
					"\nRenda: " + vetorCliente[contador].getRenda() +
					"\nProfissão: " + vetorCliente[contador].getProfissao());

	}

	}
}
