package br.com.fiap.main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteArraylistCliente {
	// método static
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
		// arraylist
		ArrayList<Cliente> listaCadastro = new ArrayList<Cliente>();
		Cliente objCliente;
		
		do {
			//entrada
			//(String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
			//String profissao, CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta,
			//ClientePorto clientePorto, Pagamento pagamento, Seguro seguro, Vistoria vistoria)
			objCliente = new Cliente();
			objCliente.setIdCliente(inteiro("Digite seu Id: "));
			objCliente.setNome(texto("Digite seu nome: "));
			objCliente.setDataDeNascimento(texto("Informe sua data de nascimento: "));
			objCliente.setEstadoCivil(texto("Informe seu estado civil: "));
			objCliente.setSexo(texto("Informe seu sexo: "));
			objCliente.setRenda(decimal("Informe a sua renda: "));
			objCliente.setProfissao(texto("Informe sua profissão: "));
			
			listaCadastro.add(objCliente);
			
		} while(JOptionPane.showConfirmDialog(null, "Realizar um novo cadastro?", "Informações Cliente Novo",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		//saída
		for (Cliente c: listaCadastro) {
			System.out.println("Id: " + c.getIdCliente() +
					"Nome: " + c.getNome() +
					"Data Nascimento: " + c.getDataDeNascimento() +
					"Estado civil: " + c.getEstadoCivil() +
					"Sexo: " + c.getSexo() + 
					"Renda: " + c.getRenda() +
					"Profissão: " + c.getProfissao());
		}

	}

}
