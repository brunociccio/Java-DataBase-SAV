package br.com.fiap.beans;

public class PedalLeve extends Seguro{
	// var
	private int idPedalLeve;
	private double valorSeguro;
	private String descricaoCoberturas;
	// const vazio
	public PedalLeve() {
		super();
	}
	// const cheio
	public PedalLeve(double valorSeguro, String descricaoCoberturas) {
		super();
		this.valorSeguro = valorSeguro;
		this.descricaoCoberturas = descricaoCoberturas;
	}
	// heranca
	public PedalLeve(int idCliente, String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
			String profissao, CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta,
			ClientePorto clientePorto, Pagamento pagamento, Seguro seguro, Vistoria vistoria, PedalLeve pedalLeve,
			PedalEssencial pedalEssencial, PedalElite pedalElite, double valorSeguro, String descricaoCoberturas) {
		super(idCliente, nome, dataDeNascimento, estadoCivil, sexo, renda, profissao, cadastroCliente, cadastroBicicleta,
				clientePorto, pagamento, seguro, vistoria, pedalLeve, pedalEssencial, pedalElite);
		this.valorSeguro = valorSeguro;
		this.descricaoCoberturas = descricaoCoberturas;
	}
	// setters and getters
	public double getValorSeguro() {
		return valorSeguro;
	}
	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
	public String getDescricaoCoberturas() {
		return descricaoCoberturas;
	}
	public void setDescricaoCoberturas(String descricaoCoberturas) {
		this.descricaoCoberturas = descricaoCoberturas;
	}
	public int getIdPedalLeve() {
		return idPedalLeve;
	}
	public void setIdPedalLeve(int idPedalLeve) {
		this.idPedalLeve = idPedalLeve;
	}
}
