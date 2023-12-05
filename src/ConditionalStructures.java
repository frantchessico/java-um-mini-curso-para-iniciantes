public class ConditionalStructures {
    public static void main(String[] args) {
        int idade = 1;

        if(idade > 18) {
            System.out.println("Maior de idade");
        } else if(idade == 13) {
            System.out.println("Vai para escola");
        } else {
            System.out.println("Não atende os padrões");
        }
    }
}
