package model;

public class CartaoCashBack extends CartaoPrePago {
	private int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo, int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}



	public int getTipo() {
		return tipo;
	}



	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	//TIPO 1 = BRONZE / TIPO 2 = SILVER  / TIPO 3 = GOLD
	public boolean comprar(double valor) {
		if(super.saldo >= valor && tipo == 1) {
			saldo = saldo - valor;
			saldo = valor + (valor * 0.02);
			return true;
		}else {
			if(super.saldo >= valor && tipo == 2) {
				saldo = saldo - valor;
				saldo = valor + (valor * 0.05);
				return true;
			}else {
				if(super.saldo >= valor && tipo == 3) {
					saldo = saldo - valor;
					saldo = valor + (valor * 0.08);
					return true;
				}else {
					return false;
				}			
			}	
		}
	}
}
