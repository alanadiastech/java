package javaPilha;

public class FluxoComTratamento{
    
    public static void main(String[] args) {

        System.out.println("\nInício do main");
        try{       
            metodo1();
        }catch(ArithmeticException | NullPointerException | MinhaExcecao e){
            String msg = e.getMessage();
            System.out.println("Exception: " + msg);
            e.printStackTrace();
        }
        System.out.println("Fim do main\n");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Início do método1");
        metodo2();
        System.out.println("Fim do método1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Início do método2");
        
        // throw new ArithmeticException("Erro!");
        throw new MinhaExcecao("Erro!");
        // System.out.println("Fim do método2");
    }

}