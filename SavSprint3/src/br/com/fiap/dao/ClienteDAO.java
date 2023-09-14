package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Cliente;
import br.com.fiap.conexoes.ConexaoSav;

public class ClienteDAO {
	
	public Connection minhaConexao;
	// método const
	public ClienteDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoSav().conexao();
	}
	// insert
	public String inserir (Cliente cliente) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement(" insert into T_SAV_CLIENTE values (?,?,?,?,?,?,?)");
		stmt.setInt(1, cliente.getIdCliente());;
		stmt.setString(2, cliente.getNome());
		stmt.setString(3, cliente.getDataDeNascimento());
		stmt.setString(4, cliente.getEstadoCivil());
		stmt.setString(5, cliente.getSexo());
		stmt.setDouble(6, cliente.getRenda());
		stmt.setString(7, cliente.getProfissao());
		stmt.execute();
		stmt.close();
		return "Cadastrado com Sucesso!";
	}
}
