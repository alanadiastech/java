public class SistemaInterno {

    private int senha = 111;

    public void autentica(AutenticavelInterface fa) {
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou){
            System.out.println("\nAutenticação válida!");
        }else{
            System.out.println("\nAutenticação inválida!");
        }
    }
    
}
