public class TesteGerente {
    
    public static void main(String[] args) {
   
        boolean autenticou;

        Gerente g1 = new Gerente();

        g1.setNome("Ana");
        g1.setCpf("000.000.000-00");
        g1.setSalario(5000.00);

        System.out.printf("\nNome:%s\nCPF:%s\nSalário:%.2f\nBonificação:%.2f\n", g1.getNome(), g1.getCpf(), g1.getSalario(), g1.getBonificacao());

        g1.setSenha(1111);
        autenticou = g1.autentica(1111);
        System.out.println("Autenticou? " + autenticou);

        Gerente g2 = new Gerente();

        g2.setNome("Rafa");
        g2.setCpf("111.111.111-11");
        g2.setSalario(5000.00);

        System.out.printf("\nNome:%s\nCPF:%s\nSalário:%.2f\nBonificação:%.2f\n", g2.getNome(), g2.getCpf(), g2.getSalario(), g2.getBonificacao());

        g2.setSenha(1112);
        autenticou = g2.autentica(1111);
        System.out.println("Autenticou? " + autenticou);
    }
}
