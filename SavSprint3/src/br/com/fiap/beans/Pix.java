package br.com.fiap.beans;

public class Pix extends Pagamento{
	// var
	private int idPix;
	private String dataTransacao;
	private int codigoDeBarras;
	// const vazio
	public Pix() {
		super();
	}
	// const cheio
	public Pix(String dataTransacao, int codigoDeBarras) {
		super();
		this.dataTransacao = dataTransacao;
		this.codigoDeBarras = codigoDeBarras;
	}
	// heranca
	public Pix(int idCliente, String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda, String profissao,
			CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta, ClientePorto clientePorto,
			Pagamento pagamento, Seguro seguro, Vistoria vistoria, Boleto boleto, Pix pix, CartaoCredito cartaoCredito,
			CartaoDebito cartaoDebito, String dataTransacao, int codigoDeBarras) {
		super(idCliente, nome, dataDeNascimento, estadoCivil, sexo, renda, profissao, cadastroCliente, cadastroBicicleta,
				clientePorto, pagamento, seguro, vistoria, boleto, pix, cartaoCredito, cartaoDebito);
		this.dataTransacao = dataTransacao;
		this.codigoDeBarras = codigoDeBarras;
	}
	// setters and getters
	public String getDataTransacao() {
		return dataTransacao;
	}
	public void setDataTransacao(String dataTransacao) {
		this.dataTransacao = dataTransacao;
	}
	public int getCodigoDeBarras() {
		return codigoDeBarras;
	}
	public void setCodigoDeBarras(int codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
	public int getIdPix() {
		return idPix;
	}
	public void setIdPix(int idPix) {
		this.idPix = idPix;
	}
}
