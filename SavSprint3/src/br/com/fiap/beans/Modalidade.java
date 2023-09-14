package br.com.fiap.beans;

public class Modalidade extends CadastroBicicleta{
	// var
	private int idModalidade;
	private MountainBike mountainBike;
	private Urbana urbana;
	private Performance performance;
	// const vazio
	public Modalidade() {
		super();
	}
	// const cheio
	public Modalidade(MountainBike mountainBike, Urbana urbana, Performance performance) {
		super();
		this.mountainBike = mountainBike;
		this.urbana = urbana;
		this.performance = performance;
	}
	// heranca
	public Modalidade(String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
			String profissao, CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta,
			ClientePorto clientePorto, Pagamento pagamento, Seguro seguro, Vistoria vistoria, String modelo,
			String marca, String cor, int ano, double valor, String notaFiscal, Modalidade modalidade,
			ItensCustomizados itensCostumizados, MountainBike mountainBike, Urbana urbana, Performance performance) {
		super(nome, dataDeNascimento, estadoCivil, sexo, renda, profissao, cadastroCliente, cadastroBicicleta,
				clientePorto, pagamento, seguro, vistoria, modelo, marca, cor, ano, valor, notaFiscal, modalidade,
				itensCostumizados, itensCostumizados);
		this.mountainBike = mountainBike;
		this.urbana = urbana;
		this.performance = performance;
	}
	// setters and getters
	public MountainBike getMountainBike() {
		return mountainBike;
	}
	public void setMountainBike(MountainBike mountainBike) {
		this.mountainBike = mountainBike;
	}
	public Urbana getUrbana() {
		return urbana;
	}
	public void setUrbana(Urbana urbana) {
		this.urbana = urbana;
	}
	public Performance getPerformance() {
		return performance;
	}
	public void setPerformance(Performance performance) {
		this.performance = performance;
	}
	public int getIdModalidade() {
		return idModalidade;
	}
	public void setIdModalidade(int idModalidade) {
		this.idModalidade = idModalidade;
	}
}
