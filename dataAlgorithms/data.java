package dataAlgorithms;

public class gregorian {

	public String show(int dia, int mes, int ano) {
		// Erros:
		if (dia <= 0 || mes <= 0 || ano <= 0) {
			return "Erro: data negativa";
		} else if (dia > 31 || mes > 12) {
			return "Erro: valor da data inválida";
		}
		// Processando dia:
		if (dia <= 9 && dia >= 1) {
			String novoDia = "0" + Integer.toString(dia);
		} else {
			String novoDia = Integer.toString(dia);
		}
		// Processando mês:
		if (mes <= 9 && mes >= 1) {
			String novoMes = "0" + Integer.toString(mes);
		} else {
			String novoMes = Integer.toString(mes);
		}
		String retorno = novoDia + "/" + novoMes + "/" + ano; 
		return retorno;	
	}
}






