import conta.Conta;
import conta.Usuario;
import data.gregorian;

class Main {
	public static void main(String[] args) {
		Usuario usuario001 = new Usuario ("Caio Henrique Almeida Ferreira Santos");
		gregorian dataCriacao001 = new gregorian();
		Conta conta001 = new Conta(usuario001, 1000.0, 400.0, "001", dataCriacao001);
		
		System.out.println(conta001.show());
		
		
	}
}