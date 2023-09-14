package br.com.fiap.beans;

public class Performance extends Modalidade{
	// var
	private int idPerformance;
	private String descricaoBicicleta;
	private String finalidadeBicicleta;
	// const vazio
	public Performance() {
		super();
	}
	// const cheio
	public Performance(String descricaoBicicleta, String finalidadeBicicleta) {
		super();
		this.descricaoBicicleta = descricaoBicicleta;
		this.finalidadeBicicleta = finalidadeBicicleta;
	}
	// heranca
	public Performance(String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
			String profissao, CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta,
			ClientePorto clientePorto, Pagamento pagamento, Seguro seguro, Vistoria vistoria, String modelo,
			String marca, String cor, int ano, double valor, String notaFiscal, Modalidade modalidade,
			ItensCustomizados itensCostumizados, MountainBike mountainBike, Urbana urbana, Performance performance,
			String descricaoBicicleta, String finalidadeBicicleta) {
		super(nome, dataDeNascimento, estadoCivil, sexo, renda, profissao, cadastroCliente, cadastroBicicleta,
				clientePorto, pagamento, seguro, vistoria, modelo, marca, cor, ano, valor, notaFiscal, modalidade,
				itensCostumizados, mountainBike, urbana, performance);
		this.descricaoBicicleta = descricaoBicicleta;
		this.finalidadeBicicleta = finalidadeBicicleta;
	}
	// setters and getters 
	public String getDescricaoBicicleta() {
		return descricaoBicicleta;
	}
	public void setDescricaoBicicleta(String descricaoBicicleta) {
		this.descricaoBicicleta = descricaoBicicleta;
	}
	public String getFinalidadeBicicleta() {
		return finalidadeBicicleta;
	}
	public void setFinalidadeBicicleta(String finalidadeBicicleta) {
		this.finalidadeBicicleta = finalidadeBicicleta;
	}
	public int getIdPerformance() {
		return idPerformance;
	}
	public void setIdPerformance(int idPerformance) {
		this.idPerformance = idPerformance;
	}
}
