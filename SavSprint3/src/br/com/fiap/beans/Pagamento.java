package br.com.fiap.beans;

public class Pagamento extends Cliente{
	// var
	private int idPagamento;
	private Boleto boleto;
	private Pix pix;
	private CartaoCredito cartaoCredito;
	private CartaoDebito cartaoDebito;
	// const vazio
	public Pagamento() {
		super();
	}
	// const cheio
	public Pagamento(Boleto boleto, Pix pix, CartaoCredito cartaoCredito, CartaoDebito cartaoDebito) {
		super();
		this.boleto = boleto;
		this.pix = pix;
		this.cartaoCredito = cartaoCredito;
		this.cartaoDebito = cartaoDebito;
	}
	// heranca
	public Pagamento(int idCliente,String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
			String profissao, CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta,
			ClientePorto clientePorto, Pagamento pagamento, Seguro seguro, Vistoria vistoria, Boleto boleto, Pix pix,
			CartaoCredito cartaoCredito, CartaoDebito cartaoDebito) {
		super(idCliente, nome, dataDeNascimento, estadoCivil, sexo, renda, profissao, cadastroCliente, cadastroBicicleta,
				clientePorto, pagamento, seguro, vistoria);
		this.boleto = boleto;
		this.pix = pix;
		this.cartaoCredito = cartaoCredito;
		this.cartaoDebito = cartaoDebito;
	}
	// setters and getters
	public Boleto getBoleto() {
		return boleto;
	}
	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}
	public Pix getPix() {
		return pix;
	}
	public void setPix(Pix pix) {
		this.pix = pix;
	}
	public CartaoCredito getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(CartaoCredito cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public CartaoDebito getCartaoDebito() {
		return cartaoDebito;
	}
	public void setCartaoDebito(CartaoDebito cartaoDebito) {
		this.cartaoDebito = cartaoDebito;
	}
	public int getIdPagamento() {
		return idPagamento;
	}
	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}
}
