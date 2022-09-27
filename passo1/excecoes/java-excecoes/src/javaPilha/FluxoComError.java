package javaPilha;

public class FluxoComError {
    
    public static void main(String[] args) {

        System.out.println("\nInício do main");
        try{       
            metodo1();
        }catch(ArithmeticException | NullPointerException e){
            String msg = e.getMessage();
            System.out.println("Exception: " + msg);
            e.printStackTrace();
        }
        System.out.println("Fim do main\n");
    }

    private static void metodo1() {
        System.out.println("Início do método1");
        metodo2();
        System.out.println("Fim do método1");
    }

    private static void metodo2() {
       System.out.println("Chamando método 2");
       metodo2();
       System.out.println("Fim do método 2");
    }
}
