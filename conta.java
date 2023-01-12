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
class Conta {
    public static void main(String[] args) {

        // Clientes & Contas:
        Conta conta001 = new Conta();
        Cliente cliente001 = new Cliente();
        conta001.titular = cliente001;
        cliente001.nome = "Caio Henrique Almeida Ferreira Santos";
        cliente001.dataDeNascimento = "01/06/2006";
        cliente001.endereço = "Cidade genêrica";
        cliente001.estadoCivil = "Solteiro";
        conta001.numero = 0000001;
        conta001.saldo = 1000;
        conta001.limite = 500;
        conta001.agencia = "Banco do Brasil";
        conta001.dataAbertura = "01/06/2006";

        // Testes:
        System.out.println(conta001.titular.nome);


        

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
            return "atingiu limite";
        } else if (valor > saldo) {
            return "saldo insuficiente";
        } else {
            novoSaldo = this.saldo - valor;
            this.saldo = novoSaldo;
        }
    }
}