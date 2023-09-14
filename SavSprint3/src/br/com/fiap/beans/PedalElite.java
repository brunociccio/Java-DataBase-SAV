package br.com.fiap.beans;

public class PedalElite extends Seguro{
	// var
	private int idPedalElite;
	private double valorSeguro;
	private String descricaoCoberturas;
	// const vazio
	public PedalElite() {
		super();
	}
	// const cheio
	public PedalElite(double valorSeguro, String descricaoCoberturas) {
		super();
		this.valorSeguro = valorSeguro;
		this.descricaoCoberturas = descricaoCoberturas;
	}
	// heranca
	public PedalElite(int idCliente, String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
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
	public int getIdPedalElite() {
		return idPedalElite;
	}
	public void setIdPedalElite(int idPedalElite) {
		this.idPedalElite = idPedalElite;
	}
}
