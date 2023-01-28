package testers;
import dataAlgorithms.gregorian;

public class testData {
	public String gregorianTest() {
		int dia = 8;
		int mes = 6;
		int ano = 2004;
		String teste1 = show(dia, mes, ano);
		String esperadoTeste1 = "08/06/2004";
		if(teste1 == "") {
			String resultadoTeste1 = "Sucesso";
		} else {
			String resultadoTeste1 = "!!! FALIA !!! Esperado: " + esperadoTeste1 + " Resultado: " + teste1; 
		}
		return resultadoTeste1;
	}
}