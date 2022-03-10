import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Ejercicio 2
        //Realice un programa que busque en una oración la palabra que más se repita utiliza métodos estáticos

        final String[] Ac = Utility.Repeated("This is a repeated word test this is a A");
        System.out.println(Arrays.toString(Ac));//Should print [a, 3]
        final String[] Ac1 = Utility.Repeated("This is a repeated word test this this this this this this");
        System.out.println(Arrays.toString(Ac1));//Should print [this, 7]
        final String[] Ac2 = Utility.Repeated("This is a repeated word test this word word word");
        System.out.println(Arrays.toString(Ac2));//Should print [word, 4]

        //Ejercicio 3
        //Realice un programa que muestre el número de veces que se repite cada palabra en una oración.
        final String[] Bc = Utility.RepeatedWords("This is a repeated word test this is a A");
        System.out.println(Arrays.toString(Bc)); //Should print [this,2,is,2,a, 3, repeated,1, word,1,test,1]
        final String[] Bc1 = Utility.RepeatedWords("This is a repeated word test this this this this this this");
        System.out.println(Arrays.toString(Bc1)); //Should print [this,7,is,1,a, 1, repeated,1, word,1,test,1]
        final String[] Bc2 = Utility.RepeatedWords("This is a repeated word test this word word word");
        System.out.println(Arrays.toString(Bc2)); //Should print [this,2,is,1,a, 1, repeated,1, word,3,test,1]

    }
}
