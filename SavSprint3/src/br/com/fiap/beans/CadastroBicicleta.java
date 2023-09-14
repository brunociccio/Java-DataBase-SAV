package br.com.fiap.beans;

public class CadastroBicicleta extends Cliente {
	// var
	private int idCadastroBicileta;
	private String modelo;
	private String marca;
	private String cor;
	private int ano;
	private double valor;
	private String notaFiscal;
	private Modalidade modalidade;
	private ItensCustomizados itensCustomizados;
	// const vazio
	public CadastroBicicleta() {
		super();
	}
	// const cheio
	public CadastroBicicleta(String modelo, String marca, String cor, int ano, double valor, String notaFiscal,
			Modalidade modalidade, ItensCustomizados itensCostumizados) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
		this.valor = valor;
		this.notaFiscal = notaFiscal;
		this.modalidade = modalidade;
		this.setItensCustomizados(itensCostumizados);
	}
	// heranca
	public CadastroBicicleta(String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
			String profissao, CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta,
			ClientePorto clientePorto, Pagamento pagamento, Seguro seguro, Vistoria vistoria, String modelo,
			String marca, String cor, int ano, double valor, String notaFiscal, Modalidade modalidade,
			ItensCustomizados itensCostumizados2, ItensCustomizados itensCustomizados) {
		super(ano, nome, dataDeNascimento, estadoCivil, sexo, renda, profissao, cadastroCliente, cadastroBicicleta,
				clientePorto, pagamento, seguro, vistoria);
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
		this.valor = valor;
		this.notaFiscal = notaFiscal;
		this.modalidade = modalidade;
		this.itensCustomizados = itensCustomizados;
	}
	// setters and getters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public Modalidade getModalidade() {
		return modalidade;
	}
	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	public int getIdCadastroBicileta() {
		return idCadastroBicileta;
	}
	public void setIdCadastroBicileta(int idCadastroBicileta) {
		this.idCadastroBicileta = idCadastroBicileta;
	}
	public ItensCustomizados getItensCustomizados() {
		return itensCustomizados;
	}
	public void setItensCustomizados(ItensCustomizados itensCustomizados) {
		this.itensCustomizados = itensCustomizados;
	}
	
}
