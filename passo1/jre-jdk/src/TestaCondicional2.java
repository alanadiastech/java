public class TestaCondicional2 {

    public static void main(String[] args) {

        System.out.println("Testando condicionais.");
        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        System.out.println("Valor de acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }

        System.out.println("\n*********************************************\n");

        int idade2 = 16;
        int quantidadePessoas2 = 3;

        if (idade2 >=18 || quantidadePessoas2 >=2){
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }

        System.out.println("\n*********************************************\n");

        int idade3 = 16;
        int quantidadePessoas3 = 3;
        boolean acompanhado3 = true;

        if (idade3 >= 18 || quantidadePessoas3 >= 2){
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }

        System.out.println("\n*********************************************\n");

        int idade4 = 16;
        int quantidadePessoas4 = 3;
        boolean acompanhado4 = quantidadePessoas4 >= 2;

        if (idade4 >=18 && acompanhado4){

            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }
    }
}
