public class Casting {
    public static void main(String[] args) {
        //Casting implicito
        int idade = 27;
        double idade2 = idade;

       //Casting Explicito
       idade = (int) idade2;

       //Castint de String
       char letra = 'b';
        String nome = String.valueOf(letra);
        letra = nome.charAt(0);

        //Int to String

        String string = String.valueOf(idade);

        //String of number to Int
        String value = "23";
        idade = Integer.parseInt(value);
    }
}
