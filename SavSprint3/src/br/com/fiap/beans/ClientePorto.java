package br.com.fiap.beans;

public class ClientePorto extends Cliente {
	// var
	private int idClientePorto;
	private int voucherDesconto;
	private double valorDesconto;
	private String dataValidade;
	// const vazio
	public ClientePorto() {
		super();
	}
	// const cheio
	public ClientePorto(int voucherDesconto, double valorDesconto, String dataValidade) {
		super();
		this.voucherDesconto = voucherDesconto;
		this.valorDesconto = valorDesconto;
		this.dataValidade = dataValidade;
	}
	// heranca
	public ClientePorto(String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
			String profissao, CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta,
			ClientePorto clientePorto, Pagamento pagamento, Seguro seguro, Vistoria vistoria, int voucherDesconto,
			double valorDesconto, String dataValidade) {
		super(voucherDesconto, nome, dataDeNascimento, estadoCivil, sexo, renda, profissao, cadastroCliente, cadastroBicicleta,
				clientePorto, pagamento, seguro, vistoria);
		this.voucherDesconto = voucherDesconto;
		this.valorDesconto = valorDesconto;
		this.dataValidade = dataValidade;
	}
	// setters and getters
	public int getVoucherDesconto() {
		return voucherDesconto;
	}
	public void setVoucherDesconto(int voucherDesconto) {
		this.voucherDesconto = voucherDesconto;
	}
	public double getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public int getIdClientePorto() {
		return idClientePorto;
	}
	public void setIdClientePorto(int idClientePorto) {
		this.idClientePorto = idClientePorto;
	}
}
