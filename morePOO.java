class Banco {
    public static void main(String[] args) {

        // Contas:
        Conta conta1;
        conta1 = new Conta();
        conta1.numero = 1;
        conta1.titular = "Caio Henrique Almeida Ferreira Santos";
        conta1.saldo = 2000;
        conta1.limite = 500;

        Conta conta2;
        conta2 = new Conta();
        conta2.numero = 2;
        conta2.titular = "Pedro Gabriel Marques Lopes";
        conta2.saldo = 1000;
        conta2.limite = 500;

        Conta conta3;
        conta3 = new Conta();
        conta3.numero = 3;
        conta3.titular = "Júlio Vaz Clevison";
        conta3.saldo = 1500;
        conta3.limite = 500;

        // Acontecimentos: 
        if (conta3.transfere(conta2, 400)) {
            System.out.println("A transferência ocorreu com sucesso");
            System.out.println("Saldo da conta 3: " + conta3.saldo);
            System.out.println("Saldo da conta 2: " + conta2.saldo);
        } else {
            System.out.println("A transferência foi cancelada por falta de saldo, ou, " +
            "ultrapassagem do limite");
        }
    }
}
class Cliente {
    String nome = "Caio";
}

class Conta {

    int numero;
    String titular;
    double saldo;
    double limite;
    Cliente pessoa = new Cliente();

    boolean saca(double valor) {
        if (this.saldo < valor || this.limite < valor) {
            return false;
        } else {
            double novoSaldo = this.saldo - valor;
            this.saldo = novoSaldo;
            return true;
        }
    }

    void deposita(double valor) {
        double novoSaldo = this.saldo + valor;
        this.saldo = novoSaldo;
    }

    boolean transfere(Conta destino,  double valor) {
        if (this.saldo < valor || this.limite < valor) {
            return false;
        } else {
            double novoSaldo = this.saldo - valor;
            this.saldo = novoSaldo;
            destino.saldo += valor;
            return true;
        }
    } 
}