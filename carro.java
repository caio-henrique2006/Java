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
        Carro carroCaio = new Carro(Caio, "Pálio", 270, "azul", "ruim", 10);

        System.out.println(carroCaio.acelerar());

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

    Carro(Motorista motorista, String modelo, double velocidadeMaxima,
    String cor, String estado, double potencia) {
        this.motorista = motorista;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.cor = cor;
        this.estado = estado;
        this.potencia = potencia;
    }

    String getCarro() {
        String retorno = ("Motorista: " + motorista.getNome() +
        "\nModelo: " + this.modelo +
        "\nVelocidade Máxima: " + this.velocidadeMaxima +
        "\nCor: " + this.cor +
        "\nEstado: " + this.estado +
        "\nPotência: " + this.potencia + " cavalos");
        return retorno;
    }

    String acelerar() {
        if(velocidadeAtual < velocidadeMaxima) {
            this.velocidadeAtual += 10;
            String retorno = "Velocidade Atual: " + velocidadeAtual;
            return retorno;
        } else {
            String retorno = "Velocidade máxima atingida: ", velocidadeMaxima;
            return retorno;
        }
    }

    String desacelerar() {
        if(velocidadeAtual > 0) {
            this.velocidadeAtual -= 10;
            String retorno = "Velocidade Atual: " + velocidadeAtual;
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