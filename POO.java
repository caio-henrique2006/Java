class Programa {
    public static void main(String[] args) {
        // Variáveis do programa:
        double sacou = 600.0;
        double depositou = 400.0;
        boolean operacao;

        // Instanciando objeto:
        Conta Caio;
        Caio = new Conta();

        // Instanciando atributos
        Caio.numero = 12345;
        Caio.titular = "Caio Henrique Almeida Ferreira Santos";
        Caio.saldo = 1000.0;
        Caio.limite = 500.0;

        // Exibição:
        System.out.println("Nome do titular: " + Caio.titular);
        System.out.println("Saldo: " + Caio.saldo);
        System.out.println("Sacando: " + sacou + " ...");
        operacao = Caio.saca(sacou);
        if (operacao){
            System.out.println("A operação falhou. Verifique seu saldo ou o limite da conta");
        } else {
            System.out.println("Saldo: " + Caio.saldo);
        }
    }
}

class Conta {
    // Atributos:
    int numero;
    String titular;
    double saldo;
    double limite;

    // Métodos:
    boolean saca(double quantidade) { // Void não retorna nada após a execução do método.
        if (this.saldo < quantidade || quantidade > this.limite) {
            return true;
        } else {
            double novoSaldo = this.saldo - quantidade;
            this.saldo = novoSaldo;
            return false;
        }

    }

    void deposita(double quantidade) {
        double novoSaldo = this.saldo + quantidade;
        this.saldo = novoSaldo;
    }



}