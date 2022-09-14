public class TestaBanco {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();

        cliente.nome = "Alana Dias";
        cliente.cpf = "999.999.999-99";
        cliente.profissao = "Programadora";

        Conta conta = new Conta();
        conta.deposita(100);

        conta.titular = cliente;
        System.out.println("\nTitular: " + conta.titular.nome);
        System.out.println("\nCPF: " + conta.titular.cpf);
        System.out.println("\nProfissão: " + conta.titular.profissao);


    }
    
}
