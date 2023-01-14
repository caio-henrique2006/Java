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
}
class Carro {
    private Motorista motorista;
    private String modelo;
    private String cor;
    private String estado;
    private double potencia;
    private double velocidadeAtual;
    private double velocidadeMaxima;

    Carro(Motorista motorista, String modelo, double velocidadeMaxima,
    String cor, String estado, double potencia, double velocidadeAtual) {
        this.motorista = motorista;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.cor = cor;
        this.estado = estado;
        this.potencia = potencia;
        this.velocidadeAtual = velocidadeAtual;
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
        retorno = "O estado do carro está " + this.estado;
        return retorno;
    }

}