/* 
    Class Motorista:
        Nome;
        DataNascimento;
        Habilitado;

    Class Carro:
        Motorista;
        Modelo;
        Cor;
        Estado;
        velocidadeAtual;

        Acelerar();
        Desacelerar();
        Mecânico();

    Class Moto:
        Motorista;
        Modelo;
        Cor;
        Estado;

        Acelerar();
        Desacelerar();
        Mecânico();

*/
class Estrada {
    public static void main(String[] args) {

        Motorista Caio = new Motorista("Caio Henrique Almeida Ferreira Santos", "01/06/2006", true);
        Carro carroCaio = new Carro(Caio, "Pálio", 270, "azul", "bom", 40);
        Carro carroCaio1 = new Carro(Caio, "Gol", 240, "preto", "bom", 10);
        //Carro carroCaio2 = new Carro(Caio, "Ford", 260, "vermelho", "bom", 10);
        Carro carroCaio3 = new Carro(Caio, "Mercedes", 150, "branco", "bom", 5);

        System.out.println(Carro.getTotalCarros());

    }
}


class Motorista {
    private String nome;
    private String dataNascimento;
    private boolean habilitado;

    Motorista(String nome, String dataNascimento, boolean habilitado) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.habilitado = habilitado;
    }
    String getNome() {
        return this.nome;
    }
}
class Carro {
    private Motorista motorista;
    private String modelo;
    private String cor;
    private String estado;
    private double potencia;
    private double velocidadeAtual = 0;
    private double velocidadeMaxima;
    static int totalCarros;
    static int quantidadeKilometroRodado;

    Carro(Motorista motorista) {
        this.motorista = motorista; // Segundo construtor;
    }

    Carro(Motorista motorista, String modelo, double velocidadeMaxima,
    String cor, String estado, double potencia) {
        this(motorista); // Chamando o contrutor que foi inicializado acima;
        Carro.totalCarros += 1; // Somando no atributo static;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.cor = cor;
        this.estado = estado;
        this.potencia = potencia;
    }

    static String getTotalCarros() { // Método static, não é preciso iniciar o construtor para ele funcionar
        String retorno = "Total de carros adquiridos: " + Carro.totalCarros;
        return retorno;  // Use Carro.getTotalCarros();
    }

    String getCarro() {
        String retorno = ("Motorista: " + motorista.getNome() +
        "\nModelo: " + this.modelo +
        "\nVelocidade Máxima: " + this.velocidadeMaxima +
        "\nCor: " + this.cor +
        "\nEstado: " + this.estado +
        "\nPotência: " + this.potencia + " cavalos" +
        "\nTotal de carros: " + Carro.totalCarros +
        "\nQuantidade de velocidade rodado: " + Carro.quantidadeKilometroRodado);
        return retorno;
    }

    String setEstado(String estado) {
        this.estado = estado;
        return this.estado;
    }

    String acelerar() {
        if(velocidadeAtual < velocidadeMaxima) {
            this.velocidadeAtual += this.potencia;
            Carro.quantidadeKilometroRodado += this.velocidadeAtual; 
            String retorno = "Velocidade Atual: " + this.velocidadeAtual;
            return retorno;
        } else {
            String retorno = "Velocidade máxima atingida: " + this.velocidadeMaxima;
            return retorno;
        }
    }

    String desacelerar() {
        if(velocidadeAtual > 0) {
            this.velocidadeAtual -= this.potencia;
            Carro.quantidadeKilometroRodado += this.velocidadeAtual;
            String retorno = "Velocidade Atual: " + this.velocidadeAtual;
            return retorno;
        } else {
            String retorno = "O carro está parado !!!";
            return retorno;
        }
    }

    String mecanico() {
        this.estado = "Bom";
        String retorno = "O estado do carro está " + this.estado;
        return retorno;
    }

}