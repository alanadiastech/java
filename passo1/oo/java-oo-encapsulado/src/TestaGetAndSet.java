public class TestaGetAndSet {

    public static void main(String[] args) {
        
        Conta conta = new Conta(1673, 115258);

        //conta.numero = 1256;
        // conta.setNumero(1256);
        System.out.println("\nAgência: " + conta.getAgencia() + "\n" + "Número: " + conta.getNumero());    

        Cliente cliente = new Cliente();

        //conta.titular = cliente;
        cliente.setNome("Alana Dias");
        conta.setTitular(cliente);
        System.out.println("Titular: " + conta.getTitular().getNome());

        cliente.setProfissao("Programadora");
        System.out.println("Profissão: " + conta.getTitular().getProfissao());


    }
}
