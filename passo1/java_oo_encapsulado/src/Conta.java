public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        total++;
        System.out.println("\nTotal de contas: " + total);
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }
            return false;
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita((valor));
            return true;
        }
            return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    } 
}
