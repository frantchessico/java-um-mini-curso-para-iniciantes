import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> idades = new ArrayList<Integer>();
        idades.add(29);
        idades.add(23);
        idades.add(50);
        idades.add(38);
        idades.add(40);
        

        System.out.println(idades);

        idades.remove(0);

        System.out.println(idades);

        int idade = idades.get(3);

        System.out.println(idade);

        int arraySize = idades.size();
       System.out.println(arraySize);
    }
}
