package br.com.fiap.beans;

public class Contato extends CadastroCliente{
	// var
	private int idContato;
	private String telefoneResidencial;
	private String telefoneCelular;
	private String email;
	// const vazio
	public Contato() {
		super();
	}
	// const cheio
	public Contato(String telefoneResidencial, String telefoneCelular, String email) {
		super();
		this.telefoneResidencial = telefoneResidencial;
		this.telefoneCelular = telefoneCelular;
		this.email = email;
	}
	// heranca
	public Contato(String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
			String profissao, CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta,
			ClientePorto clientePorto, Pagamento pagamento, Seguro seguro, Vistoria vistoria, Documentos documentos,
			Endereco endereco, Contato contato, String telefoneResidencial, String telefoneCelular, String email) {
		super(nome, dataDeNascimento, estadoCivil, sexo, email, renda, profissao, cadastroCliente, cadastroBicicleta,
				clientePorto, pagamento, seguro, vistoria, documentos, endereco, contato);
		this.telefoneResidencial = telefoneResidencial;
		this.telefoneCelular = telefoneCelular;
		this.email = email;
	}
	// setters and getters
	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}
	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdContato() {
		return idContato;
	}
	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}
}
