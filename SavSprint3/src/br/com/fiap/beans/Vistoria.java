package br.com.fiap.beans;

public class Vistoria extends Cliente{	
	// var
	private int idVistoria;
	private String dataVistoria;
	private String listaVistoria;
	// const vazio
	public Vistoria() {
		super();
	}
	// const cheio
	public Vistoria(String dataVistoria, String listaVistoria) {
		super();
		this.dataVistoria = dataVistoria;
		this.listaVistoria = listaVistoria;
	}
	// heranca
	public Vistoria(int idCliente, String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
			String profissao, CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta,
			ClientePorto clientePorto, Pagamento pagamento, Seguro seguro, Vistoria vistoria, String dataVistoria,
			String listaVistoria) {
		super(idCliente, nome, dataDeNascimento, estadoCivil, sexo, renda, profissao, cadastroCliente, cadastroBicicleta,
				clientePorto, pagamento, seguro, vistoria);
		this.dataVistoria = dataVistoria;
		this.listaVistoria = listaVistoria;
	}
	// setters and getters
	public String getDataVistoria() {
		return dataVistoria;
	}
	public void setDataVistoria(String dataVistoria) {
		this.dataVistoria = dataVistoria;
	}
	public String getListaVistoria() {
		return listaVistoria;
	}
	public void setListaVistoria(String listaVistoria) {
		this.listaVistoria = listaVistoria;
	}
	public int getIdVistoria() {
		return idVistoria;
	}
	public void setIdVistoria(int idVistoria) {
		this.idVistoria = idVistoria;
	}
}
