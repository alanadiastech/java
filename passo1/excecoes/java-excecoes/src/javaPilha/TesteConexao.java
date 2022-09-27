package javaPilha;

public class TesteConexao {

    public static void main(String[] args) {

        try(Conexao conexao = new Conexao()){
            conexao.lerDados();
        }catch(Exception ex){
            System.out.println("Erro na Conexão !");
        }

//*********************************************************

        // Conexao con = null;
        // try{
        //     con = new Conexao();
        //     con.lerDados();
        // } catch(Exception exception){
        // System.out.println("Erro na conexão!");
        // }finally{
        //     System.out.println("finally");
        //     if(con != null){
        //     con.close();
        //     }
        // }
    }
}
