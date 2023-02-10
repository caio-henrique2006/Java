package conta;
import data.gregorian;

public class Conta {
	private Usuario titular;
	private double saldo;
	private double limite;
	private String identificacao;
	private gregorian dataCriacao;
	static int QContas;
	
	public Conta(Usuario titular, double saldo, double limite, String identificacao, gregorian dataCriacao) {
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
		this.identificacao = identificacao;
		this.dataCriacao = dataCriacao;
		this.QContas += 1;
	}
	
	public String show() {
		String retorno = (this.titular.getName() + "'s Conta:" + 
						  "\nSaldo atual: " + this.saldo + 
						  "\nLimite de saque: " + this.limite +
						  "\nData de criação: " + this.dataCriacao);
		return retorno;
	}
}