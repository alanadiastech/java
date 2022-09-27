
//contrato Autenticavel
//quem assinar esse contrato precisa implementar
//metodo setSenha
//metodo autentica

public abstract interface AutenticavelInterface {
   
    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
    
}
