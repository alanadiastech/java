public class TestaSomatoria {

    public static void main(String[] args) {
        int contador = 0;
        int total = 0;

        while (contador <= 10) {
            total = total + contador;
            contador++;
        }
            System.out.println("Total: " + total);

        System.out.println("\n*********************************************\n");

        int contador1 = 0;
        int total1 = 0;

        while(contador1 <= 10) {

            total1 = total1 + contador1;

            System.out.println("Total: " + total1);
            contador1++;
        }
    }
}
