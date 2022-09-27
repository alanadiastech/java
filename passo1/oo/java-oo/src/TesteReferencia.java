public class TesteReferencia {

    public static void main(String[] args) {
        //conta1 -> referência
        Conta conta1 = new Conta();
        conta1.saldo = 300;
        System.out.printf("\nsaldo conta1: %.2f\n", conta1.saldo);

        Conta conta2 = conta1;
        System.out.printf("\nsaldo conta2: %.2f\n", conta2.saldo);

        conta2.saldo += 100;
        System.out.printf("\nsaldo conta2: %.2f\n", conta2.saldo);

        System.out.printf("\nsaldo conta1: %.2f\n", conta1.saldo);

        if(conta1 == conta2){
            System.out.println("\nContas iguais.\n");
        }else{
            System.out.println("\nContas distintas.\n");
        }

        //conta1, conta2 são referências para o mesmo objeto
        System.out.println(conta1);
        System.out.println(conta2);




    }
}