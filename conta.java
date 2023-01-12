/*
Conta:
    Atributos:
        nome do titular;
        numero da conta;
        saldo;
        limite;
        agência bancária;
        data de abertura;
    Métodos:
        Sacar e depositar;
        Calcula Rendimento;
        Imprimi informações da conta;

Cliente:
    Atributos:
        nome;
        dataDeNascimento;
        Endereço; 
        EstadoCivil;
*/
class ContasEClientes {
    public static void main(String[] args) {

        // Clientes & Contas:
        Conta conta001 = new Conta();
        Cliente cliente001 = new Cliente();
        conta001.titular = cliente001;
        cliente001.nome = "Caio Henrique Almeida Ferreira Santos";
        cliente001.dataDeNascimento = "01/06/2006";
        cliente001.endereço = "Cidade genêrica";
        cliente001.estadoCivil = "Solteiro";
        conta001.numero = 1;
        conta001.saldo = 1000.0;
        conta001.limite = 500.0;
        conta001.agencia = "Banco do Brasil";
        conta001.dataAbertura = "29/07/2018";

        // Testes:
        conta001.dataCount();
        

    }
}

class Cliente {
    
    // Atributos:
    String nome;
    String dataDeNascimento;
    String endereço;
    String estadoCivil;
}

class Conta {

    // Atributos:
    Cliente titular;
    int numero;
    double saldo;
    double limite;
    String agencia;
    String dataAbertura;

    // Métodos:
    String saca(double valor) {
        if(valor > limite) {
            return "Abortando operação: Limite de saque atingido...";
        } else if (valor > saldo) {
            return "Abortando operação: Saldo insuficiente...";
        } else {
            double novoSaldo = this.saldo - valor;
            this.saldo = novoSaldo;
            return "Operação bem sucedida";
        }
    }
    String deposita(double valor) {
        double novoSaldo = this.saldo + valor;
        this.saldo = novoSaldo;
        return "Operação bem sucedida";
    }
    void dataCount() {
        System.out.println("Titular: " + this.titular.nome);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Limite de saque: " + this.limite);
        System.out.println("Agência responsável: " + this.agencia);
        System.out.println("Data de abertura: " + this.dataAbertura);
    }
}