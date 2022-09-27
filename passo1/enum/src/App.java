public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Mínimo: " + Thread.MIN_PRIORITY);

        System.out.println("\n\nMáximo: " + Thread.MAX_PRIORITY);


        Thread th = new Thread(() -> System.out.println("\n\nRodando 🎱🎱🎱\n"));

        th.setPriority(Thread.MAX_PRIORITY);

        th.start();

    }
}
