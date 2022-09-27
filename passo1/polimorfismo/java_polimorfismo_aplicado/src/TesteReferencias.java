public class TesteReferencias {

    public static void main(String[] args) {
        
        String nome;

        Gerente g1 = new Gerente();

        g1.setNome("\nAna");
        g1.autentica(11);
        nome = g1.getNome();
        System.out.println("Nome: " + nome);

        Funcionario g2 = new Gerente(); //referência genérica
        // g2.autenticar(); não funciona pois está na classe gerente e não na referência genérica
        g2.setNome("Rafa");
        nome = g2.getNome();
        System.out.println("Nome: " + nome);

        System.out.println("\n****************************\n");

        // Funcionario func = new Funcionario();
        // func.setSalario(3000.00);

        Gerente gerente = new Gerente();
        gerente.setSalario(5000.00);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2000.00);

        Designer dg = new Designer();
		dg.setSalario(2000.00);

        ControleBonificacao cb = new ControleBonificacao();
        // cb.registrarFuncionarios(func);
        cb.registrarFuncionarios(gerente);
        cb.registrarFuncionarios(ev);
        cb.registrarFuncionarios(dg);
        // cb.registrarGerente(gerente);
        // cb.registrarFuncionario(func);
        // cb.registrarEditorVideo(ev);
        // cb.registrarEditorVideo(dg);

        System.out.println(cb.getSoma());

      

     
      
        

       

      
       
       
    }
    
}
