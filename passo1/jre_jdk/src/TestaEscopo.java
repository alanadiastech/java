public class TestaEscopo {

    public static void main(String[] args) {

        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;

        boolean acompanhado;

        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("Valor de acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }

        System.out.println("\n********************************\n");

        int idade2 = 20;
        int quantidadePessoas2 = 3;
        boolean acompanhado2;

        if (quantidadePessoas2 >= 2) {
            acompanhado2 = true;
        }else {
            acompanhado2 = false;
        }

        if (idade >=18 || acompanhado2){

            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }

    }
}
