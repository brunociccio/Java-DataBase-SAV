package br.com.fiap.beans;

public class CadastroCliente extends Cliente{
	// var
	private int idCadastroCliente;
	private Documentos documentos;
	private Endereco endereco;
	private Contato contato;
	// const vazio
	public CadastroCliente() {
		super();
	}
	// const cheio
	public CadastroCliente(Documentos documentos, Endereco endereco, Contato contato) {
		super();
		this.documentos = documentos;
		this.endereco = endereco;
		this.contato = contato;
	}
	// heranca
	public CadastroCliente(String idCliente, String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
			String profissao, CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta,
			ClientePorto clientePorto, Pagamento pagamento, Seguro seguro, Vistoria vistoria, Documentos documentos,
			Endereco endereco, Contato contato) {
		super();
		this.documentos = documentos;
		this.endereco = endereco;
		this.contato = contato;
	}
	// setters and getters
	public Documentos getDocumentos() {
		return documentos;
	}
	public void setDocumentos(Documentos documentos) {
		this.documentos = documentos;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public int getIdCadastroCliente() {
		return idCadastroCliente;
	}
	public void setIdCadastroCliente(int idCadastroCliente) {
		this.idCadastroCliente = idCadastroCliente;
	}
}
