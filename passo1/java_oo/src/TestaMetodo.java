public class TestaMetodo {

    public static void main(String[] args) {
        
        Conta contaDaAna = new Conta();

        contaDaAna.saldo = 100;
        contaDaAna.deposita(50);
        System.out.printf("\nsaldo da Ana: %.2f\n",contaDaAna.saldo);

        boolean sacou; 

        sacou = contaDaAna.saca(50);
        System.out.printf("\nsaldo da Ana: %.2f , %s\n", contaDaAna.saldo, sacou);
       
        sacou = contaDaAna.saca(150);
        System.out.printf("\nsaldo da Ana: %.2f , %s\n", contaDaAna.saldo, sacou);

        Conta contaDaRafa = new Conta();

        boolean transferiu;

        contaDaRafa.deposita(1000);
        transferiu = contaDaRafa.transfere(500, contaDaAna);
        System.out.printf("\nConta da Rafa: %.2f, %s\n", contaDaRafa.saldo, transferiu);

        transferiu = contaDaRafa.transfere(1500, contaDaAna);
        System.out.printf("\nConta da Rafa: %.2f, %s\n", contaDaRafa.saldo, transferiu);

        System.out.printf("\nsaldo da Ana: %.2f \n", contaDaAna.saldo);

    }
    
}
