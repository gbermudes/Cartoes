import model.CartaoCashBack;
import model.CartaoPrePago;

public class AppCartao {
	public static void main(String args[]) {
	
		CartaoPrePago  cpp1      = new CartaoPrePago("11111","Guilherme Bermudes",2027,8,500.0f);
		CartaoCashBack ccbBronze = new CartaoCashBack("11112","Fulano",2027,8,500.0f,1);
		CartaoCashBack ccbSilver = new CartaoCashBack("11113","Ciclano",2027,8,500.0f,2);
		CartaoCashBack ccbGold   = new CartaoCashBack("11114","Beltrano",2027,8,500.0f,3);
		
		System.out.println(cpp1);
		System.out.println(ccbBronze);
		System.out.println(ccbSilver);
		System.out.println(ccbGold);
		
		
		cpp1.adicionarValor(500.0f);
		System.out.println(cpp1);
		
		ccbGold.adicionarValor(1000.f);
		System.out.println(ccbGold);
		
		ccbGold.comprar(50.0f);
		ccbBronze.comprar(50.0f);
		ccbSilver.comprar(50.0f);
		System.out.println(ccbGold);
		System.out.println(ccbBronze);
		System.out.println(ccbSilver);
		
	}
}
