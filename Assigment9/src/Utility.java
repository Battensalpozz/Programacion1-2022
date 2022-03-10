public class Utility {
    public static String[] Repeated(String frase) {
        String palabras[] = frase.split(" ");
        String palabrasB[] = frase.split(" ");

        int cantidad = palabras.length;
        String resultado = "";
        int contadorMasRepet = 0;

        for (int i = 0; i < cantidad; i++) {
            int contador = 0;
            String palabra = palabras[i];

            for (int j = 0; j < cantidad; j++) {

                if (palabra.equalsIgnoreCase(palabrasB[j])) {
                    contador++;
                    palabras[j] = "";
                }
            }

            if ((contador > 1) && (contador > contadorMasRepet)) {
                resultado = palabra;
                contadorMasRepet = contador;
                //System.out.print(palabras[i]);
            } else if ((contador > 1) && (contador == contadorMasRepet)) {
                resultado += " " + palabra;
            }
        }
        if (resultado == "")
            resultado = "No hay palabra repetida";
        String[] encontrado = {resultado, String.valueOf(contadorMasRepet)};
        return encontrado;
    }

    //el número de veces que se repite cada palabra en una oración.
    public static String[] RepeatedWords(String frase) {
        String [] Bpalabras = frase.split(" ");
        String [] BpalabrasB = frase.split(" ");
        String [] Bsummary = new String[Bpalabras.length];
        //String Bresultado = "";
        int tam = 0;
        for (int i = 0; i < Bpalabras.length; i++) {
            int contador = 0;
            Bsummary[i] = Bpalabras[i];
            //Bresultado += Bpalabras[i];

            String palabra = Bpalabras[i];

            for (int j = 0; j < Bpalabras.length; j++) {

                if (palabra.equalsIgnoreCase(BpalabrasB[j])){
                    contador++;
                    Bpalabras[j] = "";

                }
            }
            if (contador>0){
                //Bresultado += " "+contador+"\n";
                tam ++;
                Bsummary[i] = Bsummary[i] + ","+ contador;
            }
        }
        String [] summary2 = new String[tam];
        for(int i=0; i< tam; i++){
            summary2[i] = Bsummary[i];
        }
        return summary2;
    }
}