package br.com.fiap.beans;

public class Cliente {
	// var
	private int idCliente;
	private String nome;
	private String dataDeNascimento;
	private String estadoCivil;
	private String sexo;
	private double renda;
	private String profissao;
	private CadastroCliente cadastroCliente; 
	private CadastroBicicleta cadastroBicicleta;
	private ClientePorto clientePorto;
	private Pagamento pagamento;
	private Seguro seguro;
	private Vistoria vistoria;
	// const vazio
	public Cliente() {
		super();
	}
	// const cheio
	public Cliente(int idCliente, String nome, String dataDeNascimento, String estadoCivil, String sexo, double renda,
			String profissao, CadastroCliente cadastroCliente, CadastroBicicleta cadastroBicicleta,
			ClientePorto clientePorto, Pagamento pagamento, Seguro seguro, Vistoria vistoria) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
		this.renda = renda;
		this.profissao = profissao;
		this.cadastroCliente = cadastroCliente;
		this.cadastroBicicleta = cadastroBicicleta;
		this.clientePorto = clientePorto;
		this.pagamento = pagamento;
		this.seguro = seguro;
		this.vistoria = vistoria;
	}
	// setters and getters
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public CadastroCliente getCadastroCliente() {
		return cadastroCliente;
	}
	public void setCadastroCliente(CadastroCliente cadastroCliente) {
		this.cadastroCliente = cadastroCliente;
	}
	public CadastroBicicleta getCadastroBicicleta() {
		return cadastroBicicleta;
	}
	public void setCadastroBicicleta(CadastroBicicleta cadastroBicicleta) {
		this.cadastroBicicleta = cadastroBicicleta;
	}
	public ClientePorto getClientePorto() {
		return clientePorto;
	}
	public void setClientePorto(ClientePorto clientePorto) {
		this.clientePorto = clientePorto;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	public Seguro getSeguro() {
		return seguro;
	}
	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}
	public Vistoria getVistoria() {
		return vistoria;
	}
	public void setVistoria(Vistoria vistoria) {
		this.vistoria = vistoria;
	}
}
