public class TestaValores {
    
    public static void main(String[] args) {
        
        Conta conta = new Conta(1673,115258);

        System.out.println("\nAgência: " + conta.getAgencia() + "\n" + "Número: " + conta.getNumero() + "\n");

        Conta conta2 = new Conta(1673,115259);

        System.out.println("\nAgência: " + conta2.getAgencia() + "\n" + "Número: " + conta.getNumero() + "\n");

        //Conta está inconsistente
        // conta.setAgencia(-50);
        // System.out.println(conta.getAgencia());
        // conta.setNumero(-1673);
        // System.out.println(conta.getAgencia());

        // conta.setNumero(1673);
        // System.out.println(conta.getAgencia());

    }
}
