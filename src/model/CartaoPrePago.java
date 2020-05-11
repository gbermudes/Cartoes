package model;

public class CartaoPrePago {
	protected String numeroCartao;
	protected String nomeTitular;
	protected int 	 anoValidade;
	protected int 	 mesValidade;
	protected double saldo;
	public CartaoPrePago(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double adicionarValor(double valor) {
		saldo = saldo + valor;
		return saldo;
	}
	
	public boolean comprar(double valor) {
		if(saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public String toString() {
		return "CartaoPrePago [numeroCartao=" + numeroCartao + ", nomeTitular=" + nomeTitular + ", saldo=" + saldo
				+ "]";
	}
	
	
}
