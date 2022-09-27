

public class TesteSaca {
    
    public static void main(String[] args) {
    
        Conta conta = new ContaCorrente(123,321);

        conta.deposita(200.00);

        try{
            conta.saca(220.00);
            System.out.println(conta.getSaldo());
        }catch(SaldoInsuficienteException exception){
            System.out.println("Demonstrativo: " + exception.getMessage());
        }
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
