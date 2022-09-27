public class TestaContaSemCliente {

    public static void main(String[] args) {
        
        Conta conta = new Conta();

        System.out.printf("\ngetSaldo():%.2f\n",conta.getSaldo());

        conta.titular = new Cliente();
        System.out.println(conta.titular);

        conta.titular.nome = "Alana";
        System.out.println("Titular: " + conta.titular.nome); 


    }
    
}
