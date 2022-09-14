public class TesteSacaNegativo {

    public static void main(String[] args) {
        
        Conta conta = new Conta();
        
        conta.deposita(100);
        System.out.println("\n" + conta.saca(200));
        System.out.printf("getSaldo():%.2f\n", conta.getSaldo());

        conta.numero = -1673;


    }
    
}
