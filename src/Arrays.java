public class Arrays {
    public static void main(String[] args) {
        // Declaração e Inicialização de um Array
        int[] numeros = new int[5];
        System.out.println((numeros));

        int[] meusNumeros = { 1, 2, 3, 4, 5 };
        System.out.println(meusNumeros);

        String[] nomes = new String[3];
        nomes[0] = "Francisco";
        nomes[1] = "Luisa";
        nomes[2] = "Rosa";
        System.out.println(nomes);

        // Acessando e Modificando Elementos do Array:
        int primeiroNumero = meusNumeros[0];
        System.out.println(primeiroNumero);
        String nome1 = nomes[1];
        System.out.println(nome1);

        // Modificando elementos do array
        numeros[2] = 10; // Definindo o terceiro elemento como 10

        // Iterando através de um Array:

        for (int i = 0; i < meusNumeros.length; i++) {
            System.out.println(meusNumeros[i]); // Exibe cada elemento do array
        }

        // Usando um loop for-each para iterar por todos os elementos
        for (String nome : nomes) {
            System.out.println(nome); // Exibe cada nome do array de strings
        }

        /// Comprimento do Array
        int tamanhoDoArray = meusNumeros.length; // Retorna o número de elementos no array
        System.out.println(tamanhoDoArray);

        // Arrays Multidimensionais

        // Declarando e inicializando uma matriz 2D (3x3)
        int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Acessando elementos de uma matriz
        int elemento = matriz[1][2]; // Obtendo o elemento na linha 1 e coluna 2 (valor 6)
        System.out.println(elemento);

    }
}
