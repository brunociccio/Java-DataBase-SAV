package br.com.fiap.beans;

public class CartaoDebito extends Pagamento {
	// var
	private int idCartaoDebito;
	private int numeroCartao;
	private String nomeCartao;
	private String dataVencimento;
	private int codigoSeguranca;
	private String numeroAgencia;
	private String numeroConta;
	private String nomeBanco;
	// const vazio
	public CartaoDebito() {
		super();
	}
	// const cheio
	public CartaoDebito(int numeroCartao, String nomeCartao, String dataVencimento, int codigoSeguranca,
			String numeroAgencia, String numeroConta, String nomeBanco) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeCartao = nomeCartao;
		this.dataVencimento = dataVencimento;
		this.codigoSeguranca = codigoSeguranca;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.nomeBanco = nomeBanco;
	}
	// heranca
	public CartaoDebito(int idCliente, String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
			String profissao, CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta,
			ClientePorto clientePorto, Pagamento pagamento, Seguro seguro, Vistoria vistoria, Boleto boleto, Pix pix,
			CartaoCredito cartaoCredito, CartaoDebito cartaoDebito, int numeroCartao, String nomeCartao,
			String dataVencimento, int codigoSeguranca, String numeroAgencia, String numeroConta, String nomeBanco) {
		super(idCliente, nome, dataDeNascimento, estadoCivil, sexo, renda, profissao, cadastroCliente, cadastroBicicleta,
				clientePorto, pagamento, seguro, vistoria, boleto, pix, cartaoCredito, cartaoDebito);
		this.numeroCartao = numeroCartao;
		this.nomeCartao = nomeCartao;
		this.dataVencimento = dataVencimento;
		this.codigoSeguranca = codigoSeguranca;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.nomeBanco = nomeBanco;
	}
	// setters and getters
	public int getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeCartao() {
		return nomeCartao;
	}
	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public int getCodigoSeguranca() {
		return codigoSeguranca;
	}
	public void setCodigoSeguranca(int codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public int getIdCartaoDebito() {
		return idCartaoDebito;
	}
	public void setIdCartaoDebito(int idCartaoDebito) {
		this.idCartaoDebito = idCartaoDebito;
	}
}
