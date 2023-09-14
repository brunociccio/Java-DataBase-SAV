package br.com.fiap.beans;

public class ItensCustomizados extends CadastroBicicleta{
	// var
	private int idItensCustomizados;
	private String nomeDoItem;
	private String descricaoDoItem;
	private double valorDoItem;
	// const vazio
	public ItensCustomizados() {
		super();
	}
	// const cheio
	public ItensCustomizados(String nomeDoItem, String descricaoDoItem, double valorDoItem) {
		super();
		this.nomeDoItem = nomeDoItem;
		this.descricaoDoItem = descricaoDoItem;
		this.valorDoItem = valorDoItem;
	}
	// heranca
	public ItensCustomizados(String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
			String profissao, CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta,
			ClientePorto clientePorto, Pagamento pagamento, Seguro seguro, Vistoria vistoria, String modelo,
			String marca, String cor, int ano, double valor, String notaFiscal, Modalidade modalidade,
			ItensCustomizados itensCostumizados, String nomeDoItem, String descricaoDoItem, double valorDoItem) {
		super(nome, dataDeNascimento, estadoCivil, sexo, renda, profissao, cadastroCliente, cadastroBicicleta,
				clientePorto, pagamento, seguro, vistoria, modelo, marca, cor, ano, valor, notaFiscal, modalidade,
				itensCostumizados, itensCostumizados);
		this.nomeDoItem = nomeDoItem;
		this.descricaoDoItem = descricaoDoItem;
		this.valorDoItem = valorDoItem;
	}
	// setters and getters
	public String getNomeDoItem() {
		return nomeDoItem;
	}
	public void setNomeDoItem(String nomeDoItem) {
		this.nomeDoItem = nomeDoItem;
	}
	public String getDescricaoDoItem() {
		return descricaoDoItem;
	}
	public void setDescricaoDoItem(String descricaoDoItem) {
		this.descricaoDoItem = descricaoDoItem;
	}
	public double getValorDoItem() {
		return valorDoItem;
	}
	public void setValorDoItem(double valorDoItem) {
		this.valorDoItem = valorDoItem;
	}
	public int getIdItensCustomizados() {
		return idItensCustomizados;
	}
	public void setIdItensCustomizados(int idItensCustomizados) {
		this.idItensCustomizados = idItensCustomizados;
	}
}
