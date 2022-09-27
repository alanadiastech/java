public class TesteFuncionarioTeste {

    public static void main(String[] args) {
        
        FuncionarioTeste ft1 = new FuncionarioTeste();

        ft1.setSalario(3000.00);
        System.out.printf("\nTipo de funcionário:%s\nBonificação:%.2f \n",ft1.getTipo(), ft1.getBonificacao());

        FuncionarioTeste ft2 = new FuncionarioTeste();

        ft2.setTipo(1);
        ft2.setSalario(5000.00);
        System.out.printf("\nTipo de funcionário:%s\nBonificação:%.2f \n",ft2.getTipo(), ft2.getBonificacao());

        FuncionarioTeste ft3 = new FuncionarioTeste();

        ft3.setTipo(2);
        ft3.setSalario(7000.00);
        System.out.printf("\nTipo de funcionário:%s\nBonificação:%.2f \n",ft3.getTipo(), ft3.getBonificacao());


    }
    
}
