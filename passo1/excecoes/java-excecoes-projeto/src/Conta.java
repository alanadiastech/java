public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total=0;

    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("\nTotal de contas: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);
    
    public void saca(double valor){
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("\nSaldo: " + this.saldo + "\nValor a sacar: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino){
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Dados inválidos. Agência com valor abaixo de zero.");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero <=0){
            System.out.println("Dados inválidos. Número de agência menor que zero.");
            return;
        }
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    } 

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
}