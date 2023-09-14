package br.com.fiap.beans;

public class Seguro extends Cliente{
	// var
	private int idSeguro;
	private PedalLeve pedalLeve;
	private PedalEssencial pedalEssencial;
	private PedalElite pedalElite;
	// const vazio
	public Seguro() {
		super();
	}
	// const cheio
	public Seguro(PedalLeve pedalLeve, PedalEssencial pedalEssencial, PedalElite pedalElite) {
		super();
		this.pedalLeve = pedalLeve;
		this.pedalEssencial = pedalEssencial;
		this.pedalElite = pedalElite;
	}
	// heranca
	public Seguro(int idCliente, String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda, String profissao,
			CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta, ClientePorto clientePorto,
			Pagamento pagamento, Seguro seguro, Vistoria vistoria, PedalLeve pedalLeve, PedalEssencial pedalEssencial,
			PedalElite pedalElite) {
		super(idCliente, nome, dataDeNascimento, estadoCivil, sexo, renda, profissao, cadastroCliente, cadastroBicicleta,
				clientePorto, pagamento, seguro, vistoria);
		this.pedalLeve = pedalLeve;
		this.pedalEssencial = pedalEssencial;
		this.pedalElite = pedalElite;
	}
	// setters and getters
	public PedalLeve getPedalLeve() {
		return pedalLeve;
	}
	public void setPedalLeve(PedalLeve pedalLeve) {
		this.pedalLeve = pedalLeve;
	}
	public PedalEssencial getPedalEssencial() {
		return pedalEssencial;
	}
	public void setPedalEssencial(PedalEssencial pedalEssencial) {
		this.pedalEssencial = pedalEssencial;
	}
	public PedalElite getPedalElite() {
		return pedalElite;
	}
	public void setPedalElite(PedalElite pedalElite) {
		this.pedalElite = pedalElite;
	}
	public int getIdSeguro() {
		return idSeguro;
	}
	public void setIdSeguro(int idSeguro) {
		this.idSeguro = idSeguro;
	}
}
