package br.com.fiap.beans;

public class Boleto extends Pagamento {
	// var
	private int idBoleto;
	private String dataTransacao;
	private int numeroTransacao;
	// const vazio
	public Boleto() {
		super();
	}
	// const cheio
	public Boleto(String dataTransacao, int numeroTransacao) {
		super();
		this.dataTransacao = dataTransacao;
		this.numeroTransacao = numeroTransacao;
	}
	// heranca
	public Boleto(int idCliente, String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda, String profissao,
			CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta, ClientePorto clientePorto,
			Pagamento pagamento, Seguro seguro, Vistoria vistoria, Boleto boleto, Pix pix, CartaoCredito cartaoCredito,
			CartaoDebito cartaoDebito, String dataTransacao, int numeroTransacao) {
		super(idCliente, nome, dataDeNascimento, estadoCivil, sexo, renda, profissao, cadastroCliente, cadastroBicicleta,
				clientePorto, pagamento, seguro, vistoria, boleto, pix, cartaoCredito, cartaoDebito);
		this.dataTransacao = dataTransacao;
		this.numeroTransacao = numeroTransacao;
	}
	// setters and getters
	public String getDataTransacao() {
		return dataTransacao;
	}
	public void setDataTransacao(String dataTransacao) {
		this.dataTransacao = dataTransacao;
	}
	public int getNumeroTransacao() {
		return numeroTransacao;
	}
	public void setNumeroTransacao(int numeroTransacao) {
		this.numeroTransacao = numeroTransacao;
	}
	public int getIdBoleto() {
		return idBoleto;
	}
	public void setIdBoleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}
}