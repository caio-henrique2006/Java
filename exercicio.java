class Exercicios {
    public static void main(String[] args){
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

        int despesaTotal = janeiro+fevereiro+marco;
        double mediaMensal = despesaTotal/3;

        System.out.println("Foi gasto no total: " + despesaTotal);
        System.out.println("A média mensal foi de " + mediaMensal);
    }
}