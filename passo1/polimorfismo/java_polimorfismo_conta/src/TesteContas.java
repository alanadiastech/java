public class TesteContas {

    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.00);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.00);

        cc.transfere(40.00, cp);
        cc.saca(10.00);
        
        System.out.printf("\nSaldo Conta Corrente:%.2f\n", cc.getSaldo());
        System.out.printf("Saldo Conta Poupança:%.2f\n", cp.getSaldo());

    }
    
}
