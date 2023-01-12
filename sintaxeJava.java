
class MeuPrograna {
    public static void main(String[] args){

        /*
        Somethings:
        . labeled loops (break inner;)
        
        */ 
        // Tipos de variaveis:
        int inteiro = 10;
        double inteiroEfloat = 10.5; // Aceita tanto inteiro como float
        char umCaractere = 'a'; // Armazena apenas 1 caractere (Aspas simples)
        float numeroReal = 2.5f;
        String texto = "Texto grande";
        String respostaIFELSE;
        boolean valorLogico = true;

        // Casting (Maneira de moldar um tipo de dado em outro)
        double numeroQuebrado = 25.34534;
        int numeroInteiro = (int) numeroQuebrado;

        // Casting com double e float:
        double d1 = 5;
        float d2 = 2.5f;
        float resultado = d2 + (float) d1;

        // Sintaxe IF ELSE:
        System.out.println("\nSINTAXE IF ELSE:");
        int idade = 10;
        if(idade >= 18){ //  && || !
            respostaIFELSE = "Pode entrar";
        } else {
            respostaIFELSE = "Não pode entrar";
        }
        System.out.println(respostaIFELSE);

        // Sintaxe WHILE:
        System.out.println("\nSINTAXE WHILE:");
        int quantidade = 5;
        while(quantidade >= 0){
            System.out.println(quantidade + " vezes");
            quantidade -= 1;
            // break; continue;
        }

        // Sintaxe FOR:
        System.out.println("\nSINTAXE FOR:");
        for (int i = 0; i < 5; i++){
            System.out.println(i + " vezes");
        }

        // Sintaxe DO WHILE:
        System.out.println("\nSINTAXE DO..WHILE:");
        int Qdowhile = 0;
        do{
            Qdowhile += 1;
            System.out.println(Qdowhile);
        }while(Qdowhile < 5);

        // Sintaxe do Switch:
        System.out.println("\nSINTAXE SWITCH:");
        int Qswitch = 2;
        switch(Qswitch){
            case 0:
                System.out.println("A quantidade é 0");
                break;
            case 1:
                System.out.println("A quantidade é 1");
                break;
            case 2:
                System.out.println("A quantidade é 2");
                break;
            default:
                System.out.println("É acima de 2");
        }

    }
}