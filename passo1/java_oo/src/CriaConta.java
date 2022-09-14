public class CriaConta {

    public static void main(String[] args) {
        
        Conta conta1 = new Conta();

        conta1.deposita(200);
        System.out.printf("\n%.2f",conta1.saldo);

        conta1.deposita(100);
        System.out.printf("\n%.2f",conta1.saldo);

        Conta conta2 = new Conta();

        conta2.deposita(50);
        System.out.printf("\n%.2f\n\n",conta2.saldo);

        System.out.println("saldo conta 1: " + conta1.saldo);
        System.out.println("Agência: " + conta1.agencia + "\n");

        System.out.println("saldo conta 2: " + conta2.saldo);
        System.out.println("Agência: " + conta2.agencia + "\n");

        conta2.agencia = 1679;
        System.out.println("Agência: " + conta2.agencia + "\n");




    }
    
}
