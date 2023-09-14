package br.com.fiap.beans;

public class Documentos extends CadastroCliente {
	// var
	private int idDocumentos;
	private String rg;
	private String cpf;
	private String cnh;
	// const vazio
	public Documentos() {
		super();
	}
	// const cheio
	public Documentos(String rg, String cpf, String cnh) {
		super();
		this.rg = rg;
		this.cpf = cpf;
		this.cnh = cnh;
	}
	//heranca
	public Documentos(String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
			String profissao, CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta,
			ClientePorto clientePorto, Pagamento pagamento, Seguro seguro, Vistoria vistoria, Documentos documentos,
			Endereco endereco, Contato contato, String rg, String cpf, String cnh) {
		super(nome, dataDeNascimento, estadoCivil, sexo, cnh, renda, profissao, cadastroCliente, cadastroBicicleta,
				clientePorto, pagamento, seguro, vistoria, documentos, endereco, contato);
		this.rg = rg;
		this.cpf = cpf;
		this.cnh = cnh;
	}
	// setters and getters
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public int getIdDocumentos() {
		return idDocumentos;
	}
	public void setIdDocumentos(int idDocumentos) {
		this.idDocumentos = idDocumentos;
	}
}
