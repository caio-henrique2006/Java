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
        // Cliente 001:

        Conta conta001 = new Conta();
        Cliente cliente001 = new Cliente();
        Data dataNascimento001 = new Data();
        Data dataAbertura001 = new Data();

        conta001.titular = cliente001;
        conta001.numero = 1;
        conta001.agencia = "Banco do Brasil";
        conta001.dataAbertura = dataAbertura001;

        cliente001.nome = "Caio Henrique Almeida Ferreira Santos";
        cliente001.dataDeNascimento = dataNascimento001;
        cliente001.endereço = "Cidade genêrica";
        cliente001.estadoCivil = "Solteiro";

        dataNascimento001.dia = "01";
        dataNascimento001.mes = "06";
        dataNascimento001.ano = 2006;
        
        dataAbertura001.dia = "07";
        dataAbertura001.mes = "09";
        dataAbertura001.ano = 2018;

        // Cliente 002:
        
        Conta conta002 = new Conta();
        Cliente cliente002 = new Cliente();
        Data dataNascimento002 = new Data();
        Data dataAbertura002 = new Data();

        conta002.titular = cliente002;
        conta002.numero = 1;
        conta002.agencia = "Banco do Brasil";
        conta002.dataAbertura = dataAbertura001;

        cliente002.nome = "Pedro Gabriel Marques Lopes";
        cliente002.dataDeNascimento = dataNascimento002;
        cliente002.endereço = "Cidade de Seabra";
        cliente002.estadoCivil = "Solteiro (provavelmente)";

        dataNascimento002.dia = "02";
        dataNascimento002.mes = "06";
        dataNascimento002.ano = 2006;

        dataAbertura001.dia = "07";
        dataAbertura001.mes = "09";
        dataAbertura001.ano = 2018;
        

        // Testes:
        conta001.dataCount();
        

    }
}

class Cliente {
    
    // Atributos:
    String nome;
    Data dataDeNascimento;
    String endereço;
    String estadoCivil;
}

class Data {

    // Atributos:
    String dia;
    String mes;
    int ano;

    String mostrarData() {
        String text = dia + "/" + mes + "/" + ano;
        return text;
    }
}

class Conta {

    // Atributos:
    Cliente titular;
    int numero;
    private double saldo = 1000.0;
    private double limite = 500.0;
    String agencia;
    Data dataAbertura;

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
        System.out.println("Data de abertura: " + this.dataAbertura.mostrarData());
    }
}