class Fibonacci {
    public static void main(String[] args){
        int x = 1;
        int y = 1;
        int resultadoAtual = 1;
        int tamanhoDaSerie = 10;
        System.out.println(resultadoAtual);
        for(int i = 0; i <= tamanhoDaSerie; i++){
            System.out.println(resultadoAtual);
            resultadoAtual = x+y;
            y = x;
            x = resultadoAtual;
        }

    }
}