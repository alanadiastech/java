public class CalculadorImposto {
    
    private double totalImposto;

    public void registra(Tributavel tr){
        double valor = tr.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
