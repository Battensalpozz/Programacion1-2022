import java.util.ArrayList;
import java.util.List;

public class Assignment8 {
    String[] palabras;
    String primera;
    String ultima;
    String medio ="";
    String nueva_palabra = "";
    String nueva_cadena = "";
    List valores = new ArrayList();

    public Assignment8(String input) {
        palabras = input.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > 3){
                primera = String.valueOf(palabras[i].charAt(0));
                ultima = String.valueOf(palabras[i].charAt(palabras[i].length()-1));
                nueva_palabra += primera;
                medio = ramdonString(palabras[i]);
                nueva_palabra += medio;
                nueva_palabra += ultima;
                nueva_cadena += nueva_palabra + " ";
                nueva_palabra = " ";
            }else{
                nueva_cadena += palabras[i]+ " ";
            }

        }
    }

    public String ramdonString(String text){
        String nuevo;
        String result = "";
        int pos;
        nuevo= text.substring(1,text.length()-1);
        int nChars = nuevo.length();
        List < Integer > pString = new ArrayList<Integer>() ;

        for (int i = 0; i < nChars ; i++) {
            pos = (int) (Math.random() * nChars );
            //pos = ThreadLocalRandom.current().nextInt(1,valorFinal);
            while (pString.contains(pos)) {
                pos = (int) Math.floor(Math.random() * nChars);
                //pos= ThreadLocalRandom.current().nextInt(1,valorFinal);
            }
            pString.add(pos);
            result += nuevo.charAt(pos);
        }
        return  result;
    }

    public String toString() {
        return nueva_cadena;
    }
}