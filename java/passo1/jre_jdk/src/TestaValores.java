public class TestaValores {

    public static void main(String[] args) {

        int primeiro = 5;
        int segundo = 7;
        segundo = primeiro;
        primeiro = 10;
        System.out.println("Segundo" + segundo);

        char letra = 'a';
        System.out.println("Letra: " + letra);

        char valor = 65;
        System.out.println("Valor: " + valor);

        valor = (char) (valor + 1);
        System.out.println("Valor: " + valor);

        String palavra = "Alura cursos online de tecnologia.";
        System.out.println("Frase: " + palavra);

        palavra = palavra + 2022;
        System.out.println(" Ano: " + palavra);




    }
}
