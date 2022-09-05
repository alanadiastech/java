public class TestaWhile {

    public static void main(String[] args) {
        int contador = 0;
        System.out.println("Contador igual a zero e menor ou igual a 10:" );
        while(contador <= 10) {
            System.out.println(contador);
            contador = contador + 1;
        }
        System.out.println("Contador mais 1: " +  contador);

        System.out.println("\n****************************************\n");

        int contador2 = 0;
        while(contador2 <= 10) {
            System.out.println("Resultado: " + contador2);
            contador2++;
        }
    }
}
