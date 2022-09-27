public class TesteFuncionario {

    public static void main(String[] args) {
        
        // Funcionario func = new Funcionario();

        Gerente func = new Gerente();

        func.setNome("Alana Dias");
        func.setCpf("111.111.111-11");
        func.setSalario(2500.00);

        System.out.println("\nNome: " + func.getNome());
        System.out.printf("Bonificação:%.2f\n" , func.getBonificacao());

        Cliente cliente = new Cliente();
    }
    
}
