public class ControleBonificacao {
    
    private double soma;

    public void registrarFuncionarios(Funcionario func){
        double bonificacao = func.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    // public void registrarGerente (Gerente g){
    //     double bonificacao = g.getBonificacao();
    //     this.soma = this.soma + bonificacao;
    // }

    // public void registrarFuncionario(Funcionario f){
    //     double bonificacao = f.getBonificacao();
    //     this.soma = this.soma + bonificacao;
    // }

    // public void registrarEditorVideo(EditorVideo ev){
    //     double bonificacao = ev.getBonificacao();
    //     this.soma = this.soma + bonificacao;
    // }

    public double getSoma() {
        return soma;
    }
}
