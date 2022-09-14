public class TestaLacos {

    public static void main(String[] args) {
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            for (int contador = 0; contador <= 10; contador++) {
                System.out.print(multiplicador * contador);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n******************************************************************\n");

        for (int multiplicador = 1; multiplicador <= 20; multiplicador++) {
            for(int contador = 0; contador <= 20; contador++) {
                System.out.print(multiplicador * contador);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n*************************************************************************\n");

        for (int linha = 0; linha < 10; linha++) {
            for(int coluna = 0; coluna <= linha; coluna++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
